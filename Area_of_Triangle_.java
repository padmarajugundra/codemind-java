import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double a =s.nextDouble();
        double b =s.nextDouble();
        double c =s.nextDouble();
        double sr=(a+b+c)/2;
        double ar=Math.sqrt(sr*(sr-a)*(sr-b)*(sr-c));
        System.out.format("%.2f",ar);
    }
}