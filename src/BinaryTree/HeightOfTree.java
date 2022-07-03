package BinaryTree;

public class HeightOfTree {

    static int heightFunc(MyBinaryTree.Node root) {

        //Base case : jodi kono ak somoy amdr root jodi null hoye jay
        if (root == null){
            return 0;
        }


        int leftHeight = heightFunc(root.left);
        int rightHeight = heightFunc(root.right);

        // finding maximum height
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;

        return maxHeight;
    }

}
