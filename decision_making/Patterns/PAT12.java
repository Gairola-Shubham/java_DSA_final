package decision_making.Patterns;

public class PAT12 {
    public static void main(String[] args) {
        int range = 5;
        for(int row=0; row<range; row++){
            for(int space=0; space<row; space++){
                System.out.print(" ");
            }
            for(int col=0; col<2*range-2*row-1; col++){
                if(row==0||col==0||col == 2*range-2*row-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
