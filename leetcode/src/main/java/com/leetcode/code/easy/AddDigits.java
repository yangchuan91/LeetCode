package com.leetcode.code.easy;

public class AddDigits {
	public static void main(String[] args) {
		AddDigits addDigits=new AddDigits();
		System.out.println(addDigits.addDigits2(0));
	}
	/**
	 * 解答方法1(笨重的方法,递归法)
	 * @param num
	 * @return
	 */
	public int addDigits(int num) {
		if(num<10){
			return num;
		}
		int sum=0;
		while(true){
			sum=sum+num%10;
			num=num/10;
			if(num==0){
				break;
			}
		}
		return addDigits(sum);
	}
	/**
	 * 解答方法2 (数学公式  dr(n) = 1+((n-1) mod 9))
	 * 具体公式的证明和说明：https://en.wikipedia.org/wiki/Digital_root
	 * @param num
	 * @return
	 */
	public int addDigits2(int num) {
		return 1+(num-1)%9;
	}

}
