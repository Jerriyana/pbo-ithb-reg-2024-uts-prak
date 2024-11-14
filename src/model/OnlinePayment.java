package model;

public class OnlinePayment implements Payment{
    private String transactionID; 
    private String paymentGateway;    
    private Ticket ticket;

    @Override
    public double makePayment(Ticket ticket, OnlinePayment onlinePayment){                        
        System.out.println(ticket.getTrain().getTrainType());
        if(ticket.getTrain().getTrainType() == TrainType.FASTTRAIN){
            if(ticket.getClassType() == ClassType.FIRST_CLASS){
                ticket.setPrice(600);
            } else if(ticket.getClassType() == ClassType.BUSINESS_CLASS){
                ticket.setPrice(500);
            } else if(ticket.getClassType() == ClassType.ECONOMY_CLASS){
                ticket.setPrice(400);
            }
        } else if(ticket.getTrain().getTrainType() == TrainType.STANDARD){
            if(ticket.getClassType() == ClassType.FIRST_CLASS){
                ticket.setPrice(350);
            } else if(ticket.getClassType() == ClassType.BUSINESS_CLASS){
                ticket.setPrice(250);
            } else if(ticket.getClassType() == ClassType.ECONOMY_CLASS){
                ticket.setPrice(175);
            }
        }        
        return ticket.getPrice();
    }    

    public OnlinePayment(String transactionID, String paymentGateway, Ticket ticket) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
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

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }             
}
