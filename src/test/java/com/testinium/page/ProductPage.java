package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage extends BaseTest {

    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);



    public ProductPage(){

        methods = new Methods();


    }

    public void selectProduct(){

        methods.waitBySeconds(2);

methods.sendKeys(By.id("search-input"),"oyuncak");

methods.waitBySeconds(2);

methods.click(By.cssSelector(".common-sprite.button-search"));

//methods.click(By.cssSelector(".pr-img-link"));

methods.waitBySeconds(2);

       // methods.scrollWithJS(By.cssSelector(".review-panel.review-panel__show-all"));
methods.scrollWithAction(By.xpath("(//*[@class='add-to-favorites'])[7]"));

methods.waitBySeconds(3);



    }

public void attributeTest(){

        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
    System.out.println("Alınan text:"+ attribute);
    logger.info("Alınan text:" + attribute);
    methods.waitBySeconds(2);


}

public void textControl(){

        String text = methods.getText(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a/b"));

    System.out.println("Alinan text:" + text);

methods.waitBySeconds(2);
}

public void valueControlTest(){

        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
    System.out.println("Alinan text: " + value);
    logger.info("Alinan text"+ value);
    Assert.assertEquals("testinium",value);
    methods.waitBySeconds(3);



}


}
