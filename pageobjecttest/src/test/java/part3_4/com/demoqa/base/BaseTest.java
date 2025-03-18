package part3_4.com.demoqa.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import com.base.BasePage;
import com.demoqa.pages.HomePage;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //Using a static file name so that the screenshot on a failed run will not fill a folder
            File destination = new File(System.getProperty("user.dir") + "/resources/screenshots/testFailedScreen.png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot output file: " + destination);
        }
    }

    @AfterClass
    public void tearDown() {
        delay(3000);
        driver.quit();
    }
}
