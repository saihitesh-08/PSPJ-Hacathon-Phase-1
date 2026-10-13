import java.util.*;

class MovieTicket {

    String M_Name;
    double T_Price;
    int number_tickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.M_Name = movieName;
        this.T_Price = ticketPrice;
        this.number_tickets = numberOfTickets;
    }

    double calculateTotal() {
        return T_Price * number_tickets;
    }

    double calculateDiscount() {
        if (number_tickets >= 5) {
            return calculateTotal() * 0.10;
        } else {
            return 0;
        }
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\n----- Cinema Ticket Booking Bill -----");
        System.out.println("Movie Name       : " + M_Name);
        System.out.println("Ticket Price     : " + T_Price);
        System.out.println("Number of Tickets: " + number_tickets);
        System.out.println("Total Amount     : " + calculateTotal());
        System.out.println("Discount         : " + calculateDiscount());
        System.out.println("Final Amount     : " + calculateFinalAmount());
        System.out.println("--------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String M_Name = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double T_Price = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int number_ticket = sc.nextInt();

        MovieTicket obj = new MovieTicket(M_Name, T_Price, number_ticket);
        obj.displayBill();
    }
}