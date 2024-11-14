package view;

import java.util.Scanner;
import model.*;
import controller.MenuController;

public class MenuView {
    Scanner scan = new Scanner(System.in);
    Ticket ticket = new Ticket("A1", "A1", ClassType.FIRST_CLASS, TicketStatus.PAID, 0, null, null, null, null);
    Passenger passenger = new Passenger("P1", "Greg", 1, 20);
    Train train = new Train(1, "Kereta Jaya", TrainType.STANDARD);
    Reservation reservation = new Reservation("R1", "14 Desember 2024");
    OnlinePayment onlinePayment = new OnlinePayment("OP1", "Paypal", ticket);    
    MenuController controller = new MenuController();

    public void menuUtama() {
        int pilih = 0;
        System.out.println("Pilih Menu");
        System.out.println("1. Get Info \n" +
                "2. Get Train Details\n" +
                "3. Print Ticket\n" +
                "4. Get Ticket Status\n" +
                "5. Reserve Seat\n" + 
                "6. Cancel Reservation\n"  +
                "7. Make Payment\n" 
                );
        System.out.print("Pilih : ");
        pilih = scan.nextInt();

        switch (pilih) {
            case 1:
                passenger.getPassengerInfo(passenger);
                break;
            case 2:
                train.getTrainDetails(train);
                break;
            case 3:
                ticket.printTicket(ticket);
                break;
            case 4: 
                ticket.getTicketStatus(ticket);
                break;
            case 5:                                                                         
                System.out.println("Tanggal berapa (String) ?");
                scan.nextLine();
                String tanggal = scan.nextLine();
                reservation.reserveSeat(tanggal);                
                System.out.println("Output : ");
                reservation.getReserveSeat(reservation);
            case 6:                 
                break;
            case 7:            
                onlinePayment.makePayment(ticket, onlinePayment);
            case 0:
                System.exit(0);
            default:
                break;
        }

    }
}
