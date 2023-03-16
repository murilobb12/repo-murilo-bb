![image](/uploads/0c375935a432eb09ae44316cfdc3cce8/image.png)

O **Portal QMassa**  é uma solução desenvolvida na Cloud BB nas interfaces WEB e API’s, auxilia na preparação e consulta de massa de dados, com o objetivo é povoar o ambiente de homologação, com dados de diversas siglas, para testes e homologação de soluções.
Pode ser acessado no seguinte endereço: [QMassa - Solução que auxilia na preparação e consulta de massa de dados](https://qualidade.intranet.bb.com.br/massa-de-dados)

## **Critério de Validação de Operações do QMassa** ##

As operações desenvolvidas no QMassa - sigla ATH - serão executadas exclusivamente no ambiente de homologação.  

São premissas para implementação e validação no Catálogo das Operações do QMassa:  

1. Operações do QMassa serão vinculadas **obrigatoriamente** a sigla **ATH**;  

2. Operações do QMassa podem encapsular funcionalidades de **outras siglas**;  

3. Operações do QMassa **não** devem seguir nenhuma regra de validação.  

4. Sigla ATH atende outras necessidades e não somente o portal QMassa, sendo assim, operações exclusivas do QMassa devem ter o termo **"para uso do QMassa"** informado ao final de sua nomenclatura, por exemplo: **"Criar conta corrente para uso do QMassa"**
 
5. Na descrição das operações QMassa deverá constar, além da descrição da operação o texto: **"Operação do QMassa - destinada a gerar massa de testes somente pros ambientes de desenvolvimento e homologação"**;

6. Operações do QMassa irão até homologação, **não serão** disponibilizadas em produção e para garantir isso, os seguintes procedimentos serão efetuados:  
 . As operações deverão ser disponibilizadas **seguindo as regras acima**;  
 . A Equipe da Administração de Serviços (AS) será responsável em promover as operações para Homologação;  
 . A equipe da AS irá retornar as operações do QMassa para desenvolvimento;  
 . **Operações do QMassa que não seguirem as regras acima, serão avaliadas como operações normais e exigidos os critérios definidos**.