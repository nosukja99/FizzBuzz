package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String arg[])
    {
        //int x=100;
        System.out.println("This Fizz-Buzz program will display numbers. \n " +
                "For multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.\n " +
                "For numbers which are multiples of both three and five print “FizzBuzz”.");
        //System.out.println("To which number do you want to display?: ");
        //Scanner scanner = new Scanner(System.in);
        //x = scanner.nextInt();
        Print print = new Print();
        System.out.println(print.makePrint());

    }
}
