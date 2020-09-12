package cn.lbl.face.recursion;

import cn.lbl.face.common.Node;

import java.util.Arrays;

public class LinkedListReverse2 {


    public static Node LinkedListReverse(Node head){
        Node newHead=null;
        Node currentHead=head;
        while (currentHead!=null) {
            Node next=currentHead.getNext();
            currentHead.setNext(newHead);
            newHead = currentHead;
            currentHead = next;
        }
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
