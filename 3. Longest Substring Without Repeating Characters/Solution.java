import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
 
        System.out.println(lengthOfLongestSubstring("c"));
        }
    
    public static int lengthOfLongestSubstring(String s){
        
        HashSet<Character> subString = new HashSet();
        int j = -1 ;
        int current = 0;

        
        for(int i = 0 ; i< s.length() ;){
        
        if(!subString.contains(s.charAt(i)) && j <= i){
            
            subString.add(s.charAt(i));
            i++;
            
        }else{
            current = Math.max(current,subString.size());
            if(j==-1){
                j=0;
            }
            subString.remove(s.charAt(j));
            
            j++;
        }
        if(i==s.length() && !subString.isEmpty()){
            current = Math.max(current, subString.size());
        }
        
        }
    return current;
        
    }

}
