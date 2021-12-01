/* Let's say you have an integer array and string array. 
write a single method printArray that can print all the 
elements of both arrays in the reverse order. */

import java.util.*;
public class Reversearray {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        l.add("Mango");
        l.add("Banana");
        l.add("Mango");
        l.add("Apple");
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        System.out.println("Before Reversing");
        System.out.println(l.toString());
        System.out.println(d);


        Collections.reverse(l);
        Collections.reverse(d);
        System.out.println("After Reversing");
        System.out.println(l);
        System.out.println(d);
    }
}
