package solutions;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

//class Solution {
//
//    public static  Node insert(Node head,int data) {
//        Node node = new Node(data);
//
//        if (head == null)
//            return node;
//
//        Node nextNode = head;
//
//
//        while(nextNode.next != null) {
//            nextNode = nextNode.next;
//        }
//
//        nextNode.next = node;
//
//
//        return head;
//
//    }
//
//    public static void main(String[] args) {
//        Node node = null;
//
//        node = insert(node, 1);
//        node = insert(node, 2);
//        node = insert(node, 3);
//
//        System.out.println(node.data);
//    }
//}