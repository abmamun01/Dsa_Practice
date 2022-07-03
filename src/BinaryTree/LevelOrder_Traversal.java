package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_Traversal {
    /**
     * BFS - Breath First Search -O(n)
     * parent ber korar age children gula enter korate hboe
     * <p>
     * null use korechi next line print korar jonno
     */


    public static void levelOrder(MyBinaryTree.Node root) {
        if(root == null) {
            return;
        }
        Queue<MyBinaryTree.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            MyBinaryTree.Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        //ret korbe root            // call build tree function
        MyBinaryTree.Node root = MyBinaryTree.BinaryTree.buildTree(nodes);
        levelOrder(root);

    }
}
