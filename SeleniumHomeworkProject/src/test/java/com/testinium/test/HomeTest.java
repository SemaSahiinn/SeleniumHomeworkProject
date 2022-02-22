package com.testinium.test;

import com.testinium.Page.HomePage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();
        homePage.home();
    }
}
