package com.test.steps;

import com.test.screen.ScreenLogin;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class LoginSteps {
    ScreenLogin login = new ScreenLogin();

    @Dado("^que eu informe \"([^\"]*)\" e \"([^\"]*)\"$")
    public void informe_usuario_senha(String usuario, String senha) throws InterruptedException {
        for(int x = 0; x<= 2; x++) {
            login.writeEmail(usuario);

        }
        int i = 2;
        while (i <=2){
            login.writePassword(senha);
            i ++;

        }

    }
    @Quando("^eu clicar no botao logar$")
    public void clicar_btn() throws InterruptedException {
        login.setBtnEnter();

    }
    @Então("^vou vizualizar a home do aplicativo$")
    public void home_aplicativo(){
        System.out.println("APP LOGADO");

    }

}
