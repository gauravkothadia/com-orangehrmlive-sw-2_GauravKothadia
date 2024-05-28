package testsuite;
/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Before
    public void browserSetup(){
        openBrowser("https://opensource-demo.orangehrmlive.com/");
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        // Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        // Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        // Verify the ‘Dashboard’ text is display
        String expectedHeading = "Dashboard";
        String actualHeading = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']//h6")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
