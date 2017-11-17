import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    System.out.println(hammingDistance("RLUD"));
        
    }
    
   
        public static boolean hammingDistance(String ex) {
            if(ex.length()%2==1){
                return false;
            }
            int rCount = 0;
            int lCount = 0;
            int uCount = 0;
            int dCount = 0;
            
            for(int i = 0; i < ex.length() ; i++){
                String f = Character.toString(ex.charAt(i));
                if(f.equals("R")){
                    rCount += 1;
                }
                if(f.equals("L")){
                lCount += 1;
                }
                if(f.equals("U")){
                    uCount += 1;
                }
                if(f.equals("D")){
                    dCount += 1;
                }
            
            }
            if(rCount==lCount && uCount == dCount){
                return true;
            }else{
                return false;
            }
            
    }
}