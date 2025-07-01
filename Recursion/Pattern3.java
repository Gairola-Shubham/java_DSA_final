package Recursion;

public class Pattern3 {

    static void printPattern(int currentRow, int row){
        if(currentRow<0){
            return;
        }
        if(currentRow==1 || row==currentRow){
            printSolidLine(currentRow);
        }
        else{
            printHollowLine(1,currentRow);
        }
        System.out.println();
        printPattern(currentRow-1, row);
    }

    static void printSolidLine(int star){
        if(star==0){
            return;
        }
            System.out.print("*");
            printSolidLine(star-1);
    }

    static void printHollowLine(int col,int currentRow){
        if(col>currentRow){
            return;
        }

        if(col ==1 || col==currentRow){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        printHollowLine(col+1, currentRow);
    }
    public static void main(String[] args) {
        printPattern(5,5);
    }
}
