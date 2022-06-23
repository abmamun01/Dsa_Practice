package BinaryTree;

public class PreOrder_Traversal {

    public static void preOrder(MyBinaryTree.Node root) {

        //Base case jodi kono vabe amdr root null hoye jay
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        //ret korbe root            // call build tree function
        MyBinaryTree.Node root = tree.buildTree(nodes);

        preOrder(root);
    }
}
