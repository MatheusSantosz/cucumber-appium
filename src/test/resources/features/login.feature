#language: pt

  @test-2
Funcionalidade: Login
  //Contexto: Logar no app

  @test
  Cenário:Login com sucesso

      Dado que eu informe "qazando@gmail.com" e "123456"
      Quando eu clicar no botao logar
      Então vou vizualizar a home do aplicativo

  @test-2
  Esquema do Cenario:Login com sucesso 2

    Dado que eu informe "<usuario>" e "<pass>"
    Quando eu clicar no botao logar
    Então vou vizualizar a home do aplicativo

    Exemplos:
      | pass      |  | usuario               |
      | 123456    |  | qazando@gmail.com     |
      | 123123123 |  | qazando123@gmail.com  |
      | 123123    |  | qazando1234@gmail.com |
