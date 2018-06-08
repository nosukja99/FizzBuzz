package com.company;

public class Print {

    int max;

    public Print()
    {

    }
    public Print(int n)
    {
       max = n;
    }

    public String makePrint ()
    {
        String print = "";
        for (int i=1; i<=max; i++)
        {
            if (i%5==0&&i%3!=0)
            {
                print = print+"Buzz\n";
            }
            else if (i%3==0&&i%5!=0)
            {
                print = print+"Fizz\n";
            }
            else if (i%15==0)
            {
                print=print+"Fizz Buzz\n";
            }
            else
            {
                print=print+Integer.toString(i)+"\n";
            }
        }
        return print;
    }
}

