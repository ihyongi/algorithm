package fastcampus.class01;

import java.util.ArrayList;

public class MyQueue_7<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue_7<Integer> mq = new MyQueue_7<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
