package model;

public class Passenger {
    private String passanggerID; 
    private String passanggerName; 
    private int passanggerGender; 
    private int passanggerAge;
    
    public void getPassengerInfo(Passenger passenger){
        System.out.println("ID = " + passanggerID + 
        "\nPassangger Name = " + passanggerName + 
        "\nPassangger Gender = " + passanggerGender +
        "\nPassangger Age = " + passanggerAge
        );
    }

    public Passenger(String passanggerID, String passanggerName, int passanggerGender, int passanggerAge) {
        this.passanggerID = passanggerID;
        this.passanggerName = passanggerName;
        this.passanggerGender = passanggerGender;
        this.passanggerAge = passanggerAge;
    }

    public String getPassanggerID() {
        return passanggerID;
    }

    public void setPassanggerID(String passanggerID) {
        this.passanggerID = passanggerID;
    }

    public String getPassanggerName() {
        return passanggerName;
    }

    public void setPassanggerName(String passanggerName) {
        this.passanggerName = passanggerName;
    }

    public int getPassanggerGender() {
        return passanggerGender;
    }

    public void setPassanggerGender(int passanggerGender) {
        this.passanggerGender = passanggerGender;
    }

    public int getPassanggerAge() {
        return passanggerAge;
    }

    public void setPassanggerAge(int passanggerAge) {
        this.passanggerAge = passanggerAge;
    }

    
    
}
