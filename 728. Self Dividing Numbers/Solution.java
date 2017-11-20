import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   

    	List<Integer> av = selfDividing(66,708);
    	for(int a:av){
    		System.out.println(a);
    	}
    }
    
    public static List<Integer> selfDividing(int left,int right){
    	int n = left;
    	
    	ArrayList<Integer> av = new ArrayList();
    	for(;n<=right;n++){
    		if(n%10==0){
    			n++;
    		}
    		int j  = 10;
        	int k = 1;
        	int st = 0;
    	while((n%j)<=n){
    		
    		System.out.println(n%j+" "+(n%j)/k+" "+k);
    		if(((n%j)/k)==0||n%((n%j)/k)!=0){
    			st =1;
    		}else{
    			
    		}

    		j=j*10;
    		
    		if(j>n*10){
    			break;
    		}
    		k = k*10;
    		
    	}	
    	
    	if(st==0){
    	av.add(n);
    	}
    	}
    return av;
    
    }
    }

