package DSA.binary_trees;

public class subtree_of_the_tree {
    public static boolean isIdentical(Node root, Node subRoot){
//      leaf condition
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        return false;
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);

        int subNodes[] = {1,2,4};
        BinaryTree subTree = new BinaryTree();
        Node subroot =tree.buildTree(subNodes);

        boolean bool = isSubtree(root,subroot);
        System.out.println(bool);
    }
}
