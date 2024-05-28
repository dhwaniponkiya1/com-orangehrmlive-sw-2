package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 4. Write down the following test into
 *  * ‘ForgotPasswordTest’ class
 *  * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 *  * * click on the ‘Forgot your password’ link
 *  * * Verify the text ‘Reset Password’
 */

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        forgotPasswordLink.click();

        String expectedText = "Reset Password";
        WebElement resetPasswordText = driver.findElement(By.xpath("//h6"));
        String actualText = resetPasswordText.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
