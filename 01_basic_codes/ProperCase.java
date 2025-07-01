import java.util.Scanner;
public class ProperCase {
    public static String properCaseCon(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
            return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        System.out.println(properCaseCon(input).split(" ", 7));
        sc.close();;

    }
}
