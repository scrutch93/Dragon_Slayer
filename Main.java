import java.util.Scanner;

 class Main {
     public static void main(String[] args) {

         //Scanner myObj = new Scanner(System.in);  // Create a Scanner object


         try {
             Scanner myObj = new Scanner (System.in);
             System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you.\nThe other dragon is greedy and hungry and will eat you on sight. Which cave will you go into; cave1 or cave2?");
             var input = myObj.next();
             if (input.equals("cave1")) {
                 System.out.println("You approach the cave...It is dark and spooky...A large dragon jumps out in front of you! He opens his jaw and gobbles you in one bite!");
                 //return "Loser";
             } else if (input.equals("cave2")) {
                 System.out.println("You've met the friendly dragon! Party time!!!");
                 //return "Winner";
             }
             //I want this to catch an error when the user inputs a value other than cave1 or cave2.
         }catch (Exception e) {
             System.out.printf("Please input exactly cave1 or cave2; any other input will not be accepted (input is case sensitive).");
             //return "Please input exactly cave1 or cave2; any other input will not be accepted (input is case sensitive).";

         }
        // return null;
         }}
         // Below printing out a string to tell the user what to do
        /* System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you.\nThe other dragon is greedy and hungry and will eat you on sight. Which cave will you go into; cave1 or cave2?");

         //variable for user input
         var input = myObj.next();

         //setting first conditional for cave1
         if (input.equals("cave1")) {
             System.out.println("You approach the cave...It is dark and spooky...A large dragon jumps out in front of you! He opens his jaw and gobbles you in one bite!");

         } else if (input.equals("cave2")) {
             System.out.println("You've met the friendly dragon! Party time!!!");




         }

         try{
             return (input = "cave1" || "cave2");

         }catch (Exception e){

             return "Caught Exception: User input must be String of cave1 or cave2";

         }


     }
 }





*/
