package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.FavPage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;


public class FavTest extends BaseTest {

    @Test

        public void favTest(){

        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        FavPage favPage = new FavPage();

        loginPage.login();
        productPage.selectProduct();
        favPage.favorite();



    }




}
