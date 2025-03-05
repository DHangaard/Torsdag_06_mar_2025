import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    // added counter to count amount of tries
    private static int counter = 1;

    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        int guess;
        
            // use hasNextDouble to check if input is numeric, 
            // changed to hasNextInt for easier comparison
            while (scanner.hasNext()){
                
                // if so...
                if (scanner.hasNextInt()){
                    
                    // Read user input
                    guess = scanner.nextInt();

                    // Print special message if guessed in first try
                    if (guess == rnd_number && counter == 1){
                        System.out.println("That was amazing!\nYou guessed the random number in first try!\nThe number was: " + rnd_number);

                    // Compare it with the random number
                    } else if (guess == rnd_number){

                        // Let the user know the result of the comparison
                        System.out.println("Congratulations!\nYou guessed the random number in " + counter + " tries\nThe number was: " + rnd_number);

                    } else {

                        // Help the user by revealing wether the guess was lower or higher than the target number
                        if (guess < rnd_number){
                            System.out.println("Wrong guess...\nThe number " + guess + " is to low...\nTry again!\n");
                        
                        } else if (guess > rnd_number){
                            System.out.println("Wrong guess...\nThe number " + guess + " is to high...\nTry again!\n");
                        }

                        // Let the user try again by calling this method recursively
                        counter++;
                        makeAGuess();

                    }

                    // End loop if number is guessed
                    break;

                } else {

                    // if input was not numeric show an error message and call this method recursively
                    // no need to use recursion while still inside while loop
                    System.out.println("Your guess must be an integer...\nTry again!\n");
                    scanner.next();
                }
            }
            
       
    }
}