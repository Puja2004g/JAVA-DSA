package DSA.binary_trees;

class TreeInfo {
    int height;
    int diameter;

    TreeInfo(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}

public class diameter_of_tree {
    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diameter;
        int diam3 = rightTI.diameter;

        int myDiameter = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiameter);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        TreeInfo result = diameter(root);
        System.out.println(result.diameter);
    }
}
