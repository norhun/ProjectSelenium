package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.Test;

public class BankTest extends BaseTest {

    @Test

    public void bankTest(){

        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        FavPage favPage = new FavPage();
        BasketPage basketPage = new BasketPage();
        AddressPage addressPage = new AddressPage();
        BankPage bankPage = new BankPage();

        loginPage.login();
        productPage.selectProduct();
        favPage.favorite();
        basketPage.basket();
        addressPage.address();
        bankPage.bank();




    }




}
