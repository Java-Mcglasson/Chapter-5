package Assignments;

import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args){

        int minUsed;
        int txtUsed;
        int gbUsed;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are you going to send? >>>");
        minUsed = input.nextInt();

        System.out.println("How many text messages are you going to send? >>>");
        txtUsed = input.nextInt();

        System.out.println("How many Gigabytes are you going to use? >>>");
        gbUsed = input.nextInt();


        if (minUsed < 500 && txtUsed == 0 && gbUsed == 0){
            result = "Plan A";
        }
        else if (minUsed < 500 && txtUsed >= 1 && txtUsed <= 99 && gbUsed == 0){
            result = "Plan B";
        }
        else if (minUsed > 500 && txtUsed >= 100 && gbUsed == 0){
            result = "Plan C";
        }
        else if (minUsed > 500 && txtUsed > 100 && gbUsed < 2 && gbUsed == 0){
            result = "Plan D";
        }
        else if (minUsed < 500 && txtUsed > 100 && gbUsed >= 1){
            if(gbUsed < 2){
                result = "Plan E";
            }
            else if(gbUsed > 2){
                result = "Plan E";
            }
        }


        System.out.println("The plan you need is " + result );
    }

}
