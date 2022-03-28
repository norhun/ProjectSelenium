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
methods.scrollWithAction(By.id("product-565088"));

methods.waitBySeconds(2);

//methods.selectByText(By.cssSelector("select#review-sort-selection"), "Oylama (Yüksek > Düşük)");


                //Favorilere 4 ürün ekleme ve kontrolü

        methods.click(By.xpath("//*[@id='product-577328']/div[2]/div[3]/a[4]"));
        logger.info("1. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-512553']/div[2]/div[3]/a[4]"));
        logger.info("2. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-565088']/div[2]/div[3]/a[4]"));
        logger.info("3. ürün favorilere eklendi.");
        methods.click(By.xpath("//*[@id='product-561234']/div[2]/div[3]/a[4]"));
        logger.info("4. ürün favorilere eklendi.");




        methods.waitBySeconds(2);

//ana Sayfaya geri dönme

        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));

        methods.waitBySeconds(2);

        //Puan Kataloguna gitme

        methods.click(By.xpath("//*[@id='mainNav']/div[1]/div/div[2]/a"));

        methods.waitBySeconds(2);


        // Türk Klasiklerini seçme

        methods.click(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));

        logger.info("Türk Klasikleri seçildi");

        methods.waitBySeconds(2);



        //Filtreleme alanından Yüksek Oylama seçme

        methods.selectByText(By.xpath("//*[@id='content']/div/div/div[1]/div/div[1]/select"), "Yüksek Oylama");
        logger.info("Yüksek oylama seçildi.");
        methods.waitBySeconds(2);

        // Tüm kitaplar>Hobi tıklanır.

        methods.scrollWithAction(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));

        methods.waitBySeconds(2);

        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));

        methods.waitBySeconds(3);

        //Sayfadan random ürün seçimi yapılır sepete eklenir.

methods.randomElement();

methods.waitBySeconds(3);

methods.click(By.cssSelector("#button-cart"));

methods.waitBySeconds(3);

//Listelerim>Favorilerim gidilir

        methods.scrollWithAction(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);

        //Favori Listesinde yer alan , 3.ürün silinir.

       /* methods.click(By.cssSelector("//*[@id='product-577328']/div[2]/div[3]/a[3]/i"));

        methods.waitBySeconds(4);*/




        //Sepetime gidilir ürün arttırımı gerceklestirilir.

        methods.click(By.cssSelector("#cart-items"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySeconds(2);



       // String deger = methods.getAttribute(By.xpath("//*[@id='cart_module']/div[1]/table/tbody/tr/td[4]/form/input[1]"),"value");


        methods.waitBySeconds(2);
        methods.doubleClick(By.cssSelector(".js-cart-update-product>input"));

        methods.sendKeys(By.cssSelector(".js-cart-update-product>input"),"2");
        //methods.sendKeys(By.id("deger"),"2");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='cart_module']/div[2]/table/tbody/tr/td[4]/form/i"));


//Ürün satın al tıklanır.

        methods.click(By.cssSelector(".to-wishlist"));
        methods.waitBySeconds(2);

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

        // Banka bilgileri girilir.

        methods.sendKeys(By.id("#credit-card-owner"),"Nihat Orhun Zengi");








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
