package fastcampus;

import java.util.ArrayList;

public class MyQueue4<T> {
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(){
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        MyQueue4<Integer> mq = new MyQueue4<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
