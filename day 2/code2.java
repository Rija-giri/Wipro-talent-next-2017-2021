/* algorithm to accept 10 integer elements for an array and then find the number of times
the number with the maximum value occurs in the array. */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int n,max,c;
	max=0;
	c=0;
	int[] a;         //declaration
            	a = new int[10];      //instantiation
            	for(int i=0;i<10;i++){  
               	 Scanner sc = new Scanner(System.in);
                	n=sc.nextInt();
                	a[i] = n;     //initialization values 
            }
            for(int i=0;i<10;i++)
            {
                if(a[i]>max)
                    max=a[i];
                if(max==a[i])
                    c+=1;
            }   
            
        System.out.println("max count=" +c);
        
        }
}

