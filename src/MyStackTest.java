public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        System.out.println("=== Testing Push ===");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        System.out.println("=== Testing Peek ===");
        System.out.println("Peek: " + stack.peek());

        System.out.println("=== Testing Pop ===");
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack);

        System.out.println("=== Testing Size and Empty ===");
        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty? " + stack.isEmpty());

        System.out.println("=== Testing Clear ===");
        stack.clear();
        System.out.println("Is Empty after clear? " + stack.isEmpty());
    }
}
