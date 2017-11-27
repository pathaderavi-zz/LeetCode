import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        int[] n = {3,2,4};
        int[] result = twoSum(n,6);
        
        for(int a : result){
            System.out.println(a);
        }
        }
     public static int[] twoSum(int[] nums, int target) {
         
        HashMap<Integer,Integer> allNums = new HashMap();
         
        for(int i = 0 ; i< nums.length ; i++){
            
    
            allNums.put(nums[i],i);
            
        
            }
        int[] result = new int[2];
        for(int i = 0 ; i< nums.length ; i++){
            allNums.remove(nums[i],i);
            
            int j = target - nums[i];
            
            if(allNums.containsKey(j)){
                result[0] = i;
                result[1] = allNums.get(j);
            
                return result;
            }
        }
        
        
        
        return null;
        }
     