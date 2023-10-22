package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_postive {
    WebDriver driver;

    @Given("I am on the Sauce Demo homepage")
    public void halaman_login() {
        driver = new ChromeDriver();  // Inisialisasi objek WebDriver
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter the username {string}")
    public void iEnterTheUsername(String username) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(username);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
    }

    @And("I click the Login button")
    public void iClickTheLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String expectedURL) {
        // Validasi: Memeriksa apakah pengguna berhasil masuk dengan melihat URL setelah login
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal atau tidak sesuai test case.");
        }

        driver.quit();
    }
}
