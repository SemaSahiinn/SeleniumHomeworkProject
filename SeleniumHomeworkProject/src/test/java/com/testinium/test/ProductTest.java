package com.testinium.test;

import com.testinium.Page.LoginPage;
import com.testinium.Page.ProductPage;
import com.testinium.driver.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ProductTest extends BaseTest {
        @Test
        public void productTest(){
            LoginPage loginPage = new LoginPage();
            ProductPage productPage = new ProductPage();

            loginPage.login();
            productPage.selectProduct();

        }


}
