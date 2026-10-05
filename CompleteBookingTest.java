package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;
import utils.BaseTest;

public class CompleteBookingTest extends BaseTest {

    @Test
    public void completeBooking() {

        HomePage home = new HomePage(driver);

        home.selectCities("Boston", "New York");
        home.clickFindFlight();

        ReservePage reserve = new ReservePage(driver);
        reserve.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);

        purchase.passengerDetails();
        purchase.purchaseFlight();

        Assert.assertTrue(
                driver.getPageSource()
                .contains("Thank you for your purchase today!"));

        System.out.println("Booking Successful");
    }
}