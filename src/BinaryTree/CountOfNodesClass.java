package BinaryTree;

public class CountOfNodesClass {

    /**
     * 1st left subtree r count koro
     * 2nd right subtree r count koro
     * tarpor add +1
     */
    static int countOfNodes(MyBinaryTree.Node root) {

        //Base case : jodi kono ak somoy amdr root jodi null hoye jay
        if (root == null){
            return 0;
        }
        int leftCountSubtree = countOfNodes(root.left);
        int rightCountSubtree = countOfNodes(root.right);

        return leftCountSubtree + rightCountSubtree + 1;
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        //ret korbe root            // call build tree function
        MyBinaryTree.Node root = MyBinaryTree.BinaryTree.buildTree(nodes);
        System.out.println(countOfNodes(root));
    }
}
