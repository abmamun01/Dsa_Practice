package Queue_P;

public class Circular_Queue {

    static class QueueMy {

        static int arr[];
        static int size;
        //surut rear -1 thakbe
        static int rear = -1;
        static int front = -1;

        QueueMy(int n) {
            arr = new int[n];
            this.size = n;
        }


        //Checking if it is Empty
        //Changes jokhon rear o front 2ta e khali hobw
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        //checking is full
        static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add Func
        public static void add(int data) {
            //Checking is it full
            // Jodi last idx ye amdr rear pouchay jay tahole amdr queue ta vore geche
            //** Changes
            if (isFull()) {
                {
                    System.out.println("Full Queue");
                    return;
                }

            }

            //Kintu large queue thakle amon ta possible na
            //tai rear ak 1 icrse kore dibo karon increase korar age last
            //element ye point korchilo jodi 1 increase kore dei tahole khali jaygay
            // orthat null point korbe to ai null r jaygay new element store kore dibo

            //**Changes - jodi full na hoy tahole "rear" ke increament kore -1 theke 0 banaichi
            //** Front k o increase korte korte karon front r jaygay rear replace korchi
            //**1st element add
            if (front == -1) {

            }
            rear = (rear + 1) % size;
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
            //**Changes
            int result = arr[front];
            //** jodi single element thake
            if (result == front) {
                rear = front = -1;
            } else {
                //** ata tokhon e kaj korbe jokhon amdr front last idx
                // ye thakbe take increase by 1 kore 0 te niye asbo
                front = (front + 1) % size;
            }


            return result;

        }


        static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[front];
        }
    }


    public static void main(String[] args) {
        QueueClass.QueueMy qq = new QueueClass.QueueMy(5);
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);


        System.out.println(qq.remove());
        qq.add(6);
        System.out.println(qq.remove());
        qq.add(7);

        while (!qq.isEmpty()) {

            System.out.println(qq.peek());
            qq.remove();

        }
    }


}
