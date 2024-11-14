package Model.Classes;

import Model.Enumeration.*;
import Controller.Controller;

public class OnlinePayment implements Payment {
    private String transactionID, paymentGateway;
    private TicketStatus ticketStatus;
    private Ticket ticket;

    public OnlinePayment(String transactionID, String paymentGateway, TicketStatus ticketStatus, Ticket ticket) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
        this.ticketStatus = ticketStatus;
        this.ticket = ticket;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(double amount) {
        Controller controller = new Controller();

        if (ticketStatus.equals(TicketStatus.PAID)) {
            System.out.println("Ticket sudah dibayar");
        } else {
            if (amount < ticket.getPrice()) {
                System.out.println("Uang tidak cukup");
            } else {
                ticket.setStatus(TicketStatus.PAID);
                System.out.println("Ticket berhasil dibayar dengan harga : " + ticket.getPrice());
                System.out.println("Sisa uang : " + (amount - ticket.getPrice()));
                double revenue = ticket.getPrice();
                controller.calculateTotalRevenue(revenue);
            }
        }

    }
}
