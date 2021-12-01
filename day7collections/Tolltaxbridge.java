import java.util.*;
public class Tolltaxbridge {
    public static void main(String[] args) {
        ArrayDeque<String> dqueue=new ArrayDeque<>();
        dqueue.add("car");
        dqueue.add("bike");
        dqueue.add("truck");
        dqueue.addFirst("bus");
        dqueue.addLast("Bike");
        System.out.println(dqueue);
        dqueue.pollFirst();
        System.out.println(dqueue);


    }
}
