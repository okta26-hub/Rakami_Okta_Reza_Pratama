package Testing_awal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter_bag_Positive_test {
    public static void main(String[] args) throws Exception {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Testing\\login\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("visual_user");

        Thread.sleep(5000);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");

        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement filter1 = driver.findElement(By.className("select_container"));
        filter1.click();

        Thread.sleep(5000);

        WebElement filter2 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
        filter2.click();

        Thread.sleep(5000);

        WebElement filter3 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
        filter3.click();

        Thread.sleep(5000);

        WebElement filter4 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
        filter4.click();

        Thread.sleep(5000);

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
