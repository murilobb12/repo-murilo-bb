![Banner_14](/uploads/9882ac972c6df8a5ead10ccf342bc68c/Banner_14.png)

# Criando uma operação de Baixa Plataforma "Provedor High End" no Catálogo
As orientações a seguir são **complementares** as do [Roteiro para cadastrar operações no catálogo](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Como_Cadastrar_Opera%C3%A7%C3%B5es.md) com o objetivo de atender os desenvolvedores da baixa plataforma de processamento.<p>
Caso queira saber como consultar as informações gerenciais de uma ou várias operações de baixa plataforma [clique aqui](#head2)<p>
<br>
## <b>Definindo o BOOK da operação</b>
Como criar um Book COBOL: <p>


    
          03  QT-MCA-CRT                                  PIC S9(09) COMP.
          03  LS-MCA-CRT
            OCCURS 0 TO 9999 TIMES
            DEPENDING ON QT-MCA-CRT.
            05  CD-MCA-CRT                                 PIC S9(18) COMP.
            05  NM-MCA-CRT                                 PIC X(100).


De-Para de Tipos Java para Tipos Cobol:

| JAVA | COBOL |
|------|-------|
| Byte | PIC X. |
| Short | PIC S9(4) COMP-5. |
| Integer | PIC S9(9) COMP-5. |
| Long | PIC S9(18) COMP-5. |
| Date | PIC X(10) DATE FORMAT YYYY-MM-DD. |
| BigInteger | PIC S9(18) COMP-3. |
| String | PIC X(255). |
| BigDecimal | PIC S9(18)V9(2) COMP-3. |

String maior que 255:

```
03  QT-MCA-CRT                                  PIC S9(09) COMP.
03  LS-MCA-CRT OCCURS 0 TO 9999 TIMES DEPENDING ON QT-MCA-CRT.
  05  CD-MCA-CRT PIC X(1)
```

Array de Objetos:

```
        03  QT-MCA-CRT                                  PIC S9(09) COMP.
        03  LS-MCA-CRT OCCURS 0 TO 9999 TIMES DEPENDING ON QT-MCA-CRT.
         05  CD-MCA-CRT                                 PIC S9(18) COMP.
         05  NM-MCA-CRT                                 PIC X(100).
```


A instrução OCCURS 0 TO N TIMES DEPENDING ON QT-CAMPO indica um array que se repete de 0 até o valor do campo QT-CAMPO que deve vir antes da estrutura do DEPENDING ON.



Além disso é possível criar vários níveis além do 03, 05, para criar estruturas de dados mais complexas.<p>
<br>



# <a name="head2"></a> Consultando informações gerenciais de operações da baixa plataforma
1. Acesse o relatório gerencial de operações no [Power BI](http://pwbi.intranet.bb.com.br/reports/powerbi/%5BP%C3%BAblica%5D/VITEC/PTT/GECIS/D45/AS%20-%20Consulta%20de%20Opera%C3%A7%C3%B5es)


![HEPBI1](/uploads/74bc2e0acb2bcc72ed6367ece612b440/HEPBI1.png)




2. Em seguida, na modal “Plataforma” marque as opções “Externo” e “High End”


![HEPBI2](/uploads/923ff742e99ddf9560e893080724aab0/HEPBI2.png)



A partir desse momento serão mostradas apenas as operações da baixa plataforma

A modal “Estado da Operação” faz referência à etapa do ciclo de vida da operação (100-Em normalização; 200-Desenvolvimento; 500-Produção; etc.)

A modal “Status do Serviço” mostra em qual situação está a operação (desativada, ativada, etc.).

As demais modais, tais como Sigla, Tempo máximo em seg, etc., poderão ser selecionadas para consultas mais específicas.




![HEPBI3](/uploads/7bb994c3811d348ba666c818364b6930/HEPBI3.png)<p>
<br>



[**Voltar para o Roteiro para cadastrar operações no catálogo**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Como_Cadastrar_Opera%C3%A7%C3%B5es.md)



[**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)
 




