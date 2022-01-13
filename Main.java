import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you.\nThe other dragon is greedy and hungry and will eat you on sight. Which cave will you go into; cave1 or cave2?");

        var input = myObj.next();


        if ( input.equals ("cave1")) {
            System.out.println("You approach the cave...It is dark and spooky...A large dragon jumps out in front of you! He opens his jaw and gobbles you in one bite!");

        }
        //}else if (str == "cave2")
           // return "You've met the friendly dragon!" ;

   // else return null;







    }


}





