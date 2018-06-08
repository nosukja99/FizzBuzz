package com.company;

import java.util.Random;

public class Print {

    int start=2;
    int end=1;

    public Print()
    {

    }

    public String makePrint ()
    {

        while(start>end) {
            Random rand = new Random();
            start = 1 + rand.nextInt(100);
            //System.out.println("starting number: " + start);

            Random rand1 = new Random();
            end = 1 + rand1.nextInt(100);
            // System.out.println("ending number: " + end);
        }

        String print = "";

            for (int i = start; i <= end; i++) {

                if (start == end) {
                    print = "Shazam!!";
                }
                else if (i % 5 == 0 && i % 3 != 0) {
                    print = print + "Buzz\n";
                } else if (i % 3 == 0 && i % 5 != 0) {
                    print = print + "Fizz\n";
                } else if (i % 15 == 0) {
                    print = print + "Fizz Buzz\n";
                } else {
                    print = print + Integer.toString(i) + "\n";
                }
            }

        return print;
    }
}

