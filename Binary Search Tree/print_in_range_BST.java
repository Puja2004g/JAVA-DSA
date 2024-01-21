package DSA.binary_search_tree;

import DSA.binary_trees.Node;

public class print_in_range_BST {
    public static void range(Node root, int x, int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            range(root.left, x, y);
            System.out.print(root.data+" ");
            range(root.right, x, y);
        }
        if(root.data<=x){
            range(root.right, x, y);
        }
        if(root.data>=y){
            range(root.left, x,y);
        }
    }

    public static void main(String[] args) {
        int values[] ={8,5,10,3,6,11,1,4,14};
        Node root = null;

        BST bst = new BST();

        for(int i=0;i<values.length;i++){
            root = bst.insert(root, values[i]);
        }

        bst.inorder(root);
        System.out.println();
        range(root, 6,10);
    }
}
