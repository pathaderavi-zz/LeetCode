import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] num = new int[]{1,1};
    System.out.println(hammingDistance(num));
        
    }
    
   
        public static int hammingDistance(int[] nums) {
            
            Arrays.sort(nums);
            int answer = 0;
            for(int i = 0; i < nums.length ; i++){
                if(i%2==1){
                answer = answer + Math.min(nums[i], nums[i-1]);
                }
            }
            
            return answer;
    }
}