![ahome](Catalogo_de_Operacoes/imagens/Voltar_ahome.png)[**Voltar para página do Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)

![comocadastrarumaoperação](/uploads/9aa9b18ba55d2d3700636455935466ac/comocadastrarumaoperação.png)<p>



<p>
<b><a href=https://digitizar.intranet.bb.com.br/digitizar/course/view.php?id=193> Consulte aqui o Manual de Definições e Padrões para Utilização do Integrador</b></a>

<p>

 [<b>Clique aqui e veja o roteiro para cadastrar operações "Provedor High-End"</b>](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criando_op_baixaplat.md)


# **Como obter acesso ao Catálogo de Operações?**  

<br>

Para obter o acesso ao Catálogo é necessário que seja requerido:<p>

a) Acesso ao recurso **APLICAT** da sigla em questão

b) Acesso de desenvolvedor do Catálogo Corporativo => **"CTL00030"**

<br>

# <b>Verificações prévias ao cadastramento.</b><h3><p>


### <b><i>1. Verificando o cadastro do módulo</i></b><p>
Para saber se o Componente provedor (módulo) está cadastrado basta:<p>
<b><i>consultar através do CTL, na aba Cadastro > Operação > Pesquisa por módulo.<i></b>

```ruby

"obs: Módulos legados são aqueles disponibilizados em ambiente de Produção antes de 10/2013."`

```
### <b><i>2. Verificando se a funcionalidade ja está cadastrada</i></b><p>
Para saber se a funcionalidade está cadastrada basta:<p>
 Buscar através de termos do Nome e da Descrição se a funcionalidade a ser exposta já está disponível, <b><i>através da aba Cadastro > Operação > Lista de Operações.<i></b><p>
<br>
### <b><i>3.Glossário de termos da Administração de Dados</i></b><p>
Caso seja necessário consultar os termos utilizados no contrato da operação, [clique](https://ad.intranet.bb.com.br/).
<br>  
  
  --
# **Como cadastrar uma Operação?**<p>

O cadastramento de uma Operação é feito no Catálogo de Operações na Plataforma 3.0, e deverá ser efetuado por um interveniente da sigla cadastrado no DPR.

São necessários os seguintes acessos :<p>

## 1. **Na plataforma, selecione a opção Tecnologia**
    
![Group_92143](/uploads/1e9c3f3d3d2778c816df01110b73b270/Group_92143.png)
    
## 2. **No Menu lateral vá na opção Contrução > Catálogo > Corporativo de TI**
    
![Group_92305](/uploads/5244ce96316b67a05947705865170bed/Group_92305.png)
    
## 3. **No Catálogo, clique no botão Criar Nova Operação**
    
   ![Group_92306](/uploads/3af67ddf4f0cc26aa00b19fc79edf6d1/Group_92306.png)
    
## 4. **Preencha os campos necessários para criar uma Operação.**<p>
### 1º Passo - **Informações Iniciais** 
<p>

![FluxoCriarOperacao1_TipoHighEnd](/uploads/7a24f927ca24c4b2f4a9688729e61a78/FluxoCriarOperacao1_TipoHighEnd.png)

#### <b><i>a. Nome da Operação</b></i>
O Campo **Nome** deve ser definido préviamente ao cadastro, e necessita ser claro o suficiente, a fim de permitir a outros consumidores o entendimento da funcionalidade proposta.


**Exemplo de nome de uma operação:** 6015343.1 Nome:"Atualizar Catalogo de Bundles "

| <b>Instruções sobre como nomear uma Operação</b> |
| ------  |
| Evite o uso de siglas, mesmo as que são popularmente conhecidas; | 
| Jamais utilize nome de tabelas no nome; |
| Não informe dados técnicos, como qual a base de dados, tipo de provimento da operação ou outras informações de infraestrutura;|
| Cuidado com o significado real dos termos, por exemplo: "recuperar" é diferente de "consultar";|
| Inicie com um verbo no infinitivo;<p>. Para operações de cadastramento, criação ou inserção, inicie com o verbo "Incluir";<p>. Para operações de exclusão ou deleção, inicie com o verbo "Excluir";<p>.Para operações de alteração ou edição, inicie com o verbo "Alterar";<p>. Para operações de consulta que retornem mais de um registro, inicie com o verbo "Listar";<p>. Para operações de consulta que retornem obrigatoriamente apenas um registro, inicie com o verbo "Consultar";<p>. Para outra funcionalidade, inicie o nome com verbo no infinitivo que retrate corretamente a função. |
| O nome da operação deve conter somente um espaço em branco entre as palavras;|<p>
<br>


|  **Não contextualize o uso da operação** <p><br>  Ex:"Consultar nome do cliente <ins>**para Contratação de Crédito**"</ins><p> O texto sublinhado indica o contexto de uso da operação, embora possa ser o motivo de criação da operação, a funcionalidade poderá ser reutilozada no futuro em outras situações.  |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
<p>
<br>

#### <b><i>b. Descrição da Operação</i></b>

O Campo Descrição deve ser definido préviamente ao cadastro, e necessita de ser claro o suficiente, a fim de permitir a outros consumidores o entendimento da funcionalidade proposta. E importante ressaltar que é necessário descrever de forma detalhada a funcionalidade da operação, sendo pouco eficaz apenas copiar o nome da Operação.<p>

 <b>Instruções sobre como Descrever uma Operação</b> |
| ------  |
| Evite o uso de siglas, mesmo as que sejam popularmente conhecidas; | 
| Jamais utilize nome de tabelas na descrição; |
| Não informe dados técnicos, como qual a base de dados, tipo de provimento da operação ou outras informações de infraestrutura;|
| Cuidado com o significado real dos termos, por exemplo: "recuperar" é diferente de "consultar";|
| Detalhe o significado de termos e expressões de uso interno de um serviço; | 
| Evite a utilização de abreviaturas;|
| Caso a operação possua mais de uma versão ativa, procure especificar o que diferencia uma versão da outra.|
| Não é obrigatório que sejam informados os campos de requisição e resposta; entretanto, informações de entrada e saída podem ser usadas<p> para melhorar a compreensão da funcionalidade.|<p>
<br>

#### <b><i>c. Escolha a Operação Padrão</b>

Selecione o tipo de Operação ao qual está sendo criada.<p>

As mais comuns são:<p>
<br>

<table>
<tbody>
  <tr>
    <td><b>Para COBOL CICS Container</b></td>
    <td>Mainframe CICS Síncrona - Container</td>
  </tr>
  <tr>
    <td><b>Para COBOL CICS COMMAREA</b></td>
    <td>Mainframe CICS Síncrona - Commarea</td>
  </tr>
  <tr>
    <td><b>Para GRI<b/></td>
    <td>Mainframe GRI Síncrona/td>
  </tr>
  <tr>
    <td><b>Para Natural</b></td>
    <td>Mainframe CICS Síncrona - Natural</td>
  </tr>
  <tr>
    <td><b>Para High-End (Baixa Plataforma)*</b></td>
    <td>Provedor High-End</td>
  </tr>
</tbody>
</table>
<p>
<br>

**Atenção!** Sobre as operações **GRI** é importante lembrar que o trânsito dos dados para o ambiente GRI é diferenciado de uma operação provida no ambiente CICS. Até o momento não há trânsito de container com dados da chave e senha de usuário e o ambiente ainda não dá suporte para esse tipo de comunicação de dados. 
A criptografia para ser utilizada deve estar agregada ao uso da aplicação autenticada e o ambiente GRI não está incluído no contexto que utiliza a aplicação autenticada, portanto não é possível a utilização de criptografia neste momento. Até que os ambientes possam promover as capacidades para trânsito de container
de usuário e senha e/ou criptografia é necessário que seja aberta uma ISSUE para o time AS atendimento solicitando a aprovação da operação por exceção arquitetural
uma vez que não há previsão para a construção de solução para o problema.


**Quando da criação de novos módulos NATURAL, Para que o KDZ/Endevor possa identificar/localizar estes módulos, se faz necessário que os mesmos sejam primeiramente enviados para o ambiente de homologação.**


 [<b>*Clique aqui e veja o roteiro para cadastrar operações "Provedor High-End"</b>](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Criando_op_baixaplat.md)

#### ***d. Campo Sigla***<p>
Informe a sigla do sistema da Operação.<p>
```ruby
"Obs: A sigla da operação é composta de três letras e deve ser escrita em letras maiúsculas."
```
### <b><i>2º Passo- Relacionamento</i></b><p>
![relacionamento](/Img/Cat%C3%A1logo_Opera%C3%A7%C3%B5es_-_Vincula%C3%A7%C3%A3o_aplica%C3%A7%C3%A3o_Provedora.png) <p>

a. É necessário que se preencha essta etapa com serviço vinculado e Operação provedora.<p>

b. É necessário obrigatório e associar a aplicação provedora da operação no respectivo campo.



### <b><i>3º Passo- Contrato</i></b><p>

Neste momento, você possui duas opções para incluir o Contrato: 

a. [Inclusão de Contrato via opção Campo a Campo](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Cadastrar%20contrato%20atraves%20da%20opcao%20Campo%20a%20Campo.md)

b. Inclusão de Contrato via BOOK Cobol, conforme abaixo:

![contrato](/uploads/21037e491e853570d5401e424dd033a5/contrato.png)<p>

#### <b><i> Importação de Book</i></b>




Informe os campos de entrada e resposta a partir do copybook normalizado. Se houver prefixo a suprimir, informe-o no campo apropriado.<p>

| <b><i>O que é um book?</i></b><p>São dados do contrato de uma operação.<br>Os parâmetros que ela recebe podem ser classsificados em **Book de Requisição (Book de Entrada)**, que são os parâmetros de entrada de uma operação, ou seja, os dados que ela recebe para executar aquilo que ela se propõe, e o **Book de Resposta (Book de saída)**, que são os parâmetros de saída de uma operação, ou seja, o resultado da execução da operação. Aquilo que ela entrega (quando tem um retorno) |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Consulte aqui o [Manual de Definições e Padrões para Utilização do Integrador](https://digitizar.intranet.bb.com.br/digitizar/course/view.php?id=193)<p>
| ------  |
| Adeque a área de dados a ser exposta a um copybook COBOL, aplicando as regras conforme Manual de Definições (link citado acima) <p>e Padrões de Utilização do Integrador (IN 487): | 
| Descreva a área de dados da operação a ser exposta usando a sintaxe do COBOL. Aplique as seguintes regras conforme <p>Manual de Definições e Padrões de Utilização do Integrador (IN 487): |
| Componente provedor COBOL que utilize passagem de parâmetros usando COMMAREA:O tamanho total da área não poderá <p>ultrapassar 32.500 bytes (requisição e resposta). |
| Componente provedor COBOL que utilize passagem de parâmetros usando Container e demais componentes (Highend, etc):<p>Atualmente os tamanhos máximos são:<p>EMS - 4 MB na Requisição e na Resposta;<p>MQ - 4 MB na Requisição e 4MB na Resposta;<p>RRV 128K na Requisição e 128K na Resposta. |
|Deve-se utilizar os termos abreviados segundo as nomenclaturas do glossário da Administração de termos da AD. Os termos<p>válidos podem ser consultados via SISBB aplicativo PRODUCAO opção 34(Glossário de termo da AD) > 32(Consultar termo) | 
| Deve-se iniciar os nomes de variáveis com um termo de natureza, abreviados e constantes no glossário de termos da AD; |
| Variáveis numéricas maiores que 2 bytes devem usar compactação. Deve-se usar formato nativo<p>(COMP-3, COMP ou COMP-5) na definição; |<p>
<br>

<b>Instruções sobre como Descrever um Contrato(book) de Operação</b> |
| ------  |
| Deve-se excluir campos para identificação de usuário ou canal de acionamento da Operação.</br>
Estas informações devem ser obtidas da integração do IIB; | 
| Deve-se excluir campos para reservar área (por exemplo, FILLER); |
|Pode-se utilizar FILLER somente nas seguintes situações:</br> <p> <ul> <li>Para componentes COBOL com passagem de parâmetros COMMAREA, os campos de entrada e saída devem ser unidos e importados tanto na área de requisição quanto na área de resposta. No book de entrada os campos de saída devem ser substituídos por FILLER. No book de resposta os campos de entrada devem ser substituídos por FILLER. </li> <li> Para componentes legado, além do que consta no item anterior, deve-se fixar o(s) campo(s) que define(m) a função exposta. Os VALUEs que especificam a função em componente legado devem ser mantidos e os nomes desses campos devem ser substituídos por FILLER.</lo></ul><p>Deve-se excluir todas as cláusulas "USAGE";|
|Deve-se excluir todas as cláusulas "VALUE", exceto na situação para componentes legados explicada anteriormente; | 
| Deve-se excluir os REDEFINES, fazendo as devidas alterações em itens de grupo quando necessário;|
| Deve-se excluir itens de grupo que não necessitem ser expostos no catálogo.|<p>

<br>

### <b>Dicas Sobre o Book</b> 

<b>Uso de Array em dados do contrato</b><p>
Deve-se utilizar nas áreas de dados de componentes provedores COBOL que utilizem passagem de parâmetros via Container ou componentes provedores de baixa plataforma:

* Array dinâmico (OCCURS .... DEPENDING ON) em listas de registros de dados;
* Array dinâmico nos campos de tipo texto com tamanho variável a partir de 256 bytes
* Array dinâmico para campos de tratamento ou armazenamento de imagens.



 <b> Exemplo de construção de Array Dinâmico:</b><h4> <p>

a) Campo TEXTO com tamanho maior que 255 bytes.
```

03  QT-MSG                     PIC 9(03) COMP.
03  TX-MSG                     PIC X(1)
    OCCURS 0 TO 999 TIMES 
    DEPENDING ON QT-MSG.

```

b) Campo de Lista com outros campos internos.
```

03  QT-MSG                     PIC 9(03) COMP.
03  LS-MSG 
    OCCURS 0 TO 999 TIMES 
    DEPENDING ON QT-MSG.
    05 TS-ATL                  PIC X(020).
    05 CD-DICT-RCBD            PIC X(077).
    05 CD-EST-PGTO-OPB         PIC X(045).
    05 CD-MTV-RJC-PGTO         PIC X(050).
 
```
 
```ruby
"Obs: Estas regras não se aplicam quando a tabela ou campo estiver dentro de outra tabela. Neste caso não deverá ser declarada como dinâmica;"
```
<br>

Vejam o exemplo de um book:

![image](/uploads/b02369a2a3da3a697988a1ec4e55013b/image.png)

#### <b><i>d. Segurança</i></b>

![Seguranca em API na Plataforma](/uploads/31dabff0bcb2f73865f9ecce458f38ac/seguranca.png)
<p>
Trata-se da propriedade **[Segurança em API na Plataforma](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Aplicativo_Catalogo_Operacao_Link/API_Seguranca.md)**. Esse recurso permite criar automaticamente através do sistema de Infraestrutura de Autenticação e Autorização, Sigla ATC, um código de funcionalidade de segurança no Sistema Acesso - ACE, para que seja vinculado a um papel.
Uma vez selecionada a opção de restrição de acesso ou não, essa opção de segurança pode ser editada até a promoção da operação para o ambiente de homologação. Depois disso, caso seja necessário alterá-la, só poderá ser feito com o versionamento da operação.
Dúvidas sobre a exposição da operação no GAW e a respeito da configuração e vinculação da funcionalidade aos papéis, deve-se acionar a equipe o Sistema ATC.

#### <b><i>e. Confirmação</i></b>

![confirmacao](/uploads/0ff0ab36bf49f59009c6c725eb6911ea/confirmacao.png)

Após os procedimentos realizados, o Catálogo oferece uma página para que se tenha uma visualização por completo do processo. Nesse ponto, verifique se os dados estão corretos, e finalize a criação de sua Operação ao clicar no botão Concluir.<p>
<p>
<br>
 <b> Consulte aqui o [Manual de Definições e Padrões para Utilização do Integrador](https://digitizar.intranet.bb.com.br/digitizar/course/view.php?id=193)<p>
Caso não tenha acesso, realize sua inscrição dentro da plataforma, sinalizado na figura abaixo.
![caminhodigitizar](/uploads/a59af9b248973705a10a623ca2d39369/caminhodigitizar.png)<p>



[**Voltar para a Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)
 
