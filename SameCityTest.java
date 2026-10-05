package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SameCityTest extends BaseTest {

    @Test
    public void sameDepartureAndDestination() {

        Select from =
                new Select(driver.findElement(
                        By.name("fromPort")));

        Select to =
                new Select(driver.findElement(
                        By.name("toPort")));

        from.selectByVisibleText("Boston");
        to.selectByVisibleText("Boston");

        driver.findElement(
                By.cssSelector("input[type='submit']"))
                .click();

        Assert.assertTrue(true);

        System.out.println(
                "Same City Test Executed");
    }
}