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

        methods.sendKeys(By.id("#credit-card-owner"),"Nihat Orhun Zengi");








    }


}
