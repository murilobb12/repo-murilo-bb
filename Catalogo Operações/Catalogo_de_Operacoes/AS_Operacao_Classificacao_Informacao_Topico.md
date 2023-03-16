![ahome](Catalogo_de_Operacoes/imagens/Voltar_ahome.png)[**Voltar para página do Catálogo de Operações**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/Catalogo_de_Opderacoes.md)

![banner01](/Catalogo_de_Operacoes/imagens/OPR_-_Nivel_de_Confidencialidade.png)

## **Classificando as operações de acordo com o nível de confidencialidade - Uso desse recurso é Opcional**    


Com base no nível de confidencialidade informado no Catálogo de Operação, o IIB irá preservar adequadamente seu sigilo ao realizar a integração, através do uso ou não de criptografia.  

**A classificação do Nível de Confidencialidade, deve seguir a IN 421-1 e em caso de agrupamento de informações com diferentes níveis de classificação, deve-se atribuir ao conjunto a classificação mais elevada encontrada, vide item 5.1.5.**  



O Contrato das operações IIB criadas ou alteradas no Catálogo de Operações e providas por aplicações CloudBB, Mainframe, Plataforma BB ou Grafeno, através dos tópicos de requisição e resposta, passam a contar de forma opcional, com a classificação do nível de confidencialidade de acordo com a IN 421-1-1-5, seu uso é atribuição da equipe de desenvolvimento responsável pela sigla da operação, que deve proceder a classificação da informação, inclusive considerando a disponibilidade do recurso pros consumidores.  


Não há mudança no fluxo geral de cadastramento da operação, mas sim agregada opção de classificação do nível de confidencialidade no conjunto do registro do contrato da operação, ou seja, o nível de confidencialidade é informado por tópico do contrato da operação, sendo assim a classificação será efetuada no cadastro dos tópicos de requisição e/ou no tópico de resposta das operações.

Neste primeiro momento, a classificação do nível de confidencialidade não será obrigatória, então nenhuma das opções abaixo precisa obrigatoriamente ser escolhida, apesar de ser desejável.  


Serão oferecidas as seguintes opções de classificação do nível de confidencialidade, no cadastramento do contrato da operação e por tópico do contrato da operação:  

a) **Pública**;  
b) **Interna sem criptografia**;  
c) **Interna com criptografia**;  
d) **Confidencial**;  
e) **Ultra confidencial**.

As classificações, “Interna com criptografia”, “Confidencial”e “Ultra confidencial” farão com que a informação seja criptografada pelo IIB no barramento e as informações classificadas como “Interna sem criptografia” ou “Pública”, não serão criptografadas, trafegarão abertas, portanto não farão uso do recurso de criptografia no barramento.  

Selecionada a opção que exige criptografia, automaticamente serão criadas as propriedades abaixo pelo catálogo de operações por tópico, conforme segue:  
 	
a.	**Propriedade Nível de Segurança de Consumo**, relacionada a criptografia e deverá ser selecionada opção "**Com Autenticação Simples**", "**Com Autenticação Mútua**" ou "**Com Autorização de Consumidor**".  
Dúvidas sobre o nível de segurança de consumo de operação , no [**link**](https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/Catalogo_de_Operacoes/AS_Nivel_Seguranca_Orientacao_Uso.md);  

b.	**Criptografia da Operação é indicada por tópico da operação, ou seja, só usará este recurso o tópico com a informação que deve ser criptografada**:  
i.	Criptografar Requisição – Será criada automaticamente de acordo com o nível de segurança de consumo.  
ii.	Criptografar Resposta - Será criada automaticamente de acordo com o nível de segurança de consumo.  



### _______________________________________________________________________________________________________________________________________________________
<b> <a href=https://fontes.intranet.bb.com.br/ctl/publico/atendimento/-/blob/master/README.md> Voltar para Catálogo de Operações</b> </a>
