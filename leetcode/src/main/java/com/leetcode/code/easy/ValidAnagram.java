package com.leetcode.code.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	/**
	 * 解法1 对字符串进行排序，然后在进行比较
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		char[]a=s.toCharArray();
		char[]b=t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		s=String.valueOf(a);
		t=String.valueOf(b);
		return s.equals(t);
	}
	/**
	 * 解法2 利用Map来存储字符和字符的个数，遍历s字符串，然后对里面的字符串进行加计数；
	 * 其中key为 s字符，value是s字符的个数；最后在对t字符串对map进行减数操作
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram2(String s, String t) {
		char[]a=s.toCharArray();
		char[]b=t.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(char c:a){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		for(char c:b){
			if(map.containsKey(c)){
				map.put(c, map.get(c)-1);
			}else{
				return false;
			}
		}
		for(char c:map.keySet()){
			if(map.get(c)!=0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new ValidAnagram().isAnagram2("sadjalksdjl1", "sadjalksdjl"));
	}
}
