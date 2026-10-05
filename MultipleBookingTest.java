package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;
import utils.BaseTest;

public class MultipleBookingTest extends BaseTest {

    @DataProvider(name = "bookings")
    public Object[][] bookingData() {

        return new Object[][] {
                {"Arun", "11111111"},
                {"David", "22222222"},
                {"John", "33333333"}
        };
    }

    @Test(dataProvider = "bookings")
    public void multipleBookings(
            String passengerName,
            String cardNo) {

        HomePage home = new HomePage(driver);

        home.selectCities("Boston", "New York");
        home.clickFindFlight();

        ReservePage reserve =
                new ReservePage(driver);

        reserve.selectFlight();

        PurchasePage purchase =
                new PurchasePage(driver);

        purchase.enterData(
                passengerName,
                "Bangalore",
                "Bangalore",
                "Karnataka",
                "560001",
                cardNo);

        purchase.purchaseFlight();

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Thank you"));

        System.out.println(
                "Booking Completed For "
                        + passengerName);
    }
}