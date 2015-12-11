package com.leetcode.code.easy;

public class Numberof1Bits {
	/**
	 * 如果n是十进制的话
	 * 
	 * @param n
	 * @return
	 */
	public int hammingWeight2(int n) {
		// 余数
		int mod = 0;
		// 总和
		int sum = 0;
		while (true) {
			mod = n % 2;
			n = n / 2;
			if (mod == 1) {
				sum += mod;
			}
			if (n == 0) {
				break;
			}
		}
		return sum;
	}

	/**
	 * @param n
	 * @return
	 */
	public int hammingWeight(int n) {
		int count = 0;
		String input = Integer.toBinaryString(n);
		int length = input.length();
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	// 2147483648
	// 4294967296
	public static void main(String[] args) {
		System.out.println(new Numberof1Bits().hammingWeight2(2));
		// System.out.println(new Integer(4294967296)/2>2147483648);
	}
}
