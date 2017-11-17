import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	
    	System.out.println(reverseString("Ravikiran"));
    }
    
    public static String reverseString(String s){
    	StringBuilder sb = new StringBuilder(s);
    	
for(int i = 0 ; i < s.length()/2; i++){
	
		sb.setCharAt(i, s.charAt(s.length()-i-1));
		sb.setCharAt(s.length()-i-1, s.charAt(i));
        }
    
return sb.toString();
    	
    }
}