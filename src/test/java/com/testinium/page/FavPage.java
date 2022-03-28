package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class FavPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(FavPage.class);

    public FavPage(){

        methods = new Methods();

    }

    public void favorite(){

        methods.click(By.xpath("//*[@id='product-577328']/div[2]/div[3]/a[4]"));
        logger.info("1. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-512553']/div[2]/div[3]/a[4]"));
        logger.info("2. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-565088']/div[2]/div[3]/a[4]"));
        logger.info("3. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-561234']/div[2]/div[3]/a[4]"));
        logger.info("4. ürün favorilere eklendi.");

        methods.waitBySeconds(2);

    }



}
