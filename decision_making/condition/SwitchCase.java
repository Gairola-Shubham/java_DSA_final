package decision_making.condition;

public class SwitchCase {

    static int getPrice(){
        String item = "Burger";
        int result = switch(item){
                case "Burger","pasta"->{
                System.out.println("Price is Rs 100");
                System.out.println("veg burger/ pasta");
                System.out.println("non-veg burger/ pasta");
                yield 100;
            
            }
                case "Pizza"->{
                System.out.println("price is Rs 200");
                yield 200;
               
            }
                case "dessert"->{
                System.out.println("Price is Rs 300");
                yield 300;
            }
                case "drinks"->{
                System.out.println("Price is Rs 400");
                yield 400;
            } 
                default->{
                System.out.println("50% off on items");
                yield 0;
            }    
        };
            return result;

    }
    public static void main(String[] args) {
        int e = getPrice();
        System.out.println("price: " + e);


        // String item = "pizza";
        // int result = switch (item) {
        //     case "pasta"->100;
        //     case "pizza"-> 200;
        //     case "drink"->50;
        //     default->0;
        // };
        // System.out.println(result);

        // java 14 Arrow (does not have fall facility( that's why no fall facility))
        // String item = "Burger";
        // switch(item){
        //         case "Burger","pasta"->{
        //         System.out.println("Price is Rs 100");
        //         System.out.println("veg burger/ pasta");
        //         System.out.println("non-veg burger/ pasta");
        //         }
        //         case "Pizza"->
        //         System.out.println("price is Rs 200");
               
        //         case "dessert"->
        //         System.out.println("Price is Rs 300");
                
        //         case "drinks"->
        //         System.out.println("Price is Rs 400");
             
        //         default->
        //         System.out.println("50% off on items");
        //     }




        // Switch Case with String (JAVA 7)
        // String item = "Burger";
        // switch(item){
        //         case "Burger":
        //         System.out.println("Price is Rs 100");
        //         break; // EXIT FROM THE BLOCK(SWITCH BLOCK)
        //         case "Pizza":
        //         System.out.println("price is Rs 200");
        //         break;
        //         case "dessert":
        //         System.out.println("Price is Rs 300");
        //         break;
        //         case "drinks":
        //         System.out.println("Price is Rs 400");
        //         break;
        //         default:
        //         System.out.println("50% off on items");
        //     }







        // int item = 3;
        // final int BURGER = 1;
        // final int PIZZA = 2;
        // final int DESSERT = 3;
        // final int DRINKS = 4;
        // // Switch case int, short, byte, long, char, Enum
        // switch(item){
        //     case BURGER:
        //     System.out.println("Price is Rs 100");
        //     break; // EXIT FROM THE BLOCK(SWITCH BLOCK)
        //     case PIZZA:
        //     System.out.println("price is Rs 200");
        //     break;
        //     case DESSERT:
        //     System.out.println("Price is Rs 300");
        //     break;
        //     case DRINKS:
        //     System.out.println("Price is Rs 400");
        //     break;
        //     default:
        //     System.out.println("50% off on items");
        // }
    }
}
