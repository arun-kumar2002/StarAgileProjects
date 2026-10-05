package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservePage;
import utils.BaseTest;

public class BlankCreditCardTest extends BaseTest {

    @Test
    public void blankCreditCard() {

        HomePage home = new HomePage(driver);

        home.selectCities("Boston", "New York");
        home.clickFindFlight();

        ReservePage reserve =
                new ReservePage(driver);

        reserve.selectFlight();

        driver.findElement(By.name("inputName"))
                .sendKeys("Arun");

        driver.findElement(
                By.xpath("//input[@value='Purchase Flight']"))
                .click();

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Thank you"));

        System.out.println(
                "Blank Card Test Executed");
    }
}