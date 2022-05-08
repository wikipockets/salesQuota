import java.util.*;

public class salesQuota {

       int sales, totalSales;
//       double goalPercent;
//       final double SALESGOAL = 20000;

   public static void main(String[] args){
      int sales,
      totalSales = 0;
      // this goes down in the other method :double goalPercent;
     
      
      //char - could be choice
      char addrecord;
      
      Scanner scan = new Scanner(System.in);
      
      
      
      do {
      
         System.out.print("Please enter the number of sales you made: ");
         sales =  scan.nextInt();
         
         //how to keep running total
         totalSales += sales;
         
         
         //
         //use "print" for same line
         
                   
        
         
         while (sales < 0) {
         System.out.print("Please enter a number above 0"); 
         sales = scan.nextInt();
         
         }
         //clear buffer in scanner
         scan.nextLine();
         
         System.out.print("Would you like to enter another record? (y/n): ");
         addrecord = scan.nextLine().toUpperCase().charAt(0);
      }
      
     
      // loop for asking to enter another record
      
      
      //should be do while
      

         
         
      
      while (addrecord == 'Y');
               
      displayPercent(totalSales);
      
      }
      
      public static void displayPercent(int totalSales){
         final int SALESGOAL = 20000;
         
         double goalPercent = ((double) totalSales / SALESGOAL) * 100;
         
         
         System.out.printf("You completed %.1f%% of your goal!", goalPercent);
         
         System.out.println("/nThank You, Goodbye!");

      }
      
   }
