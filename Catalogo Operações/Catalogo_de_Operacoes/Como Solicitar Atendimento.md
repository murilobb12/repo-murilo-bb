### Como o atendimento da equipe de Administração de Serviços - AS - funciona? <h3>
A equipe Atendimento da Administração de Serviços - AS - é responsável pelas seguintes demandas:<p>
<b>1.  No Catálogo de Aplicação:</b>
*  Aprovar o Cadastro de uma Aplicação no Catálogo Aplicações;
*  Efetuar a Alteração da propriedade “Nível de Segurança de Consumo” das operações.<p>
<br>
<b>2. No Catálogo de Operação:</b><p>

*  Alterar o Timeout das Operações;
*  Habilitar o Log das Operações;
*  Analisar as operações avaliadas pelos Pré-Certificados;
*  Alterar outros itens nas propriedades das operações IIB conforme necessidade e demanda dos desenvolvedores;
*  Efetuar a Alteração da propriedade “Nível de Segurança de Consumo” das operações;
*  Efetuar confirmação da descontinuação de operações;
*  Aprovação de Operações com exceção.

<br>
Para cada tópico citado acima deve-se abrir uma solicitação específica,  e para isso basta seguir o passo a passo indicado neste roteiro. <p>

As solicitações deverão ser feitas por desenvolvedor ou gerente da sigla cadastrado no sistema DPR, caso contrário deverá ser solicitada a concordância "de acordo" ao interveniente da sigla no Sistema DPR.<p>

Lembre-se que após atendido o pedido de solicitação específico, caso tenha uma nova demanda, deve ser aberta outra solicitação para viabilizar seu atendimento.<p>

As solicitações serão abertas através de <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues><b> Issues</b></a> ao time AS - Atendimento. 

### O que é uma Issue? <h3>
As ISSUEs são questões, dúvidas, sugestões e, principalmente, solicitações que os intervenientes (equipes de construção de operações e aplicações) enviam para a equipe AS conduzir, responder e resolver.<p>
<br>
### Como abrir uma Issue? <h3>

### 1.  Ao acessar a página destinada as <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues><b> Issues</b></a>, clique no botão <i>New Issue</i> para abrir um novo chamado
![image](/uploads/f347a1cc30fce8de015305056562b040/image.png) <h3>
<br>
### 2.  Preencha os campos necessários localizados na página <h3>
![Campos_Issue](/uploads/322a7fb0abd0d50e857b2d0788774944/Campos_Issue.PNG)
<br>
### Dicas para preenchimento dos Campos<h3>
<b><i>Campo Título</i></b><p>
Para melhorar o processo de atendimento é necessário informar de forma clara o seu pedido no Campo Título.<p>
Exemplos de preenchimento do Campo Título<p>


|  |<b> Plataforma </b>  | <b> Motivo </b> | <b> Regra </b> | <b> Exemplo </b> |
| ------ | ------ | ------ | ------ | ------ |
| <td rowspan=2><b> Catálogo de Aplicações </b></td> | Aprovar o Cadastro de uma Aplicação | Sigla à qual pertence a operação (XXX) – Número da aplicação ( YYYYYYYY) – Solicitação de aprovação de Aplicação. | “MCI – 123456 – Solicitação de Aprovação de Aplicação” |
|  | Para efetuar a Alteração da propriedade “Nível de Segurança de Consumo” das operações | Sigla do sistema (XXX) – Número e versão da operação (YYYYYYYY + VS Z) – Ambiente (Desenvolvimento, Homologação ou produção) – Solicitação de Alteração da Propriedade Nível de Segurança de consumo para o nível – Informar qual o nível desejado (Aberta, Com autenticação mútua, com autenticação simples ou com autorização de consumidor) | “MCI – OPR. 123456 Vs1  - Produção – Alteração na Propriedade Nível de Segurança de Consumo para “Autenticaçãio Mútua” |
| <td rowspan=5><b> Catálogo de Operações</b> </td> | Para alterar o Timeout das operações | Sigla do sistema (XXX) – Número e versão da operação (YYYYYYYY + VS Z) – Solicitamos alteração do timeout da operação citada no ambiente (desenvolvimento, homologação ou produção) para X segundos. | “VIP – 44558878 Vs 3 – Solicitação de Alteração de Timeout em Desenvolvimento” |
| | Habilitar o Log das operações | Sigla do sistema (XXX) – Número e versão da operação (YYYYYYYY + VS Z) – Solicitamos a habilitação do log da operação citada no ambiente (desenvolvimento, homologação ou produção). | “COP – 122556 Vs 2 – Solicitamos Habilitar log da operação em Produção” |
| | Analisar as operações avaliadas pelos Pré-Certificados | Sigla do sistema (XXX) – Número e versão da operação (YYYYYYYY + VS Z) –  Solicito a avaliação da análise efetuada por funcionário Pré- certificado – Informar a matrícula do pré certificado. | “OPR – 44556698 Vs3 – Solicitação de avaliação da analise efetuada por funcionário Pré-certificado – F XXXXXXX-Y” |
| | Alterar outros itens nas propriedades das operações | Sigla do sistema (XXX) – Número e versão da operação (YYYYYYYY + VS Z) – Solicitamos a alteração da propriedade XXXXXX (informar qual a propriedade em questão) para o seguinte parâmetro (informar o parâmetro de mudança) no ambiente (desenvolvimento, homologação ou produção). | “SGN – 55521 Vs5 – Homologação – Alteração da propriedade “Módulo Autorizado |
| | Aprovação de Operações com Exceção | Sigla do sistema (XXX) – Número e versão da operação (YYYYYYYY + VS Z) – Aprovação de Operação com Exceção | “Sigla ACC – Aprovação com exceção. Operação 123456 VS 6” |
<br>
<br>
<b><i>Campo Título e Descrição</i></b><p>
Apresentar a solicitação informada no campo “Título” e sua justificativa, de forma detalhada, no Campo Descrição. <p>
<br>

<br>

### 3. Para finalizar o processo de abertura de Atendimento, clique em “Submeter Issue” <h3>
![Submeter_ISSUE](/uploads/58559bab5e801d738a363265a9e4f6ff/Submeter_ISSUE.PNG)

<br>

### Dúvidas e Suporte (Issues) <h3>

A fim de prestar um atendimento de qualidade e com mais eficiência, a equipe AS atendimento está atendendo aos suportes exclusivamente via Gitlab.
Em nossa área no Gitlab existe um banco de respostas a dúvidas comuns e de problemas resolvidos que podem ser pesquisados através das issues já solucionadas para adiantar o seu atendimento.
Caso não tenha sido encontrado seu problema específico, nos notifique, 
ao abrir uma solicitação via <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/issues> <b> Issue.</b></a>  

[<=Voltar](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/N%C3%ADvel_de_Seguran%C3%A7a_de_Consumo.md)



