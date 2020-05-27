//Write a program to accept two numbers and print the greater value of the two
import java.util.*;
public class Main
{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 
	System.out.println("a=");
  int a= sc.nextInt();
  Scanner sc1= new Scanner(System.in);
  System.out.println("b=");
  int b= sc1.nextInt();

  if(a>b)
        System.out.println("a is greater");
  else
       System.out.println("b is greater");
	}
}
