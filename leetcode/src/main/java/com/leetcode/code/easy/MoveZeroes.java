package com.leetcode.code.easy;

public class MoveZeroes {
	public static void main(String[] args) {
		int[]a={0, 1, 0, 3, 12};
		new MoveZeroes().moveZeroes(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	/**
	 * 解题思路：查找数组中0与数组中0的索引值之后的非0的第一个数字交换位置即可
	 * @param nums
	 */
	public void moveZeroes(int[] nums) {
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				for(int j=i+1;j<nums.length;j++){
					if(nums[j]!=0){
						nums[i]=nums[j];
						nums[j]=0;
						break;
					}
				}
			}
		}
    }
}
