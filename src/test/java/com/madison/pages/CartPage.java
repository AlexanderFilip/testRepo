package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://www.qa3.madison.ro/checkout/cart/")
public class CartPage extends PageObject {


    @DefaultUrl("http://qa3.madison.com/checkout/cart/")
    public class HomePage extends PageObject {


        @FindBy(css = "[class~=input-text required-entry]")
        private WebElement searchBar;

        @FindBy(css = "[class~=button search-button")
        private WebElement searchButton;

        @FindBy(css = " [class~=button2 btn-update]")
        private WebElement updateButton;

        @FindBy(css = "[class~=button2 btn-empty")
        private WebElement emptyButton;

        @FindBy(css = "[class~=header-minicart")
        private WebElement cartButton;

        @FindBy(css = "[class~=input-text qty")
        private WebElement productBar;


        public void goToCart() {
            cartButton.click();
        }

        @FindBy(css = ".main-product-title")
        private List<WebElement> cartProducts;


        public List<WebElement> getProductsFromCart() {
            return cartProducts;
        }

        @FindBy(css = "[class~=input-text required-entry]")
        private WebElement cartProduct;

        public Boolean isProductInCart(String productTitle) {
            for (WebElement cartProduct : cartProducts) {
                if (productTitle.equals(cartProduct.getText())) {
                    return true;
                }
            }
            return false;
        }

        public void searchTerm(String keyword) {
            searchBar.sendKeys(keyword);
            searchBar.submit();
            //  searchButton.click();
        }

        public void doUpdate() {
            updateButton.click();
        }

        public void changeQuantity()
        {
            productBar.sendKeys("55"); // fails
        }

        public void makeEmpty()
        {
          emptyButton.click();
        }
    }


}


