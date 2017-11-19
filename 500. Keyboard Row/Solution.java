import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	String[] s = new String[] {"Hello", "Alaska", "Dad", "Peace"};
    //System.out.println(hammingDistance(s));
    String[] ss = findWords(s);
    for(int j = 0 ;j < ss.length ; j++){
    	System.out.println(ss[j]);
    }

    	
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