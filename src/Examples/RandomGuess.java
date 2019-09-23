package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice;
        int rand_pick = rand.nextInt(100) + 1;

        System.out.println("Please guess a number between 1 - 100");
        choice = input.nextInt();

        if (choice == rand_pick){
            System.out.println("Congrats, You're a good guesser");
        }
        else{
            System.out.println("Nope it was " + rand_pick);
        }
    }

}
