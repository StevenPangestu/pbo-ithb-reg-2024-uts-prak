package Model.Classes;

import Model.Enumeration.*;

public class Ticket {
    private String ticketID, seatNumber;
    private double price;
    private ClassType classType;
    private TicketStatus status;
    private OnlinePayment onlinePayment;
    private Train train;

    public Ticket(String ticketID, double price, String seatNumber, ClassType classType, TicketStatus status,
            Train train) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.price = price;
        this.classType = classType;
        this.status = status;
        this.train = train;

        setPrice();
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public void setPrice() {
        if (train.getTrainType().equals(TrainType.FASTTRAIN)) {
            if (classType.equals(classType.FIRST_CLASS)) {
                price = 600000;
            } else if (classType.equals(classType.BUSINESS_CLASS)) {
                price = 500000;
            } else {
                price = 400000;
            }
        } else {
            if (classType.equals(classType.FIRST_CLASS)) {
                price = 350000;
            } else if (classType.equals(classType.BUSINESS_CLASS)) {
                price = 250000;
            } else {
                price = 175000;
            }
        }

        System.out.println(price);
    }

    public void printTicket() {

    }

    public void getTicketStatus() {

    }
}