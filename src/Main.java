import java.util.Scanner;

public class Main {

    // Conversion Class initialized
    public class Conversion{

        // toBinary() method calculates the integer given and returns it as a string
        static String toBinary(int num){
            String binary = "";
            while(num > 0) {
                binary = (num % 2) + binary;
                num /= 2;
            }
            return binary;
        }
    }

    public static void main(String[] args) {

        boolean loopKey = true;     // Used to loop the prompting of input until user quits the loop
        String exitChoice = "";     // This will store the user's input when prompted on whether they want to continue the loop

        // Welcome Message
        System.out.println("\n\tWelcome to my Binary Conversion program\n");

        // While loop repeats until loopKey is false
        while(loopKey) {

            // Resets the exitChoice input for the new instance of the loop
            exitChoice = "";

            // Prompts the user for an integer
            System.out.println("\nPlease enter an integer: ");
            // Scanner object is created to help store input
            Scanner sc = new Scanner(System.in);
            // Input is stored using the scanner object
            int x = sc.nextInt();

            // Binary Conversion is now displayed
            System.out.println("Your integer converted to binary: ");
            // Conversion class is used to retrieve the toBinary() method
            System.out.print(Conversion.toBinary(x) + "\n");

            // Case Sensitive validation loop. The loop initiates whenever the exitChoice variable
            // does not equal "y", "Y", "n", or "N".The loop will initiate indefinitely because
            // exitChoice is reset at the beginning of each instance of the loop.
            while(!exitChoice.toLowerCase().equals("n") && !exitChoice.toLowerCase().equals("y")) {

                // Prompts the user on whether they would like to try the conversion on another integer.
                System.out.println("Would you like to try another integer? (y/n)");
                exitChoice = sc.next();

                // If exitChoice equals "n" or "N"
                if (exitChoice.toLowerCase().equals("n")) {
                    loopKey = false;
                    // The loopKey is set to false and the primary while loop will now end.
                } else if (exitChoice.toLowerCase().equals("y")) {
                    // Repeats the primary while loop
                } else {
                    System.out.println("Error - Please enter only (y/n)\n");
                    // Repeats the validation while loop and provides and error message
                }
            }
        }
        // Goodbye Message
        System.out.println("\n\nThank you for using my Program!");

    }
}
