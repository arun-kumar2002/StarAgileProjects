package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservePage {

    WebDriver driver;
    WebDriverWait wait;

    public ReservePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By chooseFlight =
            By.xpath("(//input[@type='submit'])[1]");

    public void selectFlight() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        chooseFlight));

        driver.findElement(chooseFlight).click();
    }
}