import java.util.LinkedList;

public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList();
        ll.add("Music1");
        ll.add("Music2");
        ll.add("Music3");
        ll.add("Music4");
        ll.add("Music5");
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);


    }
