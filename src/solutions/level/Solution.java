package solutions.level;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    static void levelOrder(Node root) {

        int level = 1;

        while (levelOrderAux(root, level)) {
            level++;
        }

    }

    public static boolean levelOrderAux(Node root, int level) {
        if (root == null)
            return false;


        if (level == 1) {
            System.out.print(root.data + " ");

            return true;
        }

        boolean left = levelOrderAux(root.left, level - 1);
        boolean right = levelOrderAux(root.right, level - 1);

        return left || right;
    }

    public static int getHeight(Node root) {
        int right = 0;
        int left = 0;

        // break;
        if (root == null)
            return 0;

        if (root.left != null) {
            left = 1 + getHeight(root.left);
        }

        if (root.right != null) {
            right = 1 + getHeight(root.right);
        }

        return Math.max(right, left);
    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
