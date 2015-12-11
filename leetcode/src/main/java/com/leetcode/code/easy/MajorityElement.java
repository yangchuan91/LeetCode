package com.leetcode.code.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static void main(String[] args) {
		//int[] nums={1,2,2,4,2,2,3};
		int[] nums={1};
		System.out.println(new MajorityElement().majorityElement2(nums));
	}
	/**
	 * 先排序，然后统计数字大于num.length/2的数
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int count=1;
		int value=nums[0];
		for(int i=1;i<nums.length;i++){
			if(count>nums.length/2){
				return value;
			}
			if(nums[i]==value){
				count++;
			}else{
				count=1;
				value=nums[i];
			}
		}
		return value;
	}
	/**
	 * 利用hashmap来存储数据和数据的个数
	 * @param nums
	 * @return
	 */
	public int majorityElement2(int[] nums) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			int key=nums[i];
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
			if(map.get(key)>nums.length/2){
				return key;
			}
		}
		return 0;
	}
}
