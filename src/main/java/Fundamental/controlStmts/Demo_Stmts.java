package Fundamental.controlStmts;

import java.util.Scanner;

public class Demo_Stmts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the travels name");
        String travel_company=scan.next();
        if(travel_company.equalsIgnoreCase("SwamyAyyappa"))
        {
            System.out.println("This travel service provide all over tamilnadu and Andhra pradesh");
        }
        else if(travel_company.equalsIgnoreCase("Shyamoli"))
        {
            System.out.println("All over India service provided");
        }
        else if(travel_company.equalsIgnoreCase("MSS"))
        {
            System.out.println("This service provided tamilnadu,karnataka,andhra");
        }
        else {
            System.out.println("Not service provided");
        }


    }
}
