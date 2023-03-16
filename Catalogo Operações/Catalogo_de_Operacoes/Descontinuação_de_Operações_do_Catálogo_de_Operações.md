![Banner_16](/uploads/071a165065fb842e147ada04360f0249/Banner_16.png)<p>

<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)
</a><p>

## <b>Descontinuação (desativação) de Operações do Catálogo de Operações</b>
<b>Importante:</b> Para que uma operação seja colocada em descontinuação é obrigatória que ela tenha sido enviada para produção.<p>
Processo que viabiliza a descontinuação de operação do catálogo, sendo que:<p>
a.  O estado 998 - em descontinuação - inibe a execução da operação em desenvolvimento e homologação;<br>
b.  O estado 999 - descontinuada     - inibe a execução da operação em desenvolvimento, homologação e produção<p>

O próprio **desenvolvedor é quem altera o estado da operação** passando de 500 para 998 (em descontinuação). Neste caso, a operação não mais poderá ser executada nos ambientes de desenvolvimento e homologação, porém em produção permanecerá funcionando normalmente. A operação será descontinuada efetivamente somente quando uma destas das opções abaixo ocorrerem:
1. O AP4 mantenedor cadastrado no DPR da sigla em questão confirmar a descontinuação; ou
2. Caso tenha alguma exceção vinculada a operação, após a descontinuação da operação, deve-se abrir issue, solicitando a baixa da exceção.  

Caso uma destas opções ocorra, a operação será alterada para o estado 999 (Descontinuada) e deixará efetivamente de funcionar em produção.<p>
<br>

> ### Caso tenha alguma dúvida, você poderá acionar a equipe AS - Administração de Serviços , veja como fazer sua solicitação <b> <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Cat%C3%A1logo_de_Aplica%C3%A7%C3%B5es%20/Como_Solicitar_Atendimento.md> aqui.</b></a><h3>
<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)


