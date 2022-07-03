package BinaryTree;

public class InOrder_Tree {
// 1.left 2.root 3.right

    public static void inOrder_Tree(MyBinaryTree.Node root) {
        //checking if root null
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
