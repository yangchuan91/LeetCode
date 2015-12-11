package com.leetcode.code.easy;

import java.util.Stack;

public class ReverseLinkedList {
	/**
	 * 将链表的值存到栈中，主要是反转链表的值
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		if(head==null){
			return null;
		}
		Stack<Integer> stack=new Stack<Integer>();
		ListNode tmp=head;
		ListNode result=head;
		while(tmp!=null){
			stack.push(tmp.val);
			tmp=tmp.next;
		}
		while(result!=null){
			result.val=stack.pop();
			result=result.next;
		}
		return head;
	}
	/**
	 * 重新初始化一个聊表
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode n1,n2,n3;
		n1=head;
		n2=n1.next;
		while(n2!=null){
			n3=n2.next;
			n2.next=n1;
			n1=n2;
			n2=n3;
		}
		head.next=null;
		return n1;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
