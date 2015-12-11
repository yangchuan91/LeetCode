package com.leetcode.code.easy;

import java.util.HashMap;
import java.util.Map;


public class RemoveDuplicatesfromSortedList {
	
	public static void main(String[] args) {
		new RemoveDuplicatesfromSortedList().testFunction();
	}
	
	public void testFunction(){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		n1.next=n2;
		System.out.println(deleteDuplicates(n1));
	}
	/**
	 * 利用hashmap来存储链表的值，然后进行是否重复判断，重复就删除节点，否则就加入到map中
	 * @param head
	 * @return
	*/ 
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode p2=head;
		ListNode p1=head.next;
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		map.put(head.val, 1);
		while(p1!=null){
			//如果map中包含节点数据则删除节点
			if(map.containsKey(p1.val)){
				p2.next=p1.next;
			}else{
				map.put(p1.val, 1);
				p2=p2.next;
			}
			p1=p1.next;
		}
        return head;
    }
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}
		
	}
}
