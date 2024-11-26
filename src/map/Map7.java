package map;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Map7 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.getFirst());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.peek());
        System.out.println(queue.remove());


    }
}
