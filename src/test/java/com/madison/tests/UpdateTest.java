package com.madison.tests;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

/**
 * Created by alexandrufilip on 7/27/2017.
 */

import com.emag.steps.AddProductToCartSteps;
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
        private AddProductToCartSteps addProductToCartSteps;



    @Test
    public void emagSearchTest() {

        addProductToCartSteps.navigateToHomePage();
        addProductToCartSteps.searchTermAndNavigateToRandomSearchPage("CHELSEA TEE");
        addProductToCartSteps.clickOnRandomProduct();
        addProductToCartSteps.getProductTitleAndClickOnAddToCartButton();
        addProductToCartSteps.clickOnShowCartDetails();
        addProductToCartSteps.checkByTitleIfProductWasAddedInCart();
    }









}
