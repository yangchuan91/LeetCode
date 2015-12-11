package com.leetcode.code.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int[] nums={1,141,12,141};
		System.out.println(new ContainsDuplicate().containsDuplicate3(nums));
	}
	/**
	 * 解法1 先对数组进行排序，然后让数组的一个数与该数的下一个数字对比是否相等，如果存在相等情况，
	 * 则返回true，否则返回false
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		if(nums==null||nums.length==0){
			return false;
		}
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++){
			if(nums[i]==nums[i-1]){
				return true;
			}
		}
		return false;
	}
	/**
	 * 解法2 利用set来存储数组，如果set中的大小与数组大小一样，则表示数组中的所有数字都没有重复的，
	 * 返回false，否则返回true
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate2(int[] nums) {
		if(nums==null||nums.length==0){
			return false;
		}
		Set<Integer> set=new HashSet<Integer>();
		for(int n:nums){
			set.add(n);
		}
		return set.size()!=nums.length;
	}
	/**
	 * 解法3  利用hashmap来存储数字(会超时)
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate3(int[] nums) {
		if(nums==null||nums.length==0){
			return false;
		}
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int n:nums){
			if(map.containsKey(n)){
				return true;
			}else{
				map.put(n, 1);
			}
		}
		return false;
	}
}
