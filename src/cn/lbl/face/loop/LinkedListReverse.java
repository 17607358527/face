package cn.lbl.face.loop;

import cn.lbl.face.recursion.LinkedListCreater;
import cn.lbl.face.common.Node;

import java.util.Arrays;

public class LinkedListReverse {


    public static Node LinkedListReverse(Node head){
        if(head ==null || head.getNext()==null){
            return head;
        }
        Node newHead = LinkedListReverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListCreater linkedListCreater = null;
        Node head = linkedListCreater.createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        Node.printList(head);
        Node newHead = LinkedListReverse(head);
        Node.printList(newHead);

    }
}
