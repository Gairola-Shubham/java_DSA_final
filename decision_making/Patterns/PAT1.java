package decision_making.Patterns;
import java.util.Scanner;

public class PAT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int row=1;row<=range;row++){
            for(int col=1;col<=range;col++){
                System.out.print("*");//same line
            }
            System.out.println(" ");//new line
        
        }
        sc.close();
    }
}
