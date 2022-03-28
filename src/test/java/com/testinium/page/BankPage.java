package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BankPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(FavPage.class);

    public BankPage(){

        methods = new Methods();


    }

    public void bank(){

        methods.sendKeys(By.cssSelector("#credit-card-owner"),"Nihat Orhun Zengi");
        methods.sendKeys(By.cssSelector("#credit_card_number_1"),"6656");
        methods.sendKeys(By.cssSelector("#credit_card_number_2"),"9000");
        methods.sendKeys(By.cssSelector("#credit_card_number_3"),"0879");
        methods.sendKeys(By.cssSelector("#credit_card_number_4"),"0824");








    }


}
