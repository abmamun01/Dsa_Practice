package Queue_P;

public class Queue_LinkedList {
    static int rear = -1;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        // jokhon amadr head & tail null hobe tokhon e empty hobe
        static boolean isEmpty() {
            return head == null & tail == null;
        }

        static void add(int data) {
            //1st element add
            Node newNode = new Node(data);
            //surute jodi link list r first element hoy tahole tail r head 2tai newNode hobe
            if (tail == null) {
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty ?Queeu");
                return -1;
            }
            int front = head.data;
            head = head.next;

            //single element jodi thake tahole
            if (head == tail) {
                //jodi head theke element tail r kache jay tahole aikhane kono elemen r thakbena jehetu single
                tail = null;
            }
            return front;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue();
        qq.add(1);
        qq.add(2);
        qq.add(3);

        while (!qq.isEmpty()) {

            System.out.println(qq.peek());
            qq.remove();

        }
    }

}
