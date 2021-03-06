package cn.lbl.face.common;

public class Node {
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next=null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printList(Node head){
        while (head !=null){
            System.out.print(head.getValue());
            System.out.print(" ");
            head=head.next;
        }
        System.out.println();
    }
}
