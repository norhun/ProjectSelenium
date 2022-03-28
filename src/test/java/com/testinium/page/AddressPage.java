package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AddressPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(FavPage.class);

    public AddressPage(){


        methods = new Methods();
    }

    public void address(){

        //adres bilgileri doldurulur.

        methods.click(By.xpath("//*[@id='shipping-tabs']/a[2]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#address-firstname-companyname"),"nihat");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#address-lastname-title"),"zengi");
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector("#address-zone-id"));
        methods.click(By.xpath("//*[@id='address-zone-id']/option[8]"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector("#address-county-id"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='address-county-id']/option[5]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#district"),"Adnan kahveci mah.");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#address-address-text"),"Beylikduzu/Istanbul");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#address-postcode"),"34520");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#address-telephone"),"2122123122");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("#address-mobile-telephone"),"5347777777");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(2);





    }


}
