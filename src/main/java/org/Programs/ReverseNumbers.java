package org.Programs;

import java.util.Scanner;

public class ReverseNumbers
{
    public static void main(String[] args)
    {
        int value,number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value");
        number=scanner.nextInt();//321
        while (number!=0)
        {
            value=number%10; //
            number=(number/10);
            System.out.print(value);
        }
    }
}
