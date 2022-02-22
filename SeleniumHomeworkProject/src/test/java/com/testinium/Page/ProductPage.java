package com.testinium.Page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();

    }

    public void selectProduct() {

        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("faceted-search-group-6"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu.top.login>ul>li>a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//span[text()='Favorilerim']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("img[alt='kitapyurdu.com']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));


        methods.click(By.className("sort"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select"));
        methods.selectByText(By.cssSelector("div[class='sort']>select[onchange='location = this.value;']"),"Yüksek Oylama");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
        methods.clickWithJavascript(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > div > div.open-menu-ct.bookAllCategories > div > ul:nth-child(3) > li:nth-child(14) > a"));
//methods.click(By.cssSelector(".pr-img-link"));
        methods.click(By.cssSelector("#product-422886 > div.image > div > a > img"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("#cart > div.heading"));
        methods.waitBySeconds(1);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@name='quantity']")).clear();
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//input[@name='quantity']"), "2");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//i[@title='Güncelle']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("div[class='right']>a[class='button red']"));
        methods.waitBySeconds(1);
        //methods.sendKeys(By.id("address-firstname-companyname"),"Sema");
        //methods.waitBySeconds(1);
        //methods.sendKeys(By.id("address-lastname-title"),"Şahin");
        //methods.waitBySeconds(1);
        //methods.selectByText(By.cssSelector("#address-zone-id"),"İstanbul" );
        methods.waitBySeconds(1);
        //methods.selectByText(By.cssSelector("#address-county-id"),"PENDİK" );
        //methods.waitBySeconds(1);
        //methods.sendKeys(By.id("address-address-text"),"Testinium");
        //methods.waitBySeconds(1);
        //methods.sendKeys(By.id("address-telephone"),"3333333333");
        //methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(4);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(4);
        methods.sendKeys(By.id("credit-card-owner"), "sema şahin");
        methods.sendKeys(By.id("credit_card_number_1"), "0000");
        methods.sendKeys(By.id("credit_card_number_2"), "1111");
        methods.sendKeys(By.id("credit_card_number_3"), "2222");
        methods.sendKeys(By.id("credit_card_number_4"), "3333");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-expire-date-month"), "01");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-expire-date-year"), "2027");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-security-code"), "123");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);


        }

    }






