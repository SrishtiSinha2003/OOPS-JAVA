import java.util.Scanner;

public class ArrayRoom {
    public static void main(String[] args) {
        String[][] bookings = new String[5][4]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter booking details: ");
        System.out.print("Date: ");
        String date = sc.next();
        System.out.print("Start Time: ");
        String startTime = sc.next();
        System.out.print("End Time: ");
        String endTime = sc.next();
        System.out.print("Name: ");
        String name = sc.next();
        
        boolean available = true;
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i][0] != null && bookings[i][0].equals(date) && bookings[i][1].equals(startTime)) {
                available = false;
                break;
            }
        }
        
        if (available) {
            for (int i = 0; i < bookings.length; i++) {
                if (bookings[i][0] == null) {
                    bookings[i][0] = date;
                    bookings[i][1] = startTime;
                    bookings[i][2] = endTime;
                    bookings[i][3] = name;
                    System.out.println("Booking successful!");
                    break;
                }
            }
        } else {
            System.out.println("Room is not available at the requested time.");
        }
        sc.close();
    }
}
