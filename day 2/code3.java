/* algorithm to calculate the factorial of a number N. The value of N is provided as an
input by the user */.
import java.util.*;
public class Main{  
 public static void main(String args[]){  
     int i,n,fact=1;  
     Scanner sc = new Scanner(System.in);
     n=sc.nextInt();
     for(i=1;i<=n;i++){    
         fact=fact*i;    
         }    
         System.out.println("Factorial of "+n+" is: "+fact);    
     
 }  
}  
