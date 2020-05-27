//Write a program to accept a number N and print whether it is positive, negative or zero
import java.util.*;
public class Main
{
	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in); 
  int n= sc.nextInt();
        
  if(n>0) 	
  System.out.println("positive");
  else if (n==0)
  System.out.println("zero");
  else if (n<0)
  System.out.println("negative");

	}
}
