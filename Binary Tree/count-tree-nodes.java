package DSA.binary_trees;

public class count_tree_nodes {
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);

        return leftNode+rightNode+1;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);
        int count = countNodes(root);
        System.out.println(count);
    }
}
