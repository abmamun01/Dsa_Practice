public class BinarySearchTree {
    /**
     * // 5,1,3,4,2,7
     * 1st "Root" r value null hobe
     * 2nd check korbo j Root r value ki null jodi null tahole Root r value update kore 5 add korbo
     * <p>
     * tarpor 5 k 1 r sathe compare korbo jodi choto hoy tahole left bosabo
     * tarpor 3 k 5 r sathe ,,      ,,  ,   ,,  ,,      ,,  ,,   left jabo kintu left to already 1 ache
     * tai 1 r sathe compare korbo jodi boro hoy tahole 1 right child ye jabe
     */


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    //ai function tar kaj holo jei node e amdr k dewa hobe seta amdr BST te insert korbo
    public static Node insert(Node root, int val) {
        // checking if root = to null jodi null hoy tahole insert kora sobcey sohoj
        //simply new node create korte hobe take node insert korte hobe tarpor return kore dite hobe

        //1st case
        if (root == null) {
            root = new Node(val);
            return root;
        }

        //2nd case comparison
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }


        return root;

    }

    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        // find in leftSubTree
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }


    }

    //for suring is it ok tree
    public static void inOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.left);
        System.out.print(root.data + " ");
        inOrderTraverse(root.right);
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};

        // main func ye node type root define korbo jeta k null value diye init korbo
        Node root = null;

        // ak ak value te jabe and BST te insert korbe
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrderTraverse(root);
        System.out.println();
        if (search(root, 9)) {
            System.out.println("Found");
        } else System.out.println("Not Found");
    }
}
