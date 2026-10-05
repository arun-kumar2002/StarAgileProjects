package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.BaseTest;

public class SearchFlightTest extends BaseTest {

    @Test
    public void searchFlight() {

        HomePage home = new HomePage(driver);

        home.selectCities("Boston", "New York");
        home.clickFindFlight();

        String title = driver.getTitle();

        System.out.println("Title = " + title);

        Assert.assertTrue(
                title.contains("BlazeDemo"));

        System.out.println("Flight Search Successful");
    }
}