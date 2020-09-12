package cn.lbl.face.link;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next=null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution{
    //实现链表的反转
    public static ListNode ReverseList(ListNode head){
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            temp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        ListNode listNode = ReverseList(listNode1);
    }
}
