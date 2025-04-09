public class MyMinHeapTest {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        System.out.println("=== Inserting ===");
        heap.insert(40);
        heap.insert(20);
        heap.insert(10);
        heap.insert(50);
        heap.insert(30);
        System.out.println(heap);

        System.out.println("=== Peek Min ===");
        System.out.println("Min: " + heap.peekMin());

        System.out.println("=== Extract Min ===");
        System.out.println("Extracted: " + heap.extractMin());
        System.out.println("After Extraction: " + heap);

        System.out.println("=== Size and Empty ===");
        System.out.println("Size: " + heap.size());
        System.out.println("Is Empty? " + heap.isEmpty());

        System.out.println("=== Clear Heap ===");
        heap.clear();
        System.out.println("Is Empty after clear? " + heap.isEmpty());
    }
}
