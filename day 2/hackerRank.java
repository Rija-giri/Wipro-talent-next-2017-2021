//Arrange Array:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        Solution test = new Solution();
        String result=test.move(st);
        System.out.println(result);
    }
    public String move(String str) {
        int len=str.length();
        char ch;
        String low="";
        String upr="";
        for(int i=0;i<len;i++){
            ch=str.charAt(i);
            if (ch>='A' && ch<='Z'){
                upr += ch;
            }
            else{
                low+=ch;
            }
        }
        return low+upr;
    }
}

