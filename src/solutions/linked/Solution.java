package solutions.linked;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

class Solution {

    public static Node removeDuplicates(Node head) {
        Set<Integer> integerSet = new HashSet<>();
        if (head == null) {
            return head;
        }

        integerSet.add(head.data);

        Node node = head;

        while (node.next != null) {
            if (integerSet.contains(node.next.data))
                node.next = node.next.next;
            else {
                integerSet.add(node.next.data);
                node = node.next;
            }
        }

        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
