package decision_making.loops;

public class loops1 {
    public static void main(String[] args) {
        // // while loop
        // int i = 1; //start
        // while(i<=10){ //condition
        // System.out.println("shubh");
        // //i = i+1;
        // i++; // increment
        // }

        // // for loop
        // for(int i = 1; i<=10; i++){
        //     System.out.println("shubh");
        // }

        
        // // do while loop
        // int i = 20;
        // do{
        //     System.out.println("shubh");
        //     i++;
        // }while(i<=10);


        // java 5 onwards
        //Enhance for loop
        int arr[]= {10, 20, 30, 40, 50};
        // traditional way 
        // for (int i =  0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // modern way
        for(int e:arr){
            System.out.println(e);
        }

    }
}