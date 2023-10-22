package Testing_awal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Negative_test_case {
    public static void main(String[] args) throws Exception {
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Testing\\login\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("locked_out_user");

        Thread.sleep(5000);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");

        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(5000);

        // Validasi: Memeriksa apakah pengguna berhasil masuk dengan melihat URL setelah login
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal, tidak sesuai test case atau negative test case.");
        }

        driver.quit();
    }
}
