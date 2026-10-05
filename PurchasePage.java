package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    By purchaseButton =
            By.xpath("//input[@value='Purchase Flight']");

    public void passengerDetails() {

        driver.findElement(By.name("inputName"))
                .sendKeys("Arun Kumar");

        driver.findElement(By.name("address"))
                .sendKeys("Bangalore");

        driver.findElement(By.name("city"))
                .sendKeys("Bangalore");

        driver.findElement(By.name("state"))
                .sendKeys("Karnataka");

        driver.findElement(By.name("zipCode"))
                .sendKeys("560001");

        driver.findElement(By.name("creditCardNumber"))
                .sendKeys("123456789");
    }

    public void enterData(
            String name,
            String address,
            String city,
            String state,
            String zip,
            String cardNumber) {

        driver.findElement(By.name("inputName"))
                .sendKeys(name);

        driver.findElement(By.name("address"))
                .sendKeys(address);

        driver.findElement(By.name("city"))
                .sendKeys(city);

        driver.findElement(By.name("state"))
                .sendKeys(state);

        driver.findElement(By.name("zipCode"))
                .sendKeys(zip);

        driver.findElement(By.name("creditCardNumber"))
                .sendKeys(cardNumber);
    }

    public void purchaseFlight() {

        driver.findElement(purchaseButton).click();
    }
}