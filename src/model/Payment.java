package model;

public interface Payment {
    double makePayment(Ticket ticket, OnlinePayment onlinePayment);            
}
