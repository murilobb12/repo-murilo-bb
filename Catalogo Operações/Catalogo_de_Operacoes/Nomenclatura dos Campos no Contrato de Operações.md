![image](/uploads/45fc82b815b64bb9742cc1ff7b09d8e5/image.png)

*	O nome dos campos devem ser definidos utilizando **dois ou mais** termos;

*	Deve-se utilizar os termos segundo as nomenclaturas do glossário de termos da Administração de Dados (AD). Os termos válidos podem ser consultados via PLATAFORMA > TECNOLOGIA > CONSTRUÇÃO > ADMINISTRAÇÃO DE DADOS > GLOSSARIO DE TERMOS;

*	Deve-se iniciar os nomes de variáveis com um **Termo de Natureza** constantes no glossário de termos da AD;

*	Campos Texto maiores de **255** bytes devem ser convertidos em **Array Dinâmicos**. Para a opção de Inclusão Campo a Campo, **esta regra é criada automaticamente**, ou seja, todo campo superior a 225 bytes é convertido internamente para um array dinâmico, não sendo necessária a preocupação do desenvolvedor com esta regra;

*	Deve-se **excluir** campos para identificação de usuário ou canal de acionamento da Operação. **Estas informações devem ser obtidas da integração do IIB.**

