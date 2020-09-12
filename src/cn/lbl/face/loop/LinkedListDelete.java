package cn.lbl.face.loop;

import cn.lbl.face.recursion.LinkedListCreater;
import cn.lbl.face.common.Node;

import java.util.Arrays;

public class LinkedListDelete {
    private static Node newHead;
    public static Node deleteForEle(Node head, int n) {
        if(head==null){
            return null;
        }
        while (head.getValue()==2){
            head=head.getNext();
            newHead=head;
        }
        newHead = head;
        Node pre = null;
        while (head != null) {
            if (head.getValue() == n) {
                pre.setNext(head.getNext());
            } else {
                pre = head;
            }
            head = head.getNext();
        }
        return newHead;
    }


    public static void main(String[] args) {
        Node linkedList = LinkedListCreater.createLinkedList(Arrays.asList(2,1, 3, 2, 5));
        deleteForEle(linkedList, 2);
        Node.printList(newHead);
        Node linkedList1 = LinkedListCreater.createLinkedList(Arrays.asList(2,1, 3, 2, 2));
        deleteForEle(linkedList1, 2);
        Node.printList(newHead);
        Node linkedList2 = LinkedListCreater.createLinkedList(Arrays.asList(2,2, 3, 2, 5));
        deleteForEle(linkedList2, 2);
        Node.printList(newHead);
    }
}
