package tests;

import helpers.DataHelper;
import models.Ticket;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.BookTicketPage;
import page_objects.LoginPage;
import page_objects.MyTicketPage;
import page_objects.RegisterPage;

public class MyTicketTest extends BaseTest {
    MyTicketPage myTicketPage = new MyTicketPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    BookTicketPage bookTicketPage = new BookTicketPage();

    String departDate = "5/8/2021";
    String departFrom = "Đà Nẵng";
    String arriveAt = "Huế";
    String seatType = "Hard bed";
    String ticketAmount = "1";

    @Test(description = "User can cancel a ticket")
    public void TC01() {
        String email = DataHelper.getRandomEmail();
        String password = DataHelper.getRandomText();
        String pid = DataHelper.getRandomNumber();

        registerPage.gotoRegisterPage();
        registerPage.register(email, password, password, pid);

        loginPage.gotoLoginPage();
        loginPage.login(email, password);

        bookTicketPage.gotoBookTicketPage();
        bookTicketPage.bookTicket(departDate, departFrom, ticketAmount, seatType, arriveAt);

        Ticket ticket = new Ticket();
        ticket.setDepartArrive(departDate);
        ticket.setDepartStation(departFrom);
        ticket.setAmountTicket(ticketAmount);
        ticket.setSeatType(seatType);
        ticket.setDepartArrive(arriveAt);

        myTicketPage.gotoMyTicketPage();
        myTicketPage.cancelTicket(ticket);

        boolean actualResult = myTicketPage.checkTicketExist(ticket);
        Assert.assertFalse(actualResult);
    }
}
