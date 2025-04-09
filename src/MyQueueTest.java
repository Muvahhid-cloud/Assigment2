public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        System.out.println("=== Testing Enqueue ===");
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");
        System.out.println(queue);

        System.out.println("=== Testing Peek ===");
        System.out.println("Front: " + queue.peek());

        System.out.println("=== Testing Dequeue ===");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println(queue);

        System.out.println("=== Testing Size and Empty ===");
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty? " + queue.isEmpty());

        System.out.println("=== Testing Clear ===");
        queue.clear();
        System.out.println("Is Empty after clear? " + queue.isEmpty());
    }
}
