package Assignments;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        System.out.println("Please emter any number >>>");
        int numEntered = 25;
        String result;
        Scanner input = new Scanner(System.in);
        numEntered = input.nextInt();

        if (numEntered % 2 == 0)
            result = "This number is even";
        else
            result = "This number is odd";

        System.out.println(result);
    }
}
