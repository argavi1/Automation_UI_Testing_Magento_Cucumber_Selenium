package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class magentoDef {

    WebDriver driver;

    @Given("User open web URL {string}")
    public void userOpenWebUrl(String URL) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @And("User click sign in hyperlink text")
    public void userClickSignInHyperlinkText() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
    }

    @And("User Input email {string} and password {string}")
    public void userInputEmailAndPassword(String email, String password) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(5000);
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @And("User click sign in button")
    public void userClickSignInButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("send2")).click();
    }

    @And("User click Mens dropdown")
    public void userClickMensDropdown() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("ui-id-5")).click();
    }

    @And("User click Jackets hyperlink text on Top section")
    public void userClickJacketsHyperlinkTextOnTopSection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Jackets']")).click();
    }

    @And("User click Proteus Fitness Jackshirt section")
    public void userClickProteusFitnessJackshirtSection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@alt='Proteus Fitness Jackshirt']")).click();
    }

    @And("User click XS size and color black")
    public void userClickXSSizeAndColorBlack() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("option-label-size-143-item-166")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("option-label-color-93-item-49")).click();
    }

    @And("User change the qty")
    public void userChangeTheQty() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("qty")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("qty")).sendKeys("2");
    }

    @And("User click Add to chart button")
    public void userClickAddToChartButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("product-addtocart-button")).click();
    }

    @And("User click Pants hyperlink text on Bottoms section")
    public void userClickPantsHyperlinkTextOnBottomsSection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Pants']")).click();
    }

    @And("User click Cronus Yoga Pant section")
    public void userClickCronusYogaPantSection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@alt='Cronus Yoga Pant ']")).click();
    }

    @And("User click size and color black")
    public void userClickSizeAndColorBlack() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("option-label-size-143-item-175")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("option-label-color-93-item-49")).click();
    }

    @And("User click Cart icon")
    public void userClickCartIcon() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='minicart-wrapper']")).click();
    }

    @And("User click proceed to checkout button")
    public void userClickProceedToCheckoutButton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("top-cart-btn-checkout")).click();
    }

    @And("User click order summary dropdown")
    public void userClickOrderSummaryDropdown() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(By.xpath("//div[@class='title']")).click();
    }

    @And("User verify product and price jackets on order summary section")
    public void userVerifyProductAndPriceJacketsOnOrderSummarySection() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Proteus Fitness Jackshirt']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='$90.00']")).isDisplayed());
    }

    @And("User verify product and price pants on order summary section")
    public void userVerifyProductAndPricePantsOnOrderSummarySection() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Cronus Yoga Pant ']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='$48.00']")).isDisplayed());
    }

    @And("User click next button")
    public void userClickNextButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
    }

    @And("User click Place Order button")
    public void userClickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@title='Place Order']")).click();
    }

    @And("User click automation tester dropdown")
    public void userClickAutomationTesterDropdown() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
    }

    @And("User click My Account hyperlink text")
    public void userClickMyAccountHyperlinkText() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()='My Account'])[1] ")).click();
    }

    @And("User click My Order hyperlink text")
    public void userClickMyOrderHyperlinkText() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='My Orders']")).click();
    }

    @When("User click the latest View Order hyperlink text")
    public void userClickTheLatestViewOrderHyperlinkText() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='View Order'])[1]")).click();
    }

    @Then("User could verify product and price on items ordered section")
    public void userCouldVerifyProductAndPriceOnItemsOrderedSection() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Proteus Fitness Jackshirt']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='$90.00']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Cronus Yoga Pant ']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='$48.00']")).isDisplayed());
    }
}
