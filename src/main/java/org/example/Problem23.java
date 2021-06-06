/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.util.Scanner;

public class Problem23
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?(yes/no)");
        String ans = input.next().toUpperCase();

        if(ans.matches("YES"))
        {
            System.out.println("Are the battery terminals corroded?(yes/no)");
            ans = input.next().toUpperCase();

            if(ans.matches("YES"))
            {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?(yes/no)");
            ans = input.next().toUpperCase();

            if(ans.matches("YES"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.println("Does the car crank up and fail to start?(yes/no)");
                ans = input.next().toUpperCase();

                if(ans.matches("YES"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Does the engine start and then die?(yes/no)");
                    ans = input.next().toUpperCase();

                    if(ans.matches("YES"))
                    {
                        System.out.println("Does your car have fuel injection?(yes/no)");
                        ans = input.next().toUpperCase();

                        if(ans.matches("YES"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }

                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }

                }
            }
        }

    }
}
