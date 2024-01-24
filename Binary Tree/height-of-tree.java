package DSA.binary_trees;

public class height_of_tree {
    public  static  int height(Node root){
        if(root==null){
            return 0;
        }

        int leftSubtree = height(root.left);
        int rightSubtree = height(root.right);

        return Math.max(leftSubtree, rightSubtree)+1;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);

        int h = height(root);
        System.out.println(h);
    }
}
