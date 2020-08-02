package org.Programs;

public class Pattern54321
{
    public static void main(String[] args)
    {
        returnPattern(1,10);
    }

    public static int returnPattern(int initial, int maxNumber)
    {
       // int i=0,j=0;
        for(int i=initial;i<=maxNumber;i++)
        {
            for (int j=maxNumber;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        return 1;
    }
}
