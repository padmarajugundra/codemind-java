import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		double Perimeter, s, Area;
		Scanner sc = new Scanner(System.in);
		
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();

		Perimeter = side1 + side2 + side3;
		s = Perimeter/2; 
		Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.format("%.2f",Area);
	}
}