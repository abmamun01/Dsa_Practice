package BinaryTree;

public class InOrder_Tree {


    public static void inOrder_Tree(MyBinaryTree.Node root) {
        if (root == null) {
            return;
        }

        inOrder_Tree(root.left);
        System.out.print(root.data + " ");
        inOrder_Tree(root.right);
    }

    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        //ret korbe root            // call build tree function
        MyBinaryTree.Node root = tree.buildTree(nodes);

        inOrder_Tree(root);
    }
}
