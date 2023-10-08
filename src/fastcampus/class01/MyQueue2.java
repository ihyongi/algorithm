package fastcampus.class01;

import java.util.ArrayList;

public class MyQueue2<T> {

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue2<Integer> mq = new MyQueue2<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
//        System.out.println(mq.dequeue());
    }
}
