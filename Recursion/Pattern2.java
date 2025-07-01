package Recursion;

public class Pattern2 {

    static void printRow(int row){
        if(row==0){
            return;
        }
        printStar(row);
        System.out.println();
        printRow(row-1);
    }


    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    public static void main(String[] args) {
        printRow(4);
    }
    
}
