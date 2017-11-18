import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
    System.out.println(reverseWords(s));
        
    }
    
   
        public static String reverseWords(String s) {
            String[] split = s.split("\\s+");
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < split.length ; i++){
                if(i>0){
                    result.append(" ");
                }
                for(int j = split[i].length()-1; j >=0 ; j--){
                    result.append(split[i].charAt(j));
                }
            }
            
            return result.toString();
        }
}