package lec6;

import java.util.*;

/**
 * Таймер зворотнього відліку на основі Queue.
 * Час передається як параметр командного рядка
 */
public class ex5_1 {
    public static void main(String[] args) throws InterruptedException {

        int time = Integer.parseInt (args [0]);
        Queue <Integer> queue = new LinkedList<Integer>();

        for (int i = time; i>= 0; i--)
            queue.offer (i);

        while (!queue.isEmpty ()) {
            System.out.println(queue.poll());
            Thread.sleep(1000);
        }

    }
}