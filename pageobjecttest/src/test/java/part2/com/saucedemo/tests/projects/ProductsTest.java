package part2.com.saucedemo.tests.projects;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.saucedemo.pages.ProductsPage;

import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n \n Products Header is not displayed.");
    }
}
