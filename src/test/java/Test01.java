import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Create a new customer
 * Go to customers tab and verify the new customer is added
 *
 * Try to make the code optimal
 * */
public class Test01 {
    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(alwaysRun = true, description = "Create a customer.Verify the creation.")
    public void step1(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Bank Manager Login']")));
        driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='addCrust()']")));
        driver.findElement(By.cssSelector("button[ng-click='addCrust()']")).click();

        // create customer
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        driver.findElement(By.cssSelector("")).sendKeys("");



        // go to customers , verify creation



    }
}
