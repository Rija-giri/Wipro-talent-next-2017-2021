    //Welcome Message using Command Line Argument


import java.util.*;


public class WelcomeMsg {
    
	public static void main(String args[]) {
        
		System.out.println("Enter your name ");     //Yuva
        
		Scanner sc=new Scanner(System.in);
        
		String str=sc.nextLine();
        
		System.out.println(args[0]+" "+str);        //Welcome Yuva
    
	}

}