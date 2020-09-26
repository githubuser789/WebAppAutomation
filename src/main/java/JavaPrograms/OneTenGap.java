package JavaPrograms;

public class OneTenGap
{
    public static void main(String[] args)
    {
        for (int i=0;i<=10;i++)
        {
            for (int j=0;j<=10;j++)
            {
                if(i==0||i==10||j==0||j==10)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
