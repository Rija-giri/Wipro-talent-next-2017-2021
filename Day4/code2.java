import java.util.*;
public class Main { 
    public static void main(String[] args) 
    { 
        Scanner s1 = new Scanner(System. in);
        System. out. println("Enter a string1");
        String str1 = s1. nextLine(); 
        Scanner s2 = new Scanner(System. in);
        System. out. println("Enter a string2");
        String str2 = s2. nextLine();
        if( str1.substring( str1.length()-1).equalsIgnoreCase( str2.substring(0,1)) )
                    System.out.println(  str1.concat( str2.substring(1, str2.length())).toLowerCase() );
                else
                    System.out.println(  str1.concat( str2).toLowerCase() ); 
    } 
} 
