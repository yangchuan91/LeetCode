package com.leetcode.code.easy;
/**
 * 这道题的关键就是把实际问题转化为数学问题，
 * 假定你每次最多能挪走的石头是X个，那么
 * @author hp
 *
 */
public class NimGame {
	public boolean canWinNim(int n) {
        return n%4!=0;
    }
}
