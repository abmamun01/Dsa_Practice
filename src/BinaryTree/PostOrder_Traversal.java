package BinaryTree;

public class PostOrder_Traversal {

    public static void postOrderTree(MyBinaryTree.Node root) {
        if (root == null) {
            return;
        }

        postOrderTree(root.left);
        postOrderTree(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        //ret korbe root            // call build tree function
        MyBinaryTree.Node root = tree.buildTree(nodes);

        postOrderTree(root);
    }
}
