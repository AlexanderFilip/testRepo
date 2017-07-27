
package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


@DefaultUrl("http://www.qa3.madison.ro")
public class HomePage extends PageObject {


    @FindBy(css = "[class~=input-text required-entry]")
    private WebElement searchBar;

    @FindBy(css = "[class~=button search-button]")
    private WebElement searchButton;


    @FindBy(css = "[class~=header-minicart]")
    private WebElement cartIconButton;

    @FindBy(css = "[class~=cart-link]")
    private WebElement cartAccessButton;

    public void searchTerm(String keyword) {
        searchBar.sendKeys(keyword);
        searchBar.submit();
        //  searchButton.click();
    }

    public void goToCart(){
//        cartIconButton.click();
        //cartAccessButton.click();
    }



}
