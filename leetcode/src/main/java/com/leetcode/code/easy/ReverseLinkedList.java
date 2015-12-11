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
		int count=0;
		//ListNode newNode=new ListNode(head.val);
		ListNode tmp;
		while(head!=null){
			tmp=head;
			if(count==0){
				
			}
			tmp=head.next;
			//result=result.next;
		}
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
