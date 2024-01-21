package DSA.binary_search_tree;

import DSA.binary_trees.Node;

public class search_BST {
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data > key){
            return search(root.left,key);
        }

        else if(root.data == key){
            return true;
        }
        else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] ={5,1,3,2,7};
        Node root = null;

        BST bst = new BST();

        for(int i=0;i<values.length;i++){
            root = bst.insert(root, values[i]);
        }

        bst.inorder(root);

        boolean s = search(root, 1);
        if(s){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
