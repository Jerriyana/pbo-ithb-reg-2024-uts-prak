package model;

public class Reservation {
    private String reservationID; 
    private String reservationDate;

    public void reserveSeat(String tanggal){        
        setReservationID("R1");
        setReservationDate(tanggal);
    }

    public void getReserveSeat(Reservation reservation){
        System.out.println("Reservation ID : " + reservationID +
        "\nreservationDate : " + reservationDate
        );
        
    }

    public void cancelReservation(){
        
    }

    public Reservation(String reservationID, String reservationDate) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }         
}
