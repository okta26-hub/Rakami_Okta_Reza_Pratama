package Testing_awal;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_bag_and_remove_item_positive_test {

    public static void main(String[] args) throws Exception {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Testing\\login\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("performance_glitch_user");

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

        WebElement add_to_card2= driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        add_to_card2.click();

        Thread.sleep(5000);

        WebElement add_to_card3= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        add_to_card3.click();

        Thread.sleep(5000);

        WebElement add_to_card4= driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        add_to_card4.click();

        Thread.sleep(5000);

        WebElement add_to_card5= driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        add_to_card5.click();

        Thread.sleep(5000);

        WebElement add_to_card6= driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        add_to_card6.click();

        Thread.sleep(5000);

        WebElement shopping_cart = driver.findElement(By.className("shopping_cart_link"));
        shopping_cart.click();

        Thread.sleep(5000);

        WebElement remove1= driver.findElement(By.id("remove-sauce-labs-backpack"));
        remove1.click();

        Thread.sleep(5000);

        WebElement remove2= driver.findElement(By.id("remove-sauce-labs-bike-light"));
        remove2.click();

        Thread.sleep(5000);

        WebElement remove3= driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        remove3.click();

        WebElement remove4= driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        remove4.click();

        Thread.sleep(5000);

        WebElement remove5= driver.findElement(By.id("remove-sauce-labs-onesie"));
        remove5.click();

        Thread.sleep(5000);

        WebElement remove6= driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
        remove6.click();

        Thread.sleep(5000);

        // Validasi: Memeriksa apakah pengguna berhasil masuk dengan melihat URL setelah login
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://www.saucedemo.com/cart.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal atau tidak sesuai test case.");
        }

        driver.quit();
    }
}
