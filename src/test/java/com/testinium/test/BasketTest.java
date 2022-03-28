package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.BasketPage;
import com.testinium.page.FavPage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class BasketTest extends BaseTest {

    @Test

    public void basketTest(){

        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        FavPage favPage = new FavPage();
        BasketPage basketPage = new BasketPage();

        loginPage.login();
        productPage.selectProduct();
        favPage.favorite();
        basketPage.basket();






    }


}
