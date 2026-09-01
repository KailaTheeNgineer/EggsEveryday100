import java.util.*;

public class EggsEveryday100 { public static void main(String[] args) {

    // Creating object for user input
    Scanner userInput = new Scanner(System.in);
    // Assignment details
    System.out.println("\n\nDeveloper: Kaila McAlpine | Class: COP-2800/Java Programming | Date: 09/06/2026\n");
     // Welcome Message
    System.out.println("----------------------------------------------------");
    System.out.println("|        Welcome to Eggs Everyday 100!             |");
    System.out.println("----------------------------------------------------");
    // Collecting input for chickens as an int
    System.out.print("How many total chickens are on the farm? ");
        int chickens = userInput.nextInt();
    // Collecting input for roosters as an int
    System.out.print("How many of the chickens are roosters? ");
        int roosters = userInput.nextInt();
    // Collecting input for percent chance chickens lay eggs
    System.out.print("What percent chance do chickens have to lay eggs in one day? (%)");
        // Converting the user input into a float value
        float eggChance = userInput.nextFloat() / 100;
    // Collecting input for amount of days
    System.out.print("How many days has it been? ");
        int days = userInput.nextInt();

    // Calculating values and storing it as an int.
    int eggs = (int) ((chickens - roosters) * eggChance * days);

    // Printing data with formatting
   System.out.printf("""
        ===============================
        ||         CHICKEN COOP      ||
                                      
             Estimated Eggs: %-10d   
        ||                           ||
        ================================
        """, eggs);


}
}