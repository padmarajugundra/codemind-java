import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=(a+b)/2;
        System.out.format("%.4f",c);
    }
}