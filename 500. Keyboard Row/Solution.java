import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String[] s = new String[] {"Hello", "Alaska", "Dad", "Peace"};

    String[] ss = findWords2(s);
    for(int j = 0 ;j < ss.length ; j++){
        System.out.println(ss[j]);
    }

        
    }
    public static String[] findWords2(String[] st){
        
        String a = "qwertyuiopQWERTYUIOP";
        String b1 = "asdfghjklASDFGHJKL";
        String c1 = "zxcvbnmZXCVBNM";
        HashMap<Character,Integer> ab = new HashMap();
        ArrayList<String> result = new ArrayList();
        
        char[] b = a.toCharArray();
        char[] d = b1.toCharArray();
        char[] e = c1.toCharArray();
        
        for(int i = 0 ; i < b.length ; i++){
                ab.put(b[i], 1);
        }
        for(int i = 0 ; i < d.length ; i++){
            ab.put(d[i], 2);
    }
        for(int i = 0 ; i < e.length ; i++){
            ab.put(e[i], 3);
    }
        
        for(int i = 0;  i< st.length ; i++){
            String check = st[i];
        
            int previous = 0;
            int current = 0;
        
            for(int j = 1 ; j<check.length();j++){
            
                char t = check.charAt(j);
                current = ab.get(t);
                previous = ab.get(st[i].charAt(j-1));
                
                if(current!=previous){
                    break;
                }
            }
            
            if(current==previous){
                result.add(check);}
            
            
        }
    
        
    return result.toArray(new String[result.size()]);
    }
   
        public static String[] findWords(String[] st) {
            ArrayList<String> te = new ArrayList();
            
       for(int i = 0 ; i < st.length ; i++){
            String s = st[i];
            
            
if((s.matches("[qwertyuiopQWERTYUIOP]*") && !s.matches("[asdfghjklASDFGHJKL]*") && !s.matches("[zxcvbnmZXCVBNM]*"))
        || 
        (!s.matches("[qwertyuiopQWERTYUIOP]*") && s.matches("[asdfghjklASDFGHJKL]*") && !s.matches("[zxcvbnmZXCVBNM]*"))
        ||
(!s.matches("[qwertyuiopQWERTYUIOP]*") && !s.matches("[asdfghjklASDFGHJKL]*") && s.matches("[zxcvbnmZXCVBNM]*")))
        
    {   
    te.add(st[i]);
}else{
    
}
       }
            return te.toArray(new String[te.size()]);
        }
}