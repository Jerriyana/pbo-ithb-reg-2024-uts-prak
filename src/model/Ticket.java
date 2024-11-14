package model;

public class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private double price;
    private Reservation reservation;
    private OnlinePayment onlinePayment;
    private Passenger passengger;
    private Train train;

    public void printTicket(Ticket ticket){
        System.out.println("Ticket ID = " + ticketID + 
        "Seat Number = " + seatNumber + 
        "Class Type = " + classType + 
        "Status = " + status + 
        "Price = " + price + 
        "Reservation = " + reservation +
        "Online Payment = " + onlinePayment + 
        "Passengger = " + passengger + 
        "Train = " + train
        );
    }     
    
    public void getTicketStatus(Ticket ticket) {
        System.out.println(status);
    }

    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price,
            Reservation reservation, OnlinePayment onlinePayment, Passenger passengger, Train train) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
        this.reservation = reservation;
        this.onlinePayment = onlinePayment;
        this.passengger = passengger;
        this.train = train;
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

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }   

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public OnlinePayment getOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public Passenger getPassengger() {
        return passengger;
    }

    public void setPassengger(Passenger passengger) {
        this.passengger = passengger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
