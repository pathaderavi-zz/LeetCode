import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    System.out.println(hammingDistance(19,2));
        
    }
    
   
        public static int hammingDistance(int x, int y) {
           int d = x^y;
            int dist = 0;
            while(d>=1){
                if(d%2==1){
                    dist = dist +1;
                }
                d = d/2;
            }
            return dist;
            
    }
}