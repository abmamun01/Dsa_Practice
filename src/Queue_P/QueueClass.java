package Queue_P;

public class QueueClass {

    static class QueueMy {

        static int arr[];
        static int size;
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
            // Jodi last idx ye amdr rear pouchay jay tahole amdr queue ta vore geche
            if (rear == size - 1) {
                {
                    System.out.println("Full enque");
                    return;
                }

                //Kintu large queue thakle amon ta possible na
                //tai rear ak 1 icrse kore dibo karon increase korar age last
                //element ye point korchilo 1++ korle null element point korbe
//                rear++;
//                arr[rear] = data;

            }
        }


        //Dequeue
        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            /**
             * remove korar jonno [0] idx access korte hoy
             */
            int front = arr[0];
            //sob element age shif kore dibo jate khali front ta vore jay
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


//    public static void main(String[] args) {
//        QueueMy q = new QueueMy();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty()) {
//
//            System.out.println(q.peek(());
//
//        }
//    }


}
