![image](/uploads/374e7816ab02302e0c771869d8206b97/image.png)

O contrato é a área que define os parâmetros de entrada e saída da operação do Catálogo de Operações. Deve ser definido adequadamente para permitir que a operação realize a sua funcionalidade de forma correta.

A opção de preenchimento por Campo a Campo, permite ao desenvolvedor, incluir um contrato na operação sem a necessidade de conhecer efetivamente as regras e definições de um BOOK Cobol, facilitando o trabalho dos desenvolvedores de baixa, permitindo que foquem em suas necessidades.

Ao cadastrar ou editar uma operação e selecionar a opção Editar do Contrato de Requisição e Resposta, será apresentada a seguinte tela:

![image](/uploads/b1c93b8848fbad15ff7ad2fbaefe2234/image.png)

Ao selecionar a opção Inclusão campo a campo e clicar no botão ADICIONAR CAMPO, será disponibilizado os campos para preenchimento:



Na caixa Nível de Confidencialidade podem ser definidos os requisitos de confidencialidade do Contrato de Requisição ou do Contrato de Resposta individualmente, 
para mais informações sobre esta opção, podem consultar a documentação sobre [Nivel de Confidencialidade](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/AS_Operacao_Classificacao_Informacao_Topico.md).

Ao adicionar um item no contrato, serão disponibilizados os seguintes campos:
*	Nome do Campo: Deve ser informado o nome do campo do contrato, respeitando as regras do Catálogo de Operações no que se refere a [Nomenclatura dos Campos](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Nomenclatura%20dos%20Campos%20no%20Contrato%20de%20Opera%C3%A7%C3%B5es.md).  
*	Tipo do Campo: Deve-se selecionar o tipo de campo que melhor se adequa a necessidade, sendo eles:  
. Agrupador: Campo sem armazenamento de informação, utilizado para agrupar e ordenar outros campos.  
. Decimal: Campo numérico que irá receber valores decimais.  
. Lista: Campo sem armazenamento de informação, utilizado para agrupar e ordenar um conjunto de outros campos que se repetem.  
. Numérico: Campo numérico para armazenamento de valores inteiros.  
. Texto: Campo Alfanumérico.  
*	Tamanho: campo responsável por armazenar o tamanho do campo ou quantidade de ocorrências de uma lista, somente disponível para os tipos: Lista, Texto, Numérico ou Decimal, sendo neste último, disponibilizado campo para informar o tamanho da área inteira e decimal.  
*	Ações: Campo responsável por ordenar os campos do contrato, disponibilizando a opção de excluir o campo.  

Ao selecionar os tipos Lista ou Agrupador, será disponibilizado um botão para adicionar um campo dentro da referida lista/agrupamento, caso seja clicado no Botão Adicionar Campo, um novo campo será incluído fora da lista/agrupamento.  

Segue exemplo do preenchimento dos campos:  

![image](/uploads/7ae93b461ef71836bd716222fe5be38c/image.png)

Após a definição de todos os campos, deve-se clicar no botão SALVAR para confirmar a inclusão dos campos no Contrato. Neste momento o Catálogo irá validar os campos de acordo com as regras da AD e caso identifique alguma informação inválida irá apresentar a seguinte mensagem:  

![image](/uploads/13b7af20202675ebae986152a8fd9ca8/image.png)

Caso queira corrigir os apontamentos, selecione VOLTAR PARA EDIÇÃO, caso queira continuar com o contrato desta forma, selecione ACEITO E DESEJO CONTINUAR.

Após corrigir TODOS os apontamentos, a seguinte tela será disponibilizada:

![image](/uploads/c1edfd285455a762fcbfb52d1b3a876a/image.png)

Após confirmar, o contrato será gravado na operação e disponibilizado para consulta:  

![image](/uploads/dd90c467f36bcfc9919b8aa2671f9dfb/image.png)