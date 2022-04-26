package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class ForgotPasswordTest extends Utility {


    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        clickOnElement(By.linkText("Forgot your password?"));

        String expectedMessage = "Forgot your password?";


        WebElement actualMessageelement = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("forgot password",expectedMessage,actualMessage);

    }


}
