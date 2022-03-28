package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public LoginPage (){

        methods = new Methods();


    }


    public void login()  {

        methods.waitBySeconds(3);

        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/a"));

        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".popupCloseIcon"));

        methods.sendKeys(By.id("login-email"),"kaanakca01@gmail.com");

        logger.info("email adresi girildi");


        methods.waitBySeconds(3);

        methods.sendKeys(By.id("login-password"),"04mars04");

        logger.info("sifre girildi");

        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));

        methods.waitBySeconds(3);

        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));






    }




}
