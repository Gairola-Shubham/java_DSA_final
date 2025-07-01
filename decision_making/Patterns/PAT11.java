package decision_making.Patterns;

public class PAT11 {
    public static void main(String[] args) {
        int range = 5;
        for(int row=0; row<range; row++){
            for(int col=0; col<=row; col++){
                if(col==0||row==range-1||row==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
