![analise](/uploads/71f4c840c343f1013ecd293ae8791b73/analise.png)<p>
<br>  

[**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)


Toda Operação tem um ciclo de vida e está propensa a passar pelos estados indicados na tabela abaixo:
<p>

<table>
<tbody>
  <tr>
    <td><b>Código</b></td>
    <td><b>Status</b></td>
  </tr>
  <tr>
    <td><b>100 - Cadastramento</b></td>
    <td>Operação criada, porém precisa ser catálogada (qnd importa book), parametrização e vinculação</td>
  </tr>
  <tr>
    <td><b>200 - Desenvolvimento<b/></td>
    <td>Teste em ambiente</td>
  </tr>
  <tr>
    <td><b>225 -  Atendimento</b></td>
    <td>Submetida para análise</td>
  </tr>
  <tr>
    <td><b>250 - Aprovada</b></td>
    <td>Aprovada pela equipe AS</td>
  </tr>
  <tr>
    <td><b>350 - Homologação</b></td>
    <td>Em teste de funcionalidade</td>
  </tr>
  <tr>
    <td><b>500 - Produção</b></td>
    <td>Ambiente apto para uso</td>
  </tr>
  <tr>
    <td><b>888 - Arquivada</b></td>
    <td>Inibe a execução, estados anteriores a produção homolação.</td>
  </tr>
  <tr>
    <td><b>998 - Em descontinuação</b></td>
    <td>Inibe a execução da operação em desenvolvimento e homologação;</td>
  </tr>
  <tr>
    <td><b>999 - Descontinuada</b></td>
    <td>Inibe a execução da operação em desenvolvimento, homologação e produção.</td>
  </tr>
</tbody>
</table>
<p>
<br>


Sendo que, após a criação da operação a mesma já vai estar no estado <b>200 - Desenvolvimento</b>.<p>
Para dar continuidade ao seu ciclo de vida é necessário que a mesma seja submetida ao time AS Administração de Serviços caracterizada pelo estado <b>225 - Atendimento</b>,para verificar se atende aos critérios de validação que estão disponíveis no <b>[link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/Brenda-Aprendizado/Cat%C3%A1logo_de_Opera%C3%A7%C3%B5es/Criterios_de_valida%C3%A7%C3%A3o.md)</b>.
<p>
<br>
<b>1. Para submeter uma Operação ao atendimento é necessário que se clique no botão <b>Solicitar Aprovação</b><p>

<br>
![solic-approv](/uploads/346b342eb1982b8fb4cb9d9319f31229/solic-approv.png)<p>
<br>
Após verificação e aprovação, a Operação passará para o estado <b>250-Aprovada. </b><p>

Caso não atenda a um dos critérios de validação a operação será reprovada e volta ao estado <b>200-desenvolvimento. </b>


Para acompanhar o andamento da solicitação de aprovação acesse o <b>[link](https://plataforma.atendimento.bb.com.br:49286/estatico/gaw/app/spas/index/index.app.html?cd_modo_uso=19#/)</b>



# Aprovação em caráter de Exceção
A exceção é determinada pela impossibilidade do ajuste por alguma condicionante especial do negócio (ex: prazo). O pedido de exceção deve ser registrado formalmente em Issue, que deverá ser assinada pelo gerente de soluções da sigla envolvida.<p>

Se aprovado o pedido de exceção, inicia-se a contagem do **prazo de 60 dias** para regularização no momento que for disponibilizada em Produção.<p>
```ruby
"Obs: Operações aprovadas no regime de exceção podem impactar no indicador CEV caso não seja feito o ajuste no prazo informado anteriormente."
```


## Controle de exceções vencidas - Indicador CEV 

Tem a função de medir a correção das operações com exceções promovidas para o ambiente de produção no Catálogo Corporativo de TI (CTL), a fim de aprimorar a qualidade das operações e serviços disponibilizados por meio do Catálogo Corporativo de TI.<p>
### 1. Para ver suas Operações em exceção [acesse o Indicador CEV](http://pwbi.intranet.bb.com.br/reports/powerbi/%5BP%C3%BAblica%5D/VITEC/PTT/GECIS/D45/Indicador%20-%20CEV%20-%20Controle%20de%20%20Exce%C3%A7%C3%B5es%20Vencidas) e faça seu login com senha rede man.<p>
![Captura_de_Tela_2022-03-22_às_11.53.42](/uploads/41533da4ff422bc0de315249685227aa/Captura_de_Tela_2022-03-22_às_11.53.42.png)<p>
### 2. No Campo Responsável, procure sua chave de acesso e verifique as informações necessárias e motivos para suas Operações estarem em exceção.
![Captura_de_Tela_2022-03-22_às_11.54.49](/uploads/e8d8011d0e23e5f8502fc81f0ac110cf/Captura_de_Tela_2022-03-22_às_11.54.49.png)

## Para saber mais sobre Exceções, acesse o <b>[link](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Tratamento_exce%C3%A7%C3%A3o.md).  


[**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)


