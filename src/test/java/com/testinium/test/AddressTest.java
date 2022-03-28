package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.Test;

public class AddressTest extends BaseTest {

    @Test

    public void addressTest(){

        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        FavPage favPage = new FavPage();
        BasketPage basketPage = new BasketPage();
        AddressPage addressPage = new AddressPage();

        loginPage.login();
        productPage.selectProduct();
        favPage.favorite();
        basketPage.basket();
        addressPage.address();




    }



}
