![ahome](Catalogo_de_Operacoes/imagens/Voltar_ahome.png)[**Voltar para página do Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)  

![Banner_31](/uploads/6eee5f24c4f6b5a6f9e8dff8d8d78fce/Banner_31.png)


#### Atenção: Os tratamentos descritos nesta página, serão válidos a partir de Março/22.

**Esta página contém as seguintes informaçoes:**
1. Critérios passíveis de tratamento de exceção.
2. Descrição do processo de autorização de exceção em Operações.
3. Divulgação aos responsáveis pelas exceções vencidas e a vencer, com solicitação de correção ou baixa por gestão.
4. Orientação sobre a correção ou baixa por gestão de exceções.
  
<br>

## 1. Critérios passíveis de tratamento de exceção.

* **Informação Sensível de segurança, com token de segurança disponível no barramento IIB** - descrição do critério no [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criterios_de_valida%C3%A7%C3%A3o.md).
   
* **Informação Sensível de segurança – Cloud BB** - prazo de contagem da exceção suspenso. Descrição do critério no [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criterios_de_valida%C3%A7%C3%A3o.md).

* **Mensagem ao Cliente**  - descrição do critério no [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criterios_de_valida%C3%A7%C3%A3o.md).


<br>


##  2. Descrição do processo de Autorização de Exceção em Operações

Considerando que a operação não atende os critérios exigidos, é necessário que seja autorizado tratamento de exceção para que a operação seja aprovada pela AS.
O processo de autorização é formal e por isso é necessário registrar os respectivos "de acordos", bem como os critérios que não estão sendo atendimento, no momento da aprovação da operação pela AS.

Para isso é necessário solicitar via [ISSUE](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues),
que deverá ter o "de acordo" do(s) gerente(s) de soluções da(s) sigla(s) solicitante(s) cadastrado(s) no sistema DPR.

Se acatado o pedido de exceção, a operação será aprovada e a partir do momento em que for disponibilizada em produção inicia-se a contagem do prazo de 60 dias para regularização da mesma.

```ruby
"Obs.: Operações aprovadas em caráter de exceção podem impactar no indicador CEV 
caso não seja feito o ajuste no prazo informado anteriormente."
```
<br>



## 3. Divulgação aos responsáveis pelas exceções vencidas e a vencer, com solicitação de correção ou baixa por gestão:

### Operação com Exceção a vencer <p> 
- Mensalmente - AS enviará comunicado ao Gerente de Soluções ou Especialista II, responsáveis pela Sigla da Operação no DPR, com as operações em exceções a vencer dos próximos meses, em ordem crescente por data.<p>
         -  e-mail será enviado até 5 dias antes do fim do mês corrente;<p>
         -  o e-mail terá a exceção e orientação para correção ou baixa da mesma.<p>

 - Havendo retorno das equipes: <p>
         - AS - Verifica a correção e executa baixa da exceção, caso contrário, retornará o e-mail com orientações.<p>

<br>

### Operação com Exceção Vencida <p>
- Mensalmente- AS - enviará comunicado ao Gerente de Soluções ou Especialista II, responsáveis pela Sigla da Operação no DPR, contendo:<p>
          - As operações em exceção vencidas, em ordem crescente de data de vencimento, respectiva exceção e orientação para correção ou baixa da exceção.<p>

- Havendo retorno das equipes:
         - AS - Verifica a correção e executa baixa da exceção, caso contrário, retornará o e-mail com orientações. 

<br> 

##  4. Orientação sobre a Correção ou Baixa por Gestão de Exceções

A regularização de exceção em operação pode ocorrer por correção da mesma, descontinuação ou pela Baixa por Gestão, conforme segue:
<br>

<b>4.1 - Segue orientação de Correção de operação por critério:</b>

### Informação Sensível de segurança – Cloud BB
* Depende da automação da disponibilização de recurso – chave IDH, previsto para Janeiro/2023;
* Suspender a contagem do prazo do CEV, até a automação do processo de disponibilização da chave IDH;
* Resolvido item acima, passar a contar novo prazo de 60 dias do CEV;
*  Recurso uma vez implantado, exceção migrada para “Informação Sensível de segurança, com token de segurança disponível”.

<br>
  

### Informação Sensível de segurança, com token de segurança disponível no barramento IIB <p>
- A informação sensível de segurança repassada no contrato da operação deve ser obtida diretamente do token de segurança, disponível no barramento IIb.  
   Uma vez corrigido o problema, deve ser aberta issue para que a equipe da AS possa atestar a alteração e proceder a baixa da exceção, conforme segue:<p> 
   Abrir uma [Issue](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues) para o time AS - administração de serviços com respectivo " de acordo" do Gerente de Soluções ou Especialista II - responsável pela sigla no DPR: declarando que não usará mais os campos com informação sensível de segurança nos tópicos da operação, contrato da operação, pois passará a obter a informação pelo token de segurança do IIB, então os campos relacionados à essa exceção trafegarão vazios a partir dessa manifestação. Se operação provida no mainframe, equipe da AS verificará a correção no módulo provedor da operação.<p>

<br>  

### Mensagem ao Cliente:<p>
- Vincular as mensagens aos clientes que faltam no Sistema de Mensagens aos Clientes.<p>

<b>4.2 - Segue orientação para Baixa de exceção, as opções abaixo servem para todos os critérios que possuem exceção:</b> 
  
  &nbsp; &nbsp; 1ª - declaração de autorização **sem correção** e aprovada em desacordo com a regra de validação contendo o de acordo do Gerente Executivo ou Especialista I – Pendência será baixada.<p>
  &nbsp; &nbsp; A formalização preferencialmente deve ocorrer via issue, Abrir uma [Issue](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues) para o time AS - administração de serviços com declaração do Gerente Executivo – baixa por Gestão (Aprovadas em desacordo com a regra de validação)<p>
  &nbsp; &nbsp; 2ª - Descontinuação de Operação - Toda exceção é baixada automaticamente com a descontinuação da operação. <p>




<br>


> ### Caso tenha alguma dúvida, você poderá acionar a equipe AS - Administração de Serviços , veja como fazer sua solicitação <b> <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Cat%C3%A1logo_de_Aplica%C3%A7%C3%B5es%20/Como_Solicitar_Atendimento.md> aqui.</b></a><h3>  
<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)</b> </a>
    