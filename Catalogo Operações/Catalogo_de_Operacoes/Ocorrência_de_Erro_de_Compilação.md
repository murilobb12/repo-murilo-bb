<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)</b> </a>

**Issues #3877**
**Op7019080.v1-Erro na compilação** 

Boa tarde,
Na tentativa de enviar para desenvolvimento gerou a seguinte msg:  

**X:Ocorrência de erro de compilação. Biblioteca não pode ser publicada.**  

![image](/uploads/647673102cb7543d1b79364b01d423a9/image.png)

O problema ocorre quando existe algum erro na definição do book (contrato) da operação. A rotina de validação encontra um erro e retorna a mensagem sem especificar exatamente o erro.
Situações já vistas que provocam erro:  

- Book com campo(s) duplicado(s);
- Definição de tabela (array) dinâmica usando indexador(es) não definido(s) ou com nome incorreto;
- Erro de sintaxe na definição Cobol;
- Uso de termos do Cobol pouco comuns, como USAGE. É permitido no Cobol mas o validador não reconhece.  

Para corrigir o erro deve-se acertar a definição dos campos do book e depois reimportar. No Catálogo Novo o ajuste pode ser feito diretamente na edição do book.
Uma dica para ajudar a localizar o erro é, no Catálogo Corporativo de TI (o antigo), compilar o Maven e analisar o log de erro gerado. Segue o passo a passo: 
- Abrir a operação no Catálogo Velho;
- Clicar em "Publicar Componente de integração";
- Clicar em "Compilar sem publicar". Retorna o erro "Ocorrência de erro de compilação, Biblioteca não pode ser publicada.";
- Clicar em "Log de Erro de Compilação";
- Procurar o(s) erro(s) no texto apresentado. No exemplo abaixo:  

![image](/uploads/135a2e48f62990713618f5d0f2201f8e/image.png)  
![image](/uploads/831e46c60b23b23eabd79f44971842d0/image.png)  

No caso da operação 7019080.1 da issue #3877, foi visto que o book tinha campos duplicados.  

ERRO:  
/br/com/bb/png/operacao/analisarIntervenienteNoProcessoCreditoContextoDefinidoV1/bean/requisicao/DadosRequisicaoAnalisarIntervenienteNoProcessoCreditoContextoDefinido.java - [Pb(340) Duplicate field DadosRequisicaoAnalisarIntervenienteNoProcessoCreditoContextoDefinido.quantidadeParametroAnotacaoBaixa,  

O diagnóstico (resposta) seria: Existem campos e tabelas duplicados no book. Corrigir o book e depois reimportar.

Segue abaixo o book da operação para ilustrar. Os campos com asterisco estão duplicados:

        03 QT-PRM-EST-CC                             PIC S9(04)
                                                     COMP-5.
       **03 QT-PRM-ANOT-BXA**                          PIC S9(04)
                                                     COMP-5.
        **03 QT-PRM-ANOT-BXA-REPD**                      PIC S9(04)
                                                     COMP-5.
       **03 QT-PRM-ANOT-BXA**                          PIC S9(04)
                                                     COMP-5.
        **03 QT-PRM-ANOT-BXA-REPD**                      PIC S9(04)
                                                     COMP-5.
        **03 LS-ANOT-BXA**                               
         OCCURS 0 TO 100 TIMES
         DEPENDING ON QT-PRM-ANOT-BXA.
          05 TX-PRM-ANOT-BXA                         PIC S9(05)
                                                     COMP-3.
          05 TIP-CRTC-ANOT-BXA                       PIC S9(04)
                                                     COMP-3.
        **03 LS-ANOT-BXA-REPD**                          
         OCCURS 0 TO 100 TIMES
         DEPENDING ON QT-PRM-ANOT-BXA-REPD.
          05 TX-PRM-ANOT-BXA-REPD                    PIC S9(05)
                                                     COMP-3.
          05 TIP-CRTC-ANOT-BXA-REPD                  PIC S9(04)
                                                     COMP-3.
        **03 LS-ANOT-BXA**                               
         OCCURS 0 TO 100 TIMES
         DEPENDING ON QT-PRM-ANOT-BXA.
          05 TX-PRM-ANOT-BXA                         PIC S9(05)
                                                     COMP-3.
          05 TIP-CRTC-ANOT-BXA                       PIC S9(04)
                                                     COMP-3.
        **03 LS-ANOT-BXA-REPD**                          
         OCCURS 0 TO 100 TIMES
         DEPENDING ON QT-PRM-ANOT-BXA-REPD.
          05 TX-PRM-ANOT-BXA-REPD                    PIC S9(05)
                                                     COMP-3.
          05 TIP-CRTC-ANOT-BXA-REPD                  PIC S9(04)
                                                     COMP-3.  
                                                     
                                                     

  
**Dica**

Caso o book da operação não apresente erro de definição aparente, force a reimportação do book sem fazer alteração:

EDITAR OPERAÇÃO > CONTRATO DE REQUISIÇÃO E RESPOSTA > Editar > "Inclusão por Book Cobol" > SALVAR

Em seguida tente fazer a aprovação da operação para Desenvolvimento.

                                                    
<b> [**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)</b> </a>


