//program to accept two numbers and print wheather their sum is EVEN or ODD
import java.util.*;
public class Main
{
	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in); 
  System.out.println("a=");
  int a= sc.nextInt();
  Scanner sc1= new Scanner(System.in); 
  System.out.println("b=");
  int b= sc.nextInt();
  if((a+b)%2==0)
             System.out.println("a+b is even");
  else
              System.out.println("a+b is odd");
	}
}
