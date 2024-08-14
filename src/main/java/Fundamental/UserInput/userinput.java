package Fundamental.UserInput;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the value");
//        int a=scan.nextInt();
//        System.out.println("enter the value");
//        int b=scan.nextInt();
//        int res=a+b;
//        System.out.println("Result"+res);
        System.out.println("______BIO______");
        System.out.println("Enter your Name");
        String Name=scan.next();
        System.out.println("My name is:"+Name);
        System.out.println("ENter the native place");
        String Native=scan.next();
        System.out.println("Native place :"+Native);
        System.out.println("Enter age");
        int age =scan.nextInt();
        System.out.println("Age "+age);
        System.out.println("Enter your phn number");
        long phn=scan.nextLong();
        System.out.println("PHN :"+phn);


    }

}
