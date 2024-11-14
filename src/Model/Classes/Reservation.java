package Model.Classes;

import java.util.Date;

import Model.Enumeration.TicketStatus;

public class Reservation {
    private String reservationID;
    private Date ReservationDate;
    private Ticket ticket;

    public Reservation(String reservationID, Date reservationDate) {
        this.reservationID = reservationID;
        ReservationDate = reservationDate;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        ReservationDate = reservationDate;
    }

    public void reserveSeat(String seatNumber) {

        ticket.setSeatNumber(seatNumber);

    }

    public void cancelReservation(OnlinePayment payment) {
        ticket.setStatus(TicketStatus.CANCELLED);
    }
}
