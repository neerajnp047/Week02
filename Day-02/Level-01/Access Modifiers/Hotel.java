import java.util.Scanner;

class HotelBooking{
    String guestName;
    String roomType;
    int night;
// Default Constructor
    public HotelBooking(){
        this.guestName = "Unknown";
        this.roomType = "Unknown";
        this.night = 0;
    }
// Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int night){
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    }
// Copy Constructor
    public HotelBooking(HotelBooking HotelBook){
        this.guestName = HotelBook.guestName;
        this.roomType = HotelBook.roomType;
        this.night = HotelBook.night;
    }
    public void displayDetails(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Night: " + night);
    }
}

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a guest name: ");
        String name = sc.nextLine();
        System.out.println("Enter a room type: ");
        String roomType = sc.nextLine();
        System.out.println("Enter night to be spent: ");
        int night = sc.nextInt();
        HotelBooking hotelBooking1 = new HotelBooking();
        hotelBooking1.displayDetails();
        HotelBooking hotelBooking2 = new HotelBooking(name, roomType, night);
        hotelBooking2.displayDetails();
        HotelBooking hotelBooking3 = new HotelBooking(hotelBooking2);
        hotelBooking3.displayDetails();
        
    }
}
