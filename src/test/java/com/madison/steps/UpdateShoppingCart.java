package com.madison.steps;


import com.madison.pages.HomePage;
import com.madison.pages.ProductViewPage;
import net.thucydides.core.annotations.Step;
import com.madison.pages.CartPage;
import static org.junit.Assert.assertTrue;

/**
 * Created by alexandrufilip on 7/26/2017.
 */
public class UpdateShoppingCart {

    private int value;
    private HomePage homePage;
    private CartPage cartPage;
    private ProductViewPage productViewPage;


    @Step
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step
    public void navigateToCartPage() {
        cartPage.open();
    }

    @Step
    public void goToCart()
    {
        homePage.goToCart();
    }

    @Step
    public void searchTerm(String keyword) {
        homePage.searchTerm(keyword);
    }

    @Step
    public void changeQuantity(){
        //cartPage.changeQuantity
    }
//    @Step
//    public void  doUpdate(){
//        cartPage.doUpdate();
//    }



}
