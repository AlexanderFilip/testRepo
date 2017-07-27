package com.emag.steps;

import com.emag.pages.CartPage;
import com.emag.pages.HomePage;
import com.emag.pages.ProductViewPage;
import com.emag.pages.SearchResultsListPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by alexandrufilip on 7/26/2017.
 */
public class ContinueShopping {

    private HomePage homePage;
    private SearchResultsListPage searchResultsListPage;
    private ProductViewPage productViewPage;
    private CartPage cartPage;


    @Step
    public void navigateToHomePage() {
        homePage.open();
    }


    @Step
    public void searchTerm(String keyword) {
        homePage.searchTerm(keyword);
    }

    @Step
    public void navigateToRandomSearchPage(String keyword) {
        searchResultsListPage.redirectToRandomProductsListPage(keyword);
    }















}