package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * 
 * @author Kostika Nini Jan 25, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random r1 = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here) 
            card.setValue(r1.nextInt(13)+1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(int)(r1.nextInt(3))]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i]=card;
            
           
        }
        
           

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
         System.out.print("Enter the number of your card: ");
            int value = input.nextInt();
            System.out.print("Enter the suit: ");
            String suit = input.next();
        
          for (int i =0;i<hand.length;i++){
           if(hand[i].getValue() == value & hand[i].getSuit().equalsIgnoreCase(suit)){
                printInfo();
                break;
            } 
        
        }
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Kostika Nini Jan 2023
     */
    private static void printInfo() {
    //I am done
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Kostika, but you can call me Kosta");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a good programmer and web developer!");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Soccer");
        System.out.println("-- Chess");
        System.out.println("-- Gym");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
