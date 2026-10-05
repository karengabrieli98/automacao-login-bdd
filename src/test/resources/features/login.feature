# language: pt
Funcionalidade: Login no Sauce Demo

  Cenário: Login com credenciais válidas
    Dado que estou na tela de login
    Quando informo o usuário "standard_user" e a senha "secret_sauce"
    E clico no botão de login
    Então devo ver a página de produtos

  Cenário: Login com senha inválida
    Dado que estou na tela de login
    Quando informo o usuário "standard_user" e a senha "senha_errada"
    E clico no botão de login
    Então devo ver a mensagem de erro "Epic sadface: Username and password do not match any user in this service"