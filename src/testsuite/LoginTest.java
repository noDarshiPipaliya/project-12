package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        sendTextToElement(By.id("txtUsername"), "Admin");

        sendTextToElement(By.id("txtPassword"), "admin123");

        clickOnElement(By.xpath("//input[@id='btnLogin']"));


        String expectedMessage = "Welcome Fathi";

        WebElement actualMessageelement = driver.findElement(By.xpath("//a[@id='welcome']"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("successfully login", expectedMessage, actualMessage);


    }


}
