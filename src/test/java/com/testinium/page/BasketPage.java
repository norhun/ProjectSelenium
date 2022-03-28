package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BasketPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(FavPage.class);

    public BasketPage(){

        methods = new Methods();



    }

    public void basket(){


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



    }


}
