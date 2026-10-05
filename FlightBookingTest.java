package tests;

import org.testng.annotations.Test;

import pages.ConfirmationPage;
import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;
import utils.BaseTest;

public class FlightBookingTest extends BaseTest {

    @Test
    public void bookFlight() {

        HomePage home =
                new HomePage(driver);

        home.selectCities("Boston", "New York");
        home.clickFindFlight();

        ReservePage rp =
                new ReservePage(driver);

        rp.selectFlight();

        PurchasePage pp =
                new PurchasePage(driver);

        pp.passengerDetails();
        pp.purchaseFlight();

        ConfirmationPage cp =
                new ConfirmationPage(driver);

        cp.verifyBooking();
    }
}