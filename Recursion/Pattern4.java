package Recursion;

public class Pattern4 {


    static void printSpace(int spaceCount){
        if(spaceCount==0){
            return;
        }
        System.out.print(" ");
        printSpace(spaceCount-1);
    }

    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }

    static void printPattern(int cr, int size){
        if(cr==size){
            return;
        }
        printSpace(size-cr);
        printStar(size);
        System.out.println();
        printPattern(cr+1, size);
    }

    public static void main(String[] args) {
        printPattern(0, 5);
    }
}
