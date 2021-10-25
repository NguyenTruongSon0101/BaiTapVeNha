package TrenLop;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(6);
        queue.add(9);
        queue.add(4);

        System.out.println(queue);

        int phanTuLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra: "+phanTuLayRa);

        int phanTuDuocTham = queue.peek();
        System.out.println("Phần tử được thăm: "+phanTuDuocTham);

        System.out.println("Các phần tử có trong queue");
        System.out.println(queue);
    }
}
