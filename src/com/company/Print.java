package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Print {

    int start=1;
    int end=0;
    int count=0;
    ArrayList<String> wordList = new ArrayList<>();

    public Print()
    {
        wordList.add("Rock");
        wordList.add("Paper");
        wordList.add("Scissors");
        wordList.add("Lizard");
        wordList.add("Spock");
    }

    public String getWordFromList(int count)
    {
        int  index;
        String word="";
        if (count % 5 == 0) {
            index = 0;
            word=wordList.get(index);
        }
        else if (count % 5 == 1) {
            index = 1;
            word = wordList.get(index);
        }
        else if (count % 5 == 2) {
            index = 2;
            word = wordList.get(index);
        }
        else if (count % 5 == 3) {
            index = 3;
            word = wordList.get(index);
        }
        else
        {
            index = 4;
            word = wordList.get(index);
        }
        return word;
    }

    public String makePrint ()
    {

            while(start>end) {
                Random rand = new Random();
                start = 1 + rand.nextInt(100);
                //System.out.println("starting number: " + start);

                Random rand1 = new Random();
                end = 1 + rand1.nextInt(100);
                //System.out.println("ending number: " + end);
            }

            String print = "";

            if (end-start<10)
            {
                print = "This won't take long.\n\n";
            }

            for (int i = start; i <= end; i++)
            {
                if(i>10 && i%2==0)
                {
                    if (start == end)
                        print = "Shazam!!";
                    else if (i % 5 == 0 && i % 3 != 0) {
                        if (i % 7 != 0) {
                            print = print + "Buzz - " + getWordFromList(count)+"\n";
                            count++;
                        }
                        else {
                            print = print + "Buzz - this number is a multiple of seven - " + getWordFromList(count) + "\n";
                            count++;
                        }
                    } else if (i % 3 == 0 && i % 5 != 0) {
                        if (i % 7 != 0) {
                            print = print + "Fizz - " + getWordFromList(count) + "\n";
                            count++;
                        }
                        else {
                            print = print + "Fizz - this number is a multiple of seven - " + getWordFromList(count) + "\n";
                            count++;
                        }
                    } else if (i % 15 == 0) {
                        if (i % 7 != 0) {
                            print = print + "Fizz Buzz - " + getWordFromList(count) + "\n";
                            count++;
                        }
                        else {
                            print = print + "Fizz Buzz - this number is a multiple of seven - " + getWordFromList(count) + "\n";
                            count++;
                        }
                    } else if (i % 7 == 0) {
                        print = print + Integer.toString(i) + " - this number is a multiple of seven - "+ getWordFromList(count)+"\n";
                        count++;
                    } else {
                        print = print + Integer.toString(i) +" - "+ getWordFromList(count)+"\n";
                        count++;
                    }
                }
                else
                {
                    if (start == end)
                        print = "Shazam!!";
                    else if (i % 5 == 0 && i % 3 != 0) {
                        if (i % 7 != 0)
                            print = print + "Buzz\n";
                        else
                            print = print + "Buzz - this number is a multiple of seven\n";
                    } else if (i % 3 == 0 && i % 5 != 0) {
                        if (i % 7 != 0)
                            print = print + "Fizz\n";
                        else
                            print = print + "Fizz - this number is a multiple of seven\n";
                    } else if (i % 15 == 0) {
                        if (i % 7 != 0)
                            print = print + "Fizz Buzz\n";
                        else
                            print = print + "Fizz Buzz - this number is a multiple of seven\n";
                    } else if (i % 7 == 0) {
                        print = print + Integer.toString(i) + " - this number is a multiple of seven\n";
                    } else {
                        print = print + Integer.toString(i) + "\n";
                    }
                }
            }

        return print;
    }
}

