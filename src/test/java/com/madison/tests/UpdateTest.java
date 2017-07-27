package com.madison.tests;

import com.madison.steps.UpdateShoppingCart;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import com.madison.pages.*;
/**
 * Created by alexandrufilip on 7/27/2017.
 */

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


    @RunWith(SerenityRunner.class)
    public class UpdateTest {

        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Steps
        private UpdateShoppingCart updateShopCartSteps;

    @Test
    public void madisonCartTest() {

        updateShopCartSteps.navigateToHomePage();
        updateShopCartSteps.navigateToCartPage();
      //  updateShopCartSteps.goToCart();
      //  updateShopCartSteps.changeQuantity();
     //   updateShopCartSteps.clickUpdateButton();


    }

}
