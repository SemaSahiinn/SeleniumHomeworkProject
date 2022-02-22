package com.testinium.test;

import com.testinium.Page.LoginPage;
import com.testinium.Page.ProductPage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage=new ProductPage();

        loginPage.login();
        productPage.selectProduct();
    }

}
