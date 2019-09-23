package Examples;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {

        int choice;
        String choiceString = null;
        Scanner input = new Scanner(System.in);
        System.out.println("What are you solving for? \n 1- for right triangle \n" +
                " 2- for Isosceles \n 3- for Equilateral \nChoice >>>>>");
        choice = input.nextInt();

        if (choice == 1) {
            rightTriangle();
        }
        else if (choice == 2) {
            //does the user have all three side?
            solvePerimeter();
            if(choiceString.equalsIgnoreCase("Yes")){

            }
            else{

            }
        }
        else if (choice == 3) {

        }
    }

    public static void rightTriangle() {
        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;
        System.out.println("Which side do you want to solve for? \n" +
                "A- side\nB- side\nC- Side");
        choice = input.next();
        if (choice.equalsIgnoreCase("A")) {
            System.out.println("Please enter for side B");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("Please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C >>> ");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else {
            System.out.println("Please enter for side A");
            side1 = input.nextDouble();
            System.out.println("Please enter for side B");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
        }
    }

    public static void rightTriangleMathAB(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("The side " + choice + " is " + notC);

    }

    public static void rightTriangleMathC(double side1, double side2, String choice) {
        double C;
        C = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("The side " + choice + " is " + C);
    }
    public static void solvePerimeter(){
        Scanner input = new Scanner(System.in);
        int sideA;
        int sideB;
        int sideC;
        int perimeter;
        System.out.println("Please enter side A >>>");
        sideA = input.nextInt();
        System.out.println("Please enter side B >>>");
        sideB = input.nextInt();
        System.out.println("Please enter side C >>>");
        sideC = input.nextInt();
        perimeter = (sideA) + (sideB) + (sideC);


    }

    public static void solveArea(){


    }
}

