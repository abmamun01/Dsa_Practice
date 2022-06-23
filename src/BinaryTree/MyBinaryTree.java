package BinaryTree;

public class MyBinaryTree {


    //Node r jonno class create korlam
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {

        //prottekta indexy ye traverse korar jonno var lagbe
        //ata k bar bar incmt kore pura length ye jate jaite pari
        static int idx = -1;

        // ai function ta sob node gula collect korbe tarpor Root node return korbe
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            /** First Tree r right subTree and Right subTree create
             * hobe tarpor return hoye jabe
             *
             * end ye root node return hobe
             */

            //baki data ar jonno ai func
            Node newNode = new Node(nodes[idx]);
            //First of all notun "node" r left "SubTree" create korbo

            //akhane jei node asuk na kn take left ye store korbo
            newNode.left = buildTree(nodes);

            //akhon newNode right subtree
            newNode.right = buildTree(nodes);


            return newNode;

        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();

        //ret korbe root            // call build tree function
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
    }
}
