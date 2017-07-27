
package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


@DefaultUrl("http://www.qa3.madison.ro/customer/account/login/")
public class LoginPage extends PageObject {


    @FindBy(css="[class~=button search-button]")
    private WebElement searchBar;

    @FindBy(css="[class~=button search-button")
    private WebElement searchButton;

    public void searchTerm(String keyword) {
        searchBar.sendKeys(keyword);
        searchButton.click();
    }

}
