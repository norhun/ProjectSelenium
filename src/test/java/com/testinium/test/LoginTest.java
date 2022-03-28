package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test

    public void loginTest()  {

        LoginPage loginPage = new LoginPage();


        loginPage.login();



    }




}
