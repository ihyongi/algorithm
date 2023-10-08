package fastcampus.class01;

import java.util.ArrayList;


public class MyStack_8<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1); /**맨마지막값 리턴!!*/
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack_8<Integer> ms = new MyStack_8<Integer>();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop());
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }
}
