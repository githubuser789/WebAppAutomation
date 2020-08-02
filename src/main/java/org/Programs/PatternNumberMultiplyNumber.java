package org.Programs;

public class PatternNumberMultiplyNumber
{
    public static void main(String[] args)
    {
        returnMultiplyPattern();
    }
    public static int returnMultiplyPattern()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        return 1;
    }
}
