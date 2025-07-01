package decision_making.Patterns;

import java.util.Scanner;

public class PAT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i =1; i<=size; i++){
            for(int j = i;j<=size; j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            for(int j = i;j<=size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1; i<=size; i++){
            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            for(int j=2*i-2;j<2*size-2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
