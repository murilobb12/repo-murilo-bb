![Banner_17](/uploads/6d6b43ff6a7f652350b986160d1f6b7b/Banner_17.png)<p>

<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)
</b> </a>

# Operações que usam sistema PND - Pendências de operações de serviços (em duas etapas)

São operações que usam o sistema PND para confirmar uma ação feita por outra operação.
Ou seja, uma operação executa uma ação/função e uma segunda operação confirma esta primeira operação.
O nome da primeira operação deve ser iniciado por "Contextualizar".
Deve ser informado na Descrição desta operação qual a outra operação que fara a efetivação da função.

```
Exemplo é a operação 2689313.2:
Nome: Contextualizar Alteração de Convênio de Cobrança de Um Cliente
Descrição: Permitir contextualizar dados básicos do convênio de cobrança para permitindo criação de pendências de 
Deferimento de convênio quando na sua alteração.
Esta operação está integrada com PND, cuja operação de efetivação é 2407758.
A segunda operação é que fará a função. Deve trazer referência à primeira operação de contextualização.

Exemplo da operação 2407758.2:
Nome: Alterar Convênio de Cobrança de Um Cliente
Descrição: Informados parâmetros de cadastro, são alteradas informações relativas a um determinado convênio de cobrança.
Esta operação está integrada com PND, cuja operação de contextualização é 2689313.
```
<br>

> ### Caso tenha alguma dúvida, você poderá acionar a equipe AS - Administração de Serviços , veja como fazer sua solicitação <b> <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Cat%C3%A1logo_de_Aplica%C3%A7%C3%B5es%20/Como_Solicitar_Atendimento.md> aqui.</b></a><h3>
<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)
 </a>

