package org.Programs;

import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        printPowerOfTheNumber(3,4,1);
    }
    public static int printPowerOfTheNumber(int number,int power,int result)
    {
        for (int i=0;i<power;i++)
        {
            result=result*number;
        }
        System.out.println(result);
        return result;
    }
}
