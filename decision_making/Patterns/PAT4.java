package decision_making.Patterns;

import java.util.Scanner;

public class PAT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int row=1;row<=range;row++){
            for(int space=1;space<=range-row;space++){
                System.out.print(" ");//same line
            }
            for(int col=1; col<=row*2-1;col++ ){
                if(col ==1||row==range||col==row*2-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");//new line
        
        }
        sc.close();
    }
}
