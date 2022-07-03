package Queue_P;

import java.util.Stack;

public class Queue_2Stack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void push(int data) {
        s1.push(data);
        pop();
    }

    static int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }


        int ans = s2.pop();


        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        System.out.println(ans);
        return ans;

    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);


    }

}
