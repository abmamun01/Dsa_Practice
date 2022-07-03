package BinaryTree;

public class SumOfNodes {


    static int sumOfNodes(MyBinaryTree.Node root) {

        //Base case : jodi kono ak somoy amdr root jodi null hoye jay
        if (root == null){
            return 0;
        }
        int leftCountSubtree = sumOfNodes(root.left);
        int rightCountSubtree = sumOfNodes(root.right);

        return leftCountSubtree + rightCountSubtree + root.data;
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        //ret korbe root            // call build tree function
        MyBinaryTree.Node root = MyBinaryTree.BinaryTree.buildTree(nodes);
        System.out.println(sumOfNodes(root));
    }
}
