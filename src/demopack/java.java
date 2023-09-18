package demopack;

public class java {

     public static void main(String[] args) {
         int weather =3; // Assuming different codes for various weather conditions.
         
         switch (weather) {
             case 1:
                 System.out.println("The weather is sunny.");
                 break;
             case 2:
                 System.out.println("The weather is cloudy.");
                 break;
             case 3:
                 System.out.println("The weather is rainy.");
                 break;
             case 4:
                 System.out.println("The weather is windy.");
                 break;
             default:
                 System.out.println("Unknown weather condition.");
                 break;
         }
     }

}
