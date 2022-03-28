package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.FavPage;
import com.testinium.page.FilterPage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class FilterTest extends BaseTest {

    @Test

    public void filterTest(){

        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        FavPage favPage = new FavPage();
        FilterPage filterPage = new FilterPage();

        loginPage.login();
        productPage.selectProduct();
        favPage.favorite();
        filterPage.filterProducts();




    }





}
