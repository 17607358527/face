package cn.lbl.face.recursion;

import cn.lbl.face.common.Node;

import java.util.Arrays;
import java.util.List;

public class LinkedListCreater {

    public static Node createLinkedList(List<Integer> data){
        if (data.size()==0){
            return null;
        }
        Node  firstNode = new Node(data.get(0));
        Node linkedList = createLinkedList(data.subList(1, data.size()));
        firstNode.setNext(linkedList);
        return firstNode;
    }


    public static void main(String[] args) {
        Node head = createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
//        Node head2 = createLinkedList(Arrays.asList(1));
        Node.printList(head);
//        Node.printList(head2);
    }
}
