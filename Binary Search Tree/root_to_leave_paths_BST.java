package DSA.binary_search_tree;
import DSA.binary_trees.Node;
import java.util.ArrayList;

public class root_to_leave_paths_BST {
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void rootLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
//        leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{ //non-leaf
            rootLeaf(root.left, path);
            rootLeaf(root.right, path);
        }

        path.remove(path.size()-1);
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
        rootLeaf(root,new ArrayList<>());
    }
}
