package Recursion;

public class Pattern1 {

    static void printStar(int currentRow ){
        if(currentRow == 0){
            return;
        }
        System.out.print("*");
        printStar(currentRow-1);
    }

    static void printPattern(int currentRow,int row){
        if(currentRow>row){
            return;
        }
        printStar(currentRow);
        System.out.println();
        printPattern(currentRow +1,row);
    }
    public static void main(String[] args) {
        printPattern(1, 5);
        
    }
}
