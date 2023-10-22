package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_negative{
    WebDriver driver;

    @Given("I Am on the Sauce Demo homepage")
    public void halaman_login() {
        driver = new ChromeDriver();  // Inisialisasi objek WebDriver
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I Enter the username {string}")
    public void iEnterTheUsername(String username) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(username);
    }

    @And("I Enter the password {string}")
    public void iEnterThePassword(String password) {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
    }

    @And("I Click the Login button")
    public void iClickTheLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("I Should see an error message")
    public void iShouldSeeAnErrorMessage() {
        WebElement errorMessage = driver.findElement(By.cssSelector("[data-test='error']"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Pesan kesalahan ditampilkan. Pengujian berhasil sesuai test case.");
        } else {
            System.out.println("Pesan kesalahan tidak ditemukan. Pengujian gagal atau tidak sesuai test case.");
        }
        driver.quit();
    }
}
