import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (n>=0)
        System.out.println("Positive Number");
        else
        System.out.println("Negative Number");
    }
}