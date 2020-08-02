package org.Programs;

import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        reverseAnArray(3);
    }
    public static int reverseAnArray(int arraySize)
    {
        int   arrayValues;
       Scanner scanner=new Scanner(System.in);

        int i,j;
        int[] reverse=new int[arraySize];
        for ( i=0;i<arraySize;i++)
        {
            arrayValues=scanner.nextInt();
            reverse[i]=arrayValues;
        }
        for ( j=reverse.length-1;j>=0;j--)
        {
            System.out.print(reverse[j]+" ");
        }
        return arraySize;
    }
}
