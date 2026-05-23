import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(40);

        System.out.println("우선순위 큐에서 꺼내는 순서:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
