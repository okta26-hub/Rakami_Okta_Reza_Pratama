package StepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filter_test {
    WebDriver driver;

    @Given("I go homepage")
    public void iAmOnTheSauceDemoHomepage() {
        // Inisialisasi driver dan buka halaman awal
       // System.setProperty("webdriver.chrome.driver", "lokasi/chromedriver.exe"); // Sesuaikan dengan lokasi chromedriver.exe Anda
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I Log in with username {string} and password {string}")
    public void iLogInWithUsernameAndPassword(String username, String password) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @When("I filter products by {string}")
    public void iFilterProductsBy(String filterOption) {
        WebElement filterDropdown = driver.findElement(By.className("select_container"));
        filterDropdown.click();

        WebElement filterOptionElement = driver.findElement(By.xpath("//option[text()='" + filterOption + "']"));
        filterOptionElement.click();
    }

    @Then("I should see the filtered products")
    public void iShouldSeeTheFilteredProducts() {
        WebElement filter2 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
        filter2.click();

        WebElement filter3 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
        filter3.click();


        WebElement filter4 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
        filter4.click();
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal atau tidak sesuai test case.");
        }

        driver.quit();
    }
}


