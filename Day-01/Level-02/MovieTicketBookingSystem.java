import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;


    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket() {
        if (isBooked) {
            System.out.println("Seat " + seatNumber + " is already booked.");
        } else {
            isBooked = true;
            System.out.println("Ticket successfully booked for seat " + seatNumber + "!");
        }
    }

    
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket Booking System!");

     
        System.out.print("Enter the movie name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter the seat number: ");
        int seatNumber = sc.nextInt();
        System.out.print("Enter the ticket price: ");
        double price = sc.nextDouble();

        
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);


        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ticket.bookTicket();
                    break;
                case 2:
                    ticket.displayDetails();
                    break;
                case 3:
                    System.out.println("Thank you for using the Movie Ticket Booking System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}