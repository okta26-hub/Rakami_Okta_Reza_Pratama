package Testing_awal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_bag_to_card_positive_test_case {
    public static void main(String[] args) throws Exception {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Testing\\login\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");


        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");

        Thread.sleep(5000);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");

        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement add_to_card= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        add_to_card.click();

        Thread.sleep(5000);

        WebElement shopping_cart = driver.findElement(By.className("shopping_cart_link"));
        shopping_cart.click();

        Thread.sleep(5000);

        WebElement checkout= driver.findElement(By.id("checkout"));
        checkout.click();

        Thread.sleep(5000);


        WebElement nameInputfirst = driver.findElement(By.id("first-name"));
        nameInputfirst.sendKeys("okta");

        Thread.sleep(5000);

        WebElement nameInputlast = driver.findElement(By.id("last-name"));
        nameInputlast.sendKeys("reza");

        Thread.sleep(5000);

        WebElement namepostalcode = driver.findElement(By.id("postal-code"));
         namepostalcode.sendKeys("1600");

        Thread.sleep(5000);

         WebElement logincontinue = driver.findElement(By.id("continue"));
        logincontinue.click();

        Thread.sleep(5000);

        WebElement loginfinis = driver.findElement(By.id("finish"));
        loginfinis.click();

        Thread.sleep(5000);

        WebElement complete = driver.findElement(By.className("complete-text"));
        complete.click();


        Thread.sleep(5000);

        // Validasi: Memeriksa apakah pengguna berhasil masuk dengan melihat URL setelah login
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://www.saucedemo.com/checkout-complete.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal atau tidak sesuai test case.");
        }

        driver.quit();
    }
}
