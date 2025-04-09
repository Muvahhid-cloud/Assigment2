public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();

        System.out.println("=== Testing Add ===");
        list.add(10);
        list.add(20);
        list.add(30);
        printList(list);

        System.out.println("=== Testing Add First & Last ===");
        list.addFirst(5);
        list.addLast(40);
        printList(list);

        System.out.println("=== Testing Add at Index ===");
        list.add(2, 15); // Between 10 and 20
        printList(list);

        System.out.println("=== Testing Get ===");
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("At index 2: " + list.get(2));

        System.out.println("=== Testing Set ===");
        list.set(2, 17);
        printList(list);

        System.out.println("=== Testing Remove ===");
        list.remove(2); // Remove 17
        list.removeFirst();
        list.removeLast();
        printList(list);

        System.out.println("=== Testing Sort ===");
        list.sort();
        printList(list);

        System.out.println("=== Testing Search ===");
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));
        System.out.println("Exists 30? " + list.exists(30));
        System.out.println("Exists 99? " + list.exists(99));

        System.out.println("=== Testing toArray ===");
        Object[] arr = list.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println("=== Testing Clear ===");
        list.clear();
        printList(list);
        System.out.println("Size: " + list.size());
    }

    public static void printList(MyList<?> list) {
        System.out.print("List: ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println("\nSize: " + list.size());
    }
}
