import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add("Fever");
        pq.add("Cough");
        pq.add("heartattack");
        pq.add("heartattack");
        pq.add("cold");
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);


    }




}
