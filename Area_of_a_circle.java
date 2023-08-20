import java.util.Scanner;  
import java.lang.Math;  
public class CircumferenceOfCircle  
{  
public static void main(String[] args)   
{  
double circumference, radius;  
  
Scanner sc=new Scanner (System.in);  
  
radius=sc.nextDouble();  
  
circumference= 3.14*radius*radius;  
 
System.out.format("%.2f",circumference);  
}    
} 