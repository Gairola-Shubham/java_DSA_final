package inputs;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // eat the \n
        System.out.println("enter the name");
        String name = scanner.nextLine();
        //System.out.println("Enter the id: ");
        //int id = scanner.nextInt();
        System.out.println("enter the city");
        String city = scanner.next();
        System.out.println("Id: " + id);
        System.out.println("name: "  + name);
        System.out.println("City: " + city);
        //scanner.close(); // also close system.in
        scanner = new Scanner(System.in);
        System.out.println("enter the phone ");
        String phone = scanner.nextLine();
        System.out.println("Phone: " + phone);
        scanner.close(); // if this is closed before it will give an error
    }
}
