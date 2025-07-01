package decision_making.Patterns;
import java.util.Scanner;
public class APAT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        char character = 'A';
        for(int row=0; row<range; row++){
            for(int col=0; col<=row; col++){
                System.out.print(character + "");
                character++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
