package decision_making.Patterns;

import java.util.Scanner;

public class PAT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int row=1;row<=range;row++){
            for(int col=1;col<=range;col++){
                if(row==1||row==range||col==1||col==range||row==col||col==range-row+1){
                System.out.print("*");//same line
                }else{
                    System.out.print(" ");
                }
            }
        
            System.out.println(" ");//new line
        
        }
        sc.close();
    }
}
