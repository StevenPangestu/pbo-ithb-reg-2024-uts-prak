import java.util.Date;

import Model.Classes.OnlinePayment;
import Model.Classes.Passenger;
import Model.Classes.Reservation;
import Model.Classes.Ticket;
import Model.Classes.Train;
import Model.Enumeration.ClassType;
import Model.Enumeration.TicketStatus;
import Model.Enumeration.TrainType;
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Train firstClass = new Train(001, "firstClassTrain", TrainType.STANDARD);
        Train BusinessClass = new Train(001, "firstClassTrain", TrainType.FASTTRAIN);
        Train EconomyClass = new Train(001, "firstClassTrain", TrainType.STANDARD);

        Reservation reservation1 = new Reservation("R01", new Date());
        Reservation reservation2 = new Reservation("R02", new Date());

        Ticket ticket1 = new Ticket("T001", 0, "12", ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT,
                BusinessClass);
        Ticket ticket2 = new Ticket("T002", 0, "10", ClassType.FIRST_CLASS, TicketStatus.AWAITING_PAYMENT,
                firstClass);
        Ticket ticket3 = new Ticket("T003", 0, "6", ClassType.ECONOMY_CLASS, TicketStatus.AWAITING_PAYMENT,
                EconomyClass);

        Passenger passenger1 = new Passenger("P001", "Luis", 0, 19);
        Passenger passenger2 = new Passenger("P002", "Alfons", 1, 19);

        OnlinePayment payment1 = new OnlinePayment("Payment001", "Paypal", TicketStatus.AWAITING_PAYMENT, ticket1);
        OnlinePayment payment2 = new OnlinePayment("Payment002", "DOKU", TicketStatus.PAID, ticket2);
        OnlinePayment payment3 = new OnlinePayment("Payment003", "Xendit", TicketStatus.CANCELLED, ticket3);

        payment1.makePayment(1000000);
        payment3.makePayment(2000000);
        Controller controller = new Controller();

        System.out.println(controller.calculateTotalRevenue());
    }
}
