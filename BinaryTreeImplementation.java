package BinaryTree;
import java.util.*;

public class BinaryTreeImplementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static class BinaryTree {
        private Node root;  // Root node of the binary tree

        // Populate tree method
        void populate(Scanner scanner) {
            System.out.println("Enter root Node:");
            int val = scanner.nextInt();
            this.root = new Node(val); // Assign to the actual instance variable root
            populate(this.root, scanner);
        }

        void populate(Node node, Scanner scanner) {
            System.out.println("Do you enter the value at left of: " + node.val + " (true/false)?");
            boolean left = scanner.nextBoolean();
            if (left) {
                System.out.println("Enter the value for left of: " + node.val);
                int val = scanner.nextInt();
                node.left = new Node(val);
                populate(node.left, scanner);
            }

            System.out.println("Do you enter the value at right of: " + node.val + " (true/false)?");
            boolean right = scanner.nextBoolean();
            if (right) {
                System.out.println("Enter the value for right of: " + node.val);
                int val = scanner.nextInt();
                node.right = new Node(val);
                populate(node.right, scanner);
            }
        }

        // Display the binary tree
        void display() {
            display(this.root, ""); // Pass an empty indent initially
        }

        void display(Node node, String indent) {
            if (node == null) {
                return;
            }
            System.out.println(indent + node.val);
            display(node.left, indent + "  ");  // Add indentation for better visualization
            display(node.right, indent + "  ");
        }

        //pretty display
        public void prettyDisplay() {
            prettyDisplay(this.root, 0);
        }

        private void prettyDisplay(Node node, int level) {
            if (node == null) {
                return;
            }

            prettyDisplay(node.right, level + 1);

            if (level != 0) {
                for (int i = 0; i < level - 1; i++) {
                    System.out.print("|\t\t");
                }
                System.out.println("|------->" + node.val);
            } else {
                System.out.println(node.val);
            }
            prettyDisplay(node.left, level + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        System.out.println("Tree Structure:");
        tree.display();
        System.out.println();
        tree.prettyDisplay();
        scanner.close();

    }
}
