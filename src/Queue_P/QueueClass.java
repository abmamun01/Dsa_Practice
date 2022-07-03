package Queue_P;

public class QueueClass {

    static class QueueMy {

        static int arr[];
        static int size;
        //surut rear -1 thakbe
        static int rear = -1;


        QueueMy(int n) {
            arr = new int[n];
            this.size = n;
        }


        //Checking if it is Empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        //add Func
        public static void add(int data) {
            //Checking is it full
            // Jodi last idx ye amdr rear pouchay jay tahole amdr queue ta vore geche
            if (rear == size - 1) {
                {
                    System.out.println("Full Queue");
                    return;
                }

            }

            //Kintu large queue thakle amon ta possible na
            //tai rear ak 1 icrse kore dibo karon increase korar age last
            //element ye point korchilo jodi 1 increase kore dei tahole khali jaygay
            // orthat null point korbe to ai null r jaygay new element store kore dibo
            rear++;
            arr[rear] = data;

        }


        //Dequeue -O(n)
        //akahne int return type dichi karon kon element ta remove hocce
        // seta o jate return hoy tahole jante parbo kon element return hocce
        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            /**
             * remove korar jonno [0] idx access korte hoy
             * tai front 0 hobe
             */
            int front = arr[0];
            //sob element age orthat samner r dike shift kore dibo jate khali front ta vore jay
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;

        }


        static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[0];
        }
    }


    public static void main(String[] args) {
        QueueMy qq = new QueueMy(5);
        qq.add(1);
        qq.add(2);
        qq.add(3);

        while (!qq.isEmpty()) {

            System.out.println(qq.peek());
            qq.remove();

        }
    }


}
