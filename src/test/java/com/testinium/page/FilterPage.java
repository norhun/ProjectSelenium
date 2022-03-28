package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

public class FilterPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(FilterPage.class);



    public void filterProducts(){

        //ana Sayfaya geri dönme

        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));
        logger.info("ana sayfaya geri dönüldü.");

        methods.waitBySeconds(2);

        //Puan Kataloguna gitme

        methods.click(By.xpath("//*[@id='mainNav']/div[1]/div/div[2]/a"));

        logger.info("Puan kataloğuna gidildi.");

        methods.waitBySeconds(2);


        // Türk Klasiklerini seçme

        methods.click(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));

        logger.info("Türk Klasikleri seçildi");

        methods.waitBySeconds(2);



        //Filtreleme alanından Yüksek Oylama seçme

        methods.selectByText(By.xpath("//*[@id='content']/div/div/div[1]/div/div[1]/select"), "Yüksek Oylama");
        logger.info("Yüksek oylama seçildi.");
        methods.waitBySeconds(2);






    }





}
