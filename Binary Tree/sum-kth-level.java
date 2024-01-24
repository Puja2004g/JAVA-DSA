package DSA.binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class sum_kth_level {
        public static int sum_k_level(int k, Node root) {
            if (root == null) {
                return 0;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); // to mark the end of the first level
            int level = 0;
            int sum = 0;

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    // End of the current level
                    level++;

                    if (level == k) {
                        // We reached the k-th level
                        return sum;
                    }

                    if (!q.isEmpty()) {
                        // Add a marker for the next level
                        q.add(null);
                    }
                } else {
                    // Add children to the queue
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }

                    // Accumulate the sum if we are at the k-th level
                    if (level == k) {
                        sum += currNode.data;
                    }
                }
            }

            // If we reach here, the k-th level doesn't exist in the tree
            return 0;
        }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        int sum = sum_k_level(2,root);
        System.out.println(sum);
    }
}
