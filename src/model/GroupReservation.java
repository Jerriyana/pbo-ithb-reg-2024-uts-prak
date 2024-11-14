package model;

public class GroupReservation extends Reservation{
    private String groupName; 
    private int numberofPassengger;

    public GroupReservation(String reservationID, String reservationDate, String groupName, int numberofPassengger) {
        super(reservationID, reservationDate);
        this.groupName = groupName;
        this.numberofPassengger = numberofPassengger;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberofPassengger() {
        return numberofPassengger;
    }

    public void setNumberofPassengger(int numberofPassengger) {
        this.numberofPassengger = numberofPassengger;
    }        
}
