package com.testinium.Page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"),"sema.sahin@testinium.com");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-password"),"736284.Sm");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));





    }
}
