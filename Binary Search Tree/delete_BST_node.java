package DSA.binary_search_tree;

import DSA.binary_trees.Node;

public class delete_BST_node {
    public static Node inorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root ==  null){
            return root;
        }
        if(root.data > val){
            root.left = delete(root.left , val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
//        root.data = val
        else{
//            leaf node
            if(root.left == null && root.right == null){
                return  null;
            }

//           left child null
            if(root.left == null){
                return root.right;
            }

//            right child null
            else if(root.right==null){
                return root.left;
            }

//            both child exist
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return  root;
    }
    public static void main(String[] args) {
        int values[] ={5,1,3,2,7};
        Node root = null;

        BST bst = new BST();

        for(int i=0;i<values.length;i++){
            root = bst.insert(root, values[i]);
        }

        bst.inorder(root);
        System.out.println();
        delete(root, 5);
        System.out.println();
        bst.inorder(root);
    }
}
