package com.leetcode.code.easy;

/**
 * I=1；X=10；C=100；M=1000；V=5；L=50；D=500；
 * 罗马数字的对应关系
 * @author hp
 *
 */
public class RomantoInteger {
	public static void main(String[] args) {
		System.out.println(new RomantoInteger().romanToInt("MCDLXXVI"));
	}
	/**
	 * http://blog.renren.com/share/101882459/3870158838
	 * 根据博客了解罗马数字的编码规则，然后根据规则来解决
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		int sum=0;
		char c;
        for(int i=0;i<s.length();i++){
        	c= s.charAt(i);
        	if(i==s.length()-1){
        		if(c=='I'){
            		sum+=1;
            	}
            	else if(c=='X'){
            		sum+=10;
            	}
            	else if(c=='C'){
            		sum+=100;
            	}
            	else if(c=='M'){
            		sum+=1000;
            	}
            	else if(c=='V'){
            		sum+=5;
            	}
            	else if(c=='L'){
            		sum+=50;
            	}
            	else if(c=='D'){
            		sum+=500;
            	}
        	}
        	else{
        		if(c=='I'){
        			if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X'){
        				sum-=1;
        			}else{
        				sum+=1;
        			}
            	}
            	else if(c=='X'){
            		if(s.charAt(i+1)=='C'||s.charAt(i+1)=='L'){
        				sum-=10;
        			}else{
        				sum+=10;
        			}
            	}
            	else if(c=='C'){
            		if(s.charAt(i+1)=='M'||s.charAt(i+1)=='D'){
        				sum-=100;
        			}else{
        				sum+=100;
        			}
            	}
            	else if(c=='M'){
            		sum+=1000;
            	}
            	else if(c=='V'){
            		sum+=5;
            	}
            	else if(c=='L'){
            		sum+=50;
            	}
            	else if(c=='D'){
            		sum+=500;
            	}
        	}
        }
        return sum;
    }
}
