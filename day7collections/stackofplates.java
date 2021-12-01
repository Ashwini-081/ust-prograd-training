import java.util.Stack;
public class stackofplates {
    public static void main(String[] args) {
    Stack<String> stack=new Stack<>();
        stack.push("p1");
        stack.push("p1");
        stack.push("p3");
        stack.push("p4");
        stack.push("p5");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();

        System.out.println(stack);



    }
}
