package inputs;
import java.util.Scanner;

public class scan2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the first number ");
        int firstnumber = sc.nextInt();
        System.out.println("enter the second number ");
        int secondnumber = sc.nextInt();
        System.out.println(firstnumber + secondnumber);
        sc.close();
    }
}
