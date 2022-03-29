package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FavPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(FavPage.class);

    public FavPage() {

        methods = new Methods();

    }

    public void favorite() {

    /*    methods.click(By.xpath("//*[@id='product-577328']/div[2]/div[3]/a[4]"));
        logger.info("1. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-512553']/div[2]/div[3]/a[4]"));
        logger.info("2. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-565088']/div[2]/div[3]/a[4]"));
        logger.info("3. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-561234']/div[2]/div[3]/a[4]"));
        logger.info("4. ürün favorilere eklendi.");*/

     /*  for (int i = 6; i < 10; i++) {
            methods.waitBySeconds(2);
            methods.click(By.xpath("//*[@class='fa fa-heart'][i]"));
            methods.waitBySeconds(2);

        }

        methods.waitBySeconds(2);*/

        List<WebElement> favItems = driver.findElements(By.cssSelector(".product-list>.product-cr>.grid_2>.hover-menu>.add-to-favorites"));

        for (int i = 7; i < 11; i++) {
            favItems.get(i).click();
            methods.waitBySeconds(2);


        }


    }

}