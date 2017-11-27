import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    System.out.println(hammingDistance(19,2));
        
    }
    
   
        public static int hammingDistance(int x, int y) {
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        
        String xB = Integer.toBinaryString(a);
        String yB = Integer.toBinaryString(b);
        
        String d = "";
        for(int i = 0 ; i< (xB.length()-yB.length());i++){
            
            d = d+"0";
        }
        yB = d+yB;
        int distance=0;
        for(int i = 0;i<xB.length();i++){
            if(!(xB.charAt(i)==(yB.charAt(i)))){
                distance = distance +1;
            }
        }
        
        System.out.println(xB+" "+yB);
  return distance;      
            
    }
}

