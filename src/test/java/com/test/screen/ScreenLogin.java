package com.test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(id = "com.example.qazando.espressotests:id/login_username")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement FieldEmail;

    @AndroidFindBy(id = "com.example.qazando.espressotests:id/login_password")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement FieldPassword;

    @AndroidFindBy(id = "com.example.qazando.espressotests:id/login_button")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement btnEnter;


    public void writeEmail(String usuario)throws InterruptedException{
        Thread.sleep(5000);
        FieldEmail.sendKeys(usuario);

    }
    public void writePassword(String senha)throws InterruptedException{
        FieldPassword.sendKeys(senha);
    }
    public void setBtnEnter()throws InterruptedException{
        btnEnter.click();
    }

}
