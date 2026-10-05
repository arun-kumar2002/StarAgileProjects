package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageLoads() {

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("BlazeDemo"));

        Assert.assertTrue(
                driver.findElement(By.name("fromPort")).isDisplayed());

        Assert.assertTrue(
                driver.findElement(By.name("toPort")).isDisplayed());

        System.out.println("Homepage loaded successfully");
    }
}