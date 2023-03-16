![Banner_28](/uploads/275bfd05ce10f8167aa217cfb61a3c0d/Banner_28.png)<p>

<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)</b> </a>

### Critérios validados pelo Catálogo de Operações:
Os critérios seguem o que está previsto no [Manual de padrões e definições para utilização do integrador](https://digitizar.intranet.bb.com.br/digitizar/mod/resource/view.php?id=3999), sendo eles:
  
#### a. Validação Automática: 
Ocorre em duas etapas, a primeira quando a operação é promovida no catalogo de operações do cadastramento, estado 100, para desenvolvimento, estado 200, e a segunda quando é submetida pra análise da AS, de 200 pra 225.  

  
A seguir seguem as validações por **Estado da Operação:**

### Fase de Cadastramento pra Desenvolvimento - Estados 100 pra 200:

* O nome da operação deve iniciar com um verbo no infinitivo.
* Ter Aplicação provedora da operação vinculada.
* Módulo provedor e operação devem ser da mesma sigla.
* Módulo provedor não pode ser associado a outra operação.
* Termos de contrato da operação devem estar de acordo com o Glossário de termos do Sistema MMD.
* Área de dados da operação não pode ser maior que o permitido.
* Componente provedor da operação não pode prover -> Batch e ON LINE simultaneamente.
* Contrato com campo numérico sem compactação.
* Deve ser usado array dinâmico no contrato da operação.
* Timeout em desacordo com o estabelecido:  
   1- plataforma baixa: permitido até 5 segundos;  
   2- plataforma alta : permitido até 3 segundos.
* Não existir pelo menos uma mensagem ao cliente vinculada a operação ou ao módulo provedor, quando provida por módulo COBOL/CICS Container.  

### Fase de desenvolvimento pra Análise da AS, Estados  200 pra 225:

* Validação de serviço vinculado a operação.
  

#### b. Validação Manual: 
É realizada pelo time As e ocorre após a submissão da operação para avaliação, passando do desenvolvimento, estado 200, para o estado 225, Em atendimento.<p>
Abaixo seguem os critério validados:  
   
1.  **Informação Sensível de segurança, com token de segurança disponível** - As informações sensíveis de segurança, exemplo: chave usuário logado, senha, agência e conta-corrente, devem ser recuperadas do token de segurança, ou seja, não podem ser repassadas pelo contrato da operação e para este atributo, existe opção de pré-validação - vide [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Aplicativo_Catalogo_Operacao_Link/Catalogo_Operacao_Informacao_Sensivel_Campos_Sensiveis.md).  
2.  **Informação Sensível de segurança – Cloud BB** - São operações na Cloud BB que trafegam informação sensível de segurança, portanto passíveis de correção no tocante a informação sensível de segurança, assim que o token de segurança estiver disponível  e para este atributo, existe opção de pré-validação - vide [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Aplicativo_Catalogo_Operacao_Link/Catalogo_Operacao_Informacao_Sensivel_Campos_Sensiveis.md).  
3.  **Mensagem ao Cliente -** Todas as operações de serviço criadas ou versionadas a partir do dia 15/10/2019 e providas por módulo COBOL/CICS Container, têm que implementar o uso integral do MSG – Mensagem ao Cliente - **[vide comunicado](https://banco365.sharepoint.com.mcas.ms/sites/comunicatecnologia-comunicados/SitePages/Obrigatoriedade-de-uso-de-Mensagem-ao-Cliente-nas-opera%C3%A7%C3%B5es-do-Cat%C3%A1logo-Corporativo-de-TI.aspx).**    
 3.1 **[Veja aqui como fazer a vinculação de suas mensagens ao módulo provedor ou à própria operação propriamente dita](https://fontes.intranet.bb.com.br/msg/publico/suporte/-/blob/master/Mensagem%20ao%20Cliente/Vincula%C3%A7%C3%A3o_mensagem.md)**
4.  **Nome/Descrição -** O nome e a descrição da operação, devem estar adequados e permitir o correto entendimento da funcionalidade exposta.  
5.  **BOOK Divergente -**  Os contratos da operação devem espelhar a estrutura da área de requisição e de resposta do módulo provedor, inclusive tamanhos e tipos de dados.  
6.  **Normalização Área de Dados -**  A operação deve prover contrato de requisição e resposta normalizados.  
7.  **Natural sem Adabas -** O componente provedor Natural deverá conter acionamento ao banco de dados ADABAS em sua implementação.   
8.  **No handle -** O componente provedor Cobol não utilizará a cláusula "NOHANDLE" no contexto de acionamento do integrador IIB.  
9.  **Outra Sigla -** Operação não pode prover funcionalidade de escopo de outra Sigla.  
10.  **Indicador de retorno ou de Sucesso -** Área de resposta da operaçao não pode conter indicador de execução, exceto quando a operação não tiver contrato de resposta, então poderá utilizar um campo com tamanho de 1 byte somente, no contrato de resposta, para indicar execução.  
11.  **Funcionalidade já catalogada -** Operação não pode prover funcionalidade já catalogada, ou seja, deve prover uma funcionalidade inédita.  
12.  **Operação não negocial -**  Operação deve prover funcionalidade de negócio da sigla da operação.  
13.  **Container com Filler -**  O contrato da operação não terá campos desnecessários na área de requisição e de resposta, inclusive para reservar área de dados.  
14.  **Módulo Casca -** O componente que apenas  repassa a área de dados a outro componente, sem regra de negócio.  
15.  **Múltiplas Funcionalidades -** A operação deve prover apenas uma funcionalidade de negócio.  
16.  **Módulo Legado com função não fixada -**   É quando a operação que está sendo provida pelo módulo legado não define qual a função/funcionalidade daquele módulo está sendo utilizada. 
17.  **Chamada Direta -** O consumidor acionará operação do CTL, quando a funcionalidade a ser consumida estiver exposta no CTL.
18.  **Chamada Sucessiva ou recursiva -**  Chamada sucessiva ocorre quando o módulo provedor efetua chamada a componente(s) de consulta(s) simples, quando pode utilizar a consulta em lista.  
19.  **Função não Executada -** Quando é identificado que a funcionalidade proposta na operação não reflete o que é proposto e executado no módulo ou identificado erro no módulo, que indique que a funcionalidade não esta sendo executada ou quando não é retornado erro para identificar que a funcionalidade não foi executada.  

![Critérios da Validação](/uploads/18e322a86ad8467cb12e20016abdbc77/image.png)<p>  
  
  
#### Atenção:  Tratamento descritos nos itens C e D abaixo, serão validos a partir de Março de 2022
#### c. Critérios com possibilidade de tratamento de Exceção.   

**Informação Sensível de segurança, com token de segurança disponível no barramento IIB  e para este atributo, existe opção de pré-validação - vide [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Aplicativo_Catalogo_Operacao_Link/Catalogo_Operacao_Informacao_Sensivel_Campos_Sensiveis.md).**.

**Informação Sensível de segurança–Cloud BB-prazo de contagem da exceção suspenso,  para este atributo, existe opção de pré-validação - vide [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Aplicativo_Catalogo_Operacao_Link/Catalogo_Operacao_Informacao_Sensivel_Campos_Sensiveis.md), vide detalhes abaixo:** 

Depende da automação da disponibilização de recurso – chave IDH, previsto para Janeiro/2023;

Suspender a contagem do prazo do CEV, até a automação do processo de disponibilização da chave IDH;

Resolvido item acima, passar a contar novo prazo de 60 dias do CEV;

Recurso uma vez implantado, exceção migrada para “Informação Sensível de segurança, com token de segurança disponível”.


**Mensagem ao Cliente.**


A AS, Administração de Serviços,  recomenda a disponibilização de operações de acordo com os critérios acima descritos.<p> 
 
#### d. Critérios que não possuem possibilidade de tratamento de exceção, seguem tratamentos conforme abaixo:
A AS, Administração de Serviços,  recomenda a disponibilização de operações de acordo com os critérios acima descritos.  
   **d.1 Critérios que devem necessariamente ser corrigidos, caso contrário, a operação não será aprovada, seguem abaixo relacionados:** Neste grupo estão incluídos os critérios que necessariamente devem ser corrigidos
pois o custo de correção é muito elevado ou podem causar erro em produção, são eles: Nome/Descrição; BOOK Divergente; Normalização Área de Dados; Natural sem Adabas; e No handle.  
   **d.2 Critérios com possibilidade de aprovação pelo Gestor em desacordo com a regra de validação**, no quadro abaixo, as operações que seguem esse roteiro. O detalhe do processo de aprovação por gestão em desacordo com a regra de validação no [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criterios_Autorizacao_Gestao_Sem_Gesit.md).  
   **d.3 Critérios com avaliação da Gesit e com possibilidade de aprovação pelo Gestor em desacordo com a regra de validação**, será solicitada avaliação de 
   performance à Gesit, e caso seja reprovada, a operação deve ser corrigida, mas caso seja aprovada pela Gesit, não há necessidade de correção.  No quadro abaixo, as operações que seguem esse roteiro. O detalhe do processo de aprovação por gestão em desacordo com a regra de validação no [link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criterios_Autorizacao_Gestao_Com_Gesit.md).  
    
Quadro detalhe itens d.2 e d.3

 | <b>Sem análise de performance</b> | <b>Com análise de performance</b> | 
| ------ | ------ | 
|Outra Sigla <p><br> Indicador de Sucesso  <p> Funcionalidade já catalogada  <p> Operação não negocial <p> Container com filler  |Módulo Casca ([exemplo](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues/2291)) <p><br>  Múltiplas Funcionalidades  <p> Módulo Legado com função não fixada  <p> Chamada direta <p> Chamada Sucessiva ou recursiva <p> Função não Executada – Sem previsão de erro <p> | 

<br>


<br>

> ### Caso tenha alguma dúvida, você poderá acionar a equipe AS - Administração de Serviços , veja como fazer sua solicitação <b> <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Cat%C3%A1logo_de_Aplica%C3%A7%C3%B5es%20/Como_Solicitar_Atendimento.md> aqui.</b></a><h3>
<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)</b> </a>




