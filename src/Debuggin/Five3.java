package Debuggin;

import java.util.Scanner;

public class FixDebugFive3
{
    public static void main (String args[])
    {
        int item = 0;
        String output = null;
        final int LOW = 111;
        final int HIGH = 9;
        final int CUT_OFF = 500;
        calculateOutPut(item, output, LOW, HIGH,CUT_OFF);
    }
    public static void calculateOutPut(int item, String output, int LOW, int HIGH, int CUT_OFF)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter item number");
        item = input.nextInt();
        if(item < LOW) output = "Item number too low";
        else
        if(item > HIGH)
            output = "Item number too high";
        else
        if(item > CUT_OFF)
            output = "Valid - in Automotive Department";
        else
            output = "Valid - Item in Housewares Department";
        System.out.println(output);
        }
    }

