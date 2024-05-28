package testsuite;
/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    @Before
    public void browserSetup(){
        openBrowser("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        // click on the ‘Forgot your password’ link
        driver.findElement(By.cssSelector("div.orangehrm-login-forgot>p")).click();
        // Verify the text ‘Reset Password’
        String expectedHeading = "Reset Password";
        String actualHeading = driver.findElement(By.cssSelector("div.orangehrm-forgot-password-wrapper h6")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
