package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservePage;
import utils.BaseTest;

public class InvalidCardTest extends BaseTest {

    @Test
    public void invalidCardCharacters() {

        HomePage home = new HomePage(driver);

        home.selectCities("Boston", "New York");
        home.clickFindFlight();

        ReservePage reserve = new ReservePage(driver);
        reserve.selectFlight();

        driver.findElement(
                org.openqa.selenium.By.name("inputName"))
                .sendKeys("Arun");

        driver.findElement(
                org.openqa.selenium.By.name("creditCardNumber"))
                .sendKeys("@@@####");

        driver.findElement(
                org.openqa.selenium.By.xpath("//input[@value='Purchase Flight']"))
                .click();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("confirmation"));

        System.out.println("Invalid card test executed");
    }
}