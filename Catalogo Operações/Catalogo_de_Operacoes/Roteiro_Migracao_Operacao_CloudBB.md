![ahome](Catalogo_de_Operacoes/imagens/Voltar_ahome.png)[**Voltar para página do Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)  

![image](/uploads/fed6eb8b1f008fd99dea745b27b7c844/image.png)

# **Roteiro de Migração de Operações pra CloudBB**  <h1>


**Este roteiro visa orientar a migração de operações pra CloudBB e as equipes envolvidas são: Equipe responsável pela Operaçao a ser migrada, a Gesit42 e a Equipe AS - Atendimento. Em relação aos ambientes de processamento, há dois movimentos: o primeiro a ser efetuado nos ambientes de desenvolvimento e homologação em conjunto com a Equipe da As e o segundo, migração para produção, será feito em conjunto com a equipe da GESIT42, após finalização dos testes pelas equipes de desenvolvimento da operação nos ambientes desenvolvimento e homologação.**

## A migração será realizada em conjunto entre as equipes, pelos seguintes passos:

#### **1º Passo** - **A Equipe responsável pela Operação deve abrir issue, com manifestação favorável de responsável pela sigla no DPR.**  

####  [Na issue serão solicitadas as seguintes informações, e recomendamos usar o modelo de issue de migração pra CloudBB, através do link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues/new?issue%5Bassignee_id%5D=&issue%5Bmilestone_id%5D=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues/new?issue%5Bassignee_id%5D=&issue%5Bmilestone_id%5D=#).
  
 |**Obrigatoriedade**|**Informação Solicitada**|**Descrição** |
| ------| ------ | ------ |
|**Obrigatório**| **Código da Aplicação na CloudBB**| Deve ser informado o código da aplicação que passará a prover a operação na CloudBB.|  
|**Obrigatório**| **Nome da  Aplicação na CloudBB**| Deve ser informado o nome da aplicação que passará a prover a operação na CloudBB. |  
|**Obrigatório**| **Aplicação está criada em produção?**| Informar se a aplicação ClouBB já está em produção|
|**Obrigatório**| **Operação Usa Autorizador de Processamento pelo ATO?**| Deve ser informado se a operação usa o recurso de controle de segurança do ATO. Caso queira, pode-se verificar se a operação está relacionada neste [arquivo](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Arquivos_Suporte/Opera%C3%A7%C3%B5es__controle_sistema_ato.xlsx), sendo a operação localizada entre as colunas 1 e 21 e a respectiva versão entre as colunas de 22 a 25.  Lembre-se de verificar na coluna 54 se a operação ainda é controlada pelo ATO, pois se estiver com o valor "N", não está sendo mais controlada pelo mesmo.|
|**Obrigatório**| **Em relação aos controles de segurança, pode ser migrada?**| **1º - Pode ser convertida** se a operação é consumida somente por meio do Cyborg.
| | | **2ª - Não pode ser convertida: a)** Tendo qualquer um dos três atributos vinculados a operação: "Código da Transação de Acesso", Nivel de Autenticação" ou "Nivel de Autorização", e/ou valida o usuário logado por meio dos containers **PRM-INF-OPRD** e **ATC-CTX-SGCA**, a operação **NÃO** poderá ser migrada|
| | | **3ª - Não pode ser convertida: a)** valida o usuário logado por meio dos containers **PRM-INF-OPRD** e **ATC-CTX-SGCA**.|
|**Obrigatório**| **Principal Canal consumidor** | Informar qual o principal canal consumidor da Operação, exemplo: Plaforma; APF Web e Mobile; Demais Canais, PIX; APJ Web e Mobile, OpenBanking |
|Desejável| **Volumetria diária de execução da operação**| Volume diário de execução da operaçao. | 
|Desejável| **Período e horário(s) de maior execução em produção**| Deve ser informado o período e horário(s) de maior execução da operação em produção.  |
|Desejável| **Período e horário(s) de menor execução em produção**| Deve ser informado o período e horário(s) de menor execução da operação em produção.  | 
|Opcional| **Alguma observação importante para a realização da Migração?**| Informação adicional e a critério do desenvolvedor | 
|Opcional| **Contatos Adicionais**| Informar contatos adicionais, em caso de ausência do solicitante. | 




#### **2º Passo** -   Verificar se os consumidores da operação a ser migrada utilizam IIB-Driver (JEE) ou FTW.

**IMPORTANTE! Apenas consumidores com IIB Driver conseguem sensibilizar o transporte, que para operações providas na CloudBB devem usar o EMS. Já o FTW consumirá a operação através do transporte Rendezvous que não possui suporte na Cloud**.

## Executar a consulta SQL, que expõe o consumo da operação via Rendezvous

select to_char(A.dt_rqsc, 'dd/mm/yyyy HH24:mi'), A.id_oprc, A.vrs_oprc, B.end_ip, B.dcr_cnxo_rv, B.nr_pid, A.sis_csmo, count(*)
from tmp_rpst_tran A, cnxo_rv_rmt B  
where A.dt_rqsc > sysdate -interval '24' hour  
and B.dt_reg > sysdate -interval '24' hour  
and A.id_cnxo_rv = B.id_cnxo_rv  
and A.id_oprc = 3672372  
group by to_char(A.dt_rqsc, 'dd/mm/yyyy HH24:mi'), A.id_oprc, A.vrs_oprc, B.end_ip, B.dcr_cnxo_rv, B.nr_pid, A.sis_csmo  
order by 1 desc;  

##### Notação das origens de consumo da operação:
a) FTW - Significa migrar para nuvem, mas será consumido via Rendezvous – sem suporte - (consumo mais excessivo).  
b) JEE – IIBDriver - Plataforma   
c) CICs - Mainframe  
  
  
## **3º Passo:** Efetivar dentro do catálogo de operações as alterações em desenvolvimento e Homologação

##### 1º - **Na Propriedade “Roteamento”**, informar qual o principal canal consumidor.  
     
![image](/uploads/72740e2d827de3c04aaeb87c37ca73ff/image.png)     


##### 2º - **Na Propriedade "Provedor"**:  
- Alterar valor do campo "Plataforma" de Mainframe CICs para **High End**
- Alterar valor do campo "Rede" para **RVB-440**  

![image](/uploads/9937aa284b513f494c1def5ab15a8a72/image.png)  

##### 3º **Na Propriedade "Integração Baixa Alta":**  

 - No campo "Forma de retorno" - alterar para **EEM-SRV-IIB**  

![image](/uploads/ff6f19fbf15bd5c32064cdeb80039e24/image.png)    

##### 4º - Incluir os tópicos de Requisição e de Resposta

**RQSC - QE.EMS.IIB.BB.BSB.JEE.SIGLA.RQ.OPR.vs**

**RSPT - QE.EMS.IIB.BB.BSB.CIC.RP.1**  

![image](/uploads/1d6947f164c19d72aca280d9d883c092/image.png)  


##### 5º - Atualizar aplicação provedora pela que foi informada na ISSUE. [**Veja aqui como fazer a nova vinculação.**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Aplicacoes/como_vincular_operacao_aplicacao.md)  


## Atenção! Após atualizar a aplicação provedora **não** esquecer de publicar os caches em Desenvolvimento e Homologação nas plataformas Alta e Baixa dentro do Catálogo de Operações!


**6º - Migração em produção - Realizada mediante RLB em conjunto com a equipe da GESIT41 e a data e horário serão definidos com base na volumetria e na janela de acionamento da operação.**


### Importante! Caso a propriedade mencionada não esteja configurada, basta clicar em "Editar Operação" => "Configurações Avançadas" => “Incluir Propriedade”.  

![image](/uploads/c7ff471c2fb500746cfacd2077ad1072/image.png)  
![image](/uploads/3ffdf36190f9a327d8fdc35431367bf6/image.png)  
![image](/uploads/bc0f2b7b6547ce01aab8343b9799acd0/image.png)  


