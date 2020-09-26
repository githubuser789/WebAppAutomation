package JavaPrograms;

public class AlphaPattern
{
    public static void main(String[] args)
    {
        for (char c='A';c<='Z';c++)
        {
            for (char s=c;s<=c;s++)
            {
                System.out.print(s+" ");
            }

        }
    }
}
