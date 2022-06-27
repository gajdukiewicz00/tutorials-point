import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    static WebDriver driver;

    @BeforeClass
    public static void indiDriver(){
        String path = System.getProperty("user.dir");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/");
    }

    @Test
    public void VerifyTitle() {
        System.out.println("In Verify Title case test");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Text and Video"));
    }

    @Test
    public void VerifyHaiding() {
        System.out.println("In Verify Haiding Text above search test case");
        String expectdearchHaiding = "   Enjoy theory and lab at the same time, right here online    ";
        String actualHaiding = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/h2")).getText();
        Assert.assertEquals(expectdearchHaiding,actualHaiding);
        }
    @AfterClass
    public static void tearTest() {
        driver.quit();
    }
}

