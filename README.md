# Spring Boot Send Email using GMAIL

Spring Boot App para envio de emails usando o GMAIL.

Criado dois EndPoints para envio de Email: 
 - Envio Simples
 - Envio com Anexo.

## Dependencies

Spring Web

Spring Boot DevTools 

Java Mail Sender


## Tecnologies

`Java` `Spring Boot` 

## Configs

Obs: Como medida de segurança, crie uma conta GMAIL somente para esta finalidade(Estudos). A responsabilidade é totalmente sua!

Para implementar o JavaMailSender e utilizar a conta do Google para envio, você precisará realizar algumas configurações na sua conta GMAIL.
Siga os passos abaixo: 

1) Acesse sua conta Google. 

2) Clique em "Gerenciar sua conta Google"


<h1 align="center">
    <img alt="google" title="#Google" src="https://github.com/carlosjunior1983/springboot-send-email-gmail-java/blob/master/img/configGmail0.PNG"  /><br>
</h1>


3) Depois clique em Segurança
Na sessão "Como fazer login no Google", você deverá ativar a "Verificação em duas etapas". Depois de cadastrar e liberar a senha em duas etapas, será liberado uma nova opção chamada "Senhas e App"


<h1 align="center">
    <img alt="google" title="#Google" src="https://github.com/carlosjunior1983/springboot-send-email-gmail-java/blob/master/img/configGmail1.PNG"  /><br>
</h1>


Clique na opção "Senhas de App"
Será solicitado para digitar sua senha novamente.
Depois será aberto uma página para cadastrar senha para APP. No combobox "Selecionar App", escolha a opção "Outros"


<h1 align="center">
    <img alt="google" title="#Google" src="https://github.com/carlosjunior1983/springboot-send-email-gmail-java/blob/master/img/configGmail2.PNG"  /><br>
</h1>


Digite o nome do seu APP (Ex.): SpringBoot


<h1 align="center">
    <img alt="google" title="#Google" src="https://github.com/carlosjunior1983/springboot-send-email-gmail-java/blob/master/img/configGmail3.PNG"  /><br>
</h1>


e clique em GERAR.

Será apresentada a tela abaixo:


<h1 align="center">
    <img alt="google" title="#Google" src="https://github.com/carlosjunior1983/springboot-send-email-gmail-java/blob/master/img/configGmail4.PNG"  /><br>
</h1>


4) Selecione a senha apresentada e no applitation.properties colocar esta senha no comando abaixo: 


spring.mail.password=iyugkpajschntaiw



Seu application.properties deverá ficar assim: 


spring.mail.host=smtp.gmail.com

spring.mail.port=587

spring.mail.username=carlosjuniorspringboot@gmail.com

spring.mail.password=iyugkpajschntaiw

spring.mail.properties.mail.smtp.auth=true

spring.mail.properties.mail.smtp.starttls.enable=true


onde username deverá seu Email e password deverá ser a senha que você acabu de criar!


## Test

http://localhost:8080/api/sendEmail
http://localhost:8080/api/sendEmailwithAttachment



