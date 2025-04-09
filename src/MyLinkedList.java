public class MyLinkedList<T> implements MyList<T> {

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        getNode(index).data = item;
    }

    @Override
    public void add(int index, T item) {
        checkIndexForAdd(index);
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node current = getNode(index);
            Node newNode = new Node(item);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        Node newNode = new Node(item);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = head;
        size++;
    }

    @Override
    public void addLast(T item) {
        Node newNode = new Node(item);
        newNode.prev = tail;
        if (tail != null) tail.next = newNode;
        tail = newNode;
        if (head == null) head = tail;
        size++;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        if (head == null) throw new IndexOutOfBoundsException("List is empty");
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) throw new IndexOutOfBoundsException("List is empty");
        return tail.data;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node toRemove = getNode(index);

        if (toRemove.prev != null)
            toRemove.prev.next = toRemove.next;
        else
            head = toRemove.next;

        if (toRemove.next != null)
            toRemove.next.prev = toRemove.prev;
        else
            tail = toRemove.prev;

        size--;
    }

    @Override
    public void removeFirst() {
        if (size == 0) throw new IndexOutOfBoundsException("List is empty");
        remove(0);
    }

    @Override
    public void removeLast() {
        if (size == 0) throw new IndexOutOfBoundsException("List is empty");
        remove(size - 1);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void sort() {
        if (size < 2) return;

        // Convert to array for sorting
        Object[] array = toArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                Comparable<T> a = (Comparable<T>) array[j];
                T b = (T) array[j + 1];
                if (a.compareTo(b) > 0) {
                    Object tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        // Reassign sorted values back into list
        Node current = head;
        for (Object o : array) {
            current.data = (T) o;
            current = current.next;
        }
    }

    @Override
    public int indexOf(Object object) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(object)) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        Node current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.data.equals(object)) return index;
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        Node current = head;
        int i = 0;
        while (current != null) {
            result[i++] = current.data;
            current = current.next;
        }
        return result;
    }

    @Override
    public void clear() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.data = null;
            current.next = null;
            current.prev = null;
            current = next;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            Node current = head;
            public boolean hasNext() {
                return current != null;
            }
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private Node getNode(int index) {
        checkIndex(index);
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }
}
