package Examples;

import java.util.Scanner;

public class AgeInsultGenerator {

    public static void main(String[] args){

        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age >>> ");
        age = input.nextInt();

        if (age < 12){
            System.out.println("You are just a kid go away");
        }

        else if (age >= 12 || age <= 19){
            System.out.println("You are old enough to know better, hopefully");
        }
        else if (age >= 20 || age < 25){
            System.out.println("Get a job you bum");
        }
        else if (age >= 25 || age < 35){
            System.out.println("You better have a job now");
        }
        else if (age >= 35 || age < 45){
            System.out.println("You should have a good job at this time in life");
        }
        else if (age >= 45 || age < 55){
            System.out.println("You better be saving up for retirement");
        }
        else if (age >= 55){
            System.out.println("You look like you're about to fossilize");
        }
    }

}
