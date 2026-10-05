package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectCities(String from,
                             String to) {

        Select fromPort =
                new Select(driver.findElement(
                        By.name("fromPort")));

        Select toPort =
                new Select(driver.findElement(
                        By.name("toPort")));

        fromPort.selectByVisibleText(from);
        toPort.selectByVisibleText(to);
    }

    public void clickFindFlight() {

        driver.findElement(
                By.cssSelector("input[type='submit']"))
                .click();
    }
}