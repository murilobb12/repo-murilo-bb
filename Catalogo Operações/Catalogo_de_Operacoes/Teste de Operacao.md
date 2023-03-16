[**Voltar para Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)

* **Erros de Teste no Catálogo de Operações**
 
a. Caso ocorra erro ao testar uma operação no Catálogo de Operações, favor efetuar o teste no Catálogo Corporativo de TI (Catálogo antigo)


1. **Como testar a execução de uma operação pelo Curió?**

A. Instalar uma ferramenta para acionamento do endereço REST da operação, tais como RESTClient, Insomnia, etc. Lembrando que RESTClient é uma extensão a ser instalada no Mozzila e Insomnia é um aplicativo externo já homologado pelo BB;   

* Caso instale o RESTClient, no primeiro acesso, deve-se configurar o HEADER para o formato JSON.
* Selecione HEADERS > Custom Headers
* Preencha os campos conforme a imagem abaixo e confirme:  
 ![image](/uploads/6a93b1ec1c13741448f9182ecaccf9e5/image.png)

B. Ao acionar a ferramenta, setar/configurar o método para POST;   
![image](/uploads/aba6fa9b29925f994a666073cf6a27bd/image.png)

C. Informar o link para execução da operação, sendo:  
* Link para desenvolvimento: http://curio.iib.desenv.bb.com.br/op[Numero]v[Versao]/[Maven]  

* Link para Homologação....: http://curio.iib.hm.bb.com.br/op[Numero]v[Versao]/[Maven]  

* ATENÇÃO: Nos links acima, devem ser substituídos o Número da Operação, Versão da Operação e Versão do Componente Maven de acordo com a operação que deseja executar.  

D. Deve ser configurado o Header para: **Content-Type: application/json**  
* Para configurar um Header, selecione a opção HEADER e logo após o menu Content-Type: application-json  
![image](/uploads/1b3f65b65693e6edd7489e0112624fb2/image.png)  

E. Logo após configurar o Header, no campo BODY, devem ser informados os parâmetros de entrada em formato JSON, lembrando que, neste formato somente devem ser passados os parâmetros que tiverem valor preenchido, campos sem valor não devem ser informados.  

Segue exemplo de um arquivo de entrada no formato JSON:

Operação: **6968630.1**  
Arquivo JSON: 

```
{
  "codigoCpfCliente": "16485981020",
  "codigoCadastroNacPessoasJuridicasEmpregador": "45862999000116",
  "numeroConvenio": 127155
}
```  

**OBS**: [Neste LINK](https://relatorios.arq30.cda.hm.bb.com.br/iib-json) pode-se gerar automaticamente os dados em formato JSON para ser utilizado pela ferramenta.  

F.	Após informar os dados de entrada, pressione o botão SEND para executar; 

G.	O resultado da execução da operação deve ser apresentado na aba Response.
