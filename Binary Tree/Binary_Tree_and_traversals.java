package DSA.binary_trees;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree{
    int ind = -1;

    Node buildTree(int[] nodes){
        ind++;
        if (ind >= nodes.length || nodes[ind] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[ind]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;

    }


    void preorderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    void inorderTraversal(Node root){
        if(root==null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    void postorderTraversal(Node root){
        if(root==null){
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data +" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }


}
public class binary_tree {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);
        tree.preorderTraversal(root);
        System.out.println();
        tree.inorderTraversal(root);
        System.out.println();
        tree.postorderTraversal(root);
        System.out.println();
        tree.levelOrderTraversal(root);
    }
}
