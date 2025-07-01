package decision_making.Patterns;

import java.util.Scanner;

public class PAT8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int row=1;row<=range;row++){
            for(int space=1;space<=range-row;space++){
                System.out.print(" ");//same line
            }
            for(int col=1; col<=row*2-1;col++ ){
               // if((row+col==range+1)||(col==range+row-1)){
                    System.out.print("*");
                //}else{
                  //  System.out.print(" ");
                //}
                
            }
            System.out.println(" ");//new line

        }
        for(int row = range-1; row>=1;row--){
            for(int space =1;space<= range -row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row*2-1; col++){
                //if((col==range-row+1)||(col-row==range-1)){
                    System.out.print("*");
                //}else{
                  //  System.out.print(" ");
                //5}
                
            }
            System.out.println();
        }
        sc.close();
    }
}
