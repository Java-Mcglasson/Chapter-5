package Assignments;

import java.util.Scanner;

public class CondoSales
{
    public static final double PARKVIEW_PRICE = 150000.00;
    public static final double GOLFVIEW_PRICE = 170000.00;
    public static final double LAKEVIEW_PRICE = 210000.00;
    public static final String P = "You selected the Park View Condo with a sales price of ";
    public static final String G = "You selected the Golf View Condo with a sales price of ";
    public static final String L = "You selected the Lake View Condo with a sales price of ";
    public static final String I = "You selected an INVALID response, sales price is set to ";
    static int condoSelection;
    static double salesPrice;
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter your condominium selection:\n1 - Park View\n2 - Golf " +
                "Course View\n3 - Lake View");
        condoSelection = enter.nextInt();
        boolean invalidResponse = (condoSelection > 3 || condoSelection < 0);
        if (condoSelection == 1)
        {
            salesPrice = PARKVIEW_PRICE;
            System.out.println(P + salesPrice);
        }
        else if (condoSelection == 2)
        {
            salesPrice = GOLFVIEW_PRICE;
            System.out.println(G + salesPrice);
        }
        else if (condoSelection == 3)
        {
            salesPrice = LAKEVIEW_PRICE;
            System.out.println(L + salesPrice);
        }
        else if (invalidResponse)
        {
            salesPrice = 0;
            System.out.println(I + salesPrice);
        }
    }
}
