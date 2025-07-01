package decision_making.Patterns;
import java.util.Scanner;
public class PAT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int row=1;row<=range*2-1;row++){
            for(int col=1; col<=range;col++){
                if((row==1||row==range||row==(range*2-1)) && (col==1||col==range)){
                    System.out.print(" ");
                }else if(row==1||row==range||row==(range*2-1)||col==1||col==range){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
