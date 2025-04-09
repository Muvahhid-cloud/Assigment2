public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T item) {
        list.addLast(item); // top of the stack
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack (top -> bottom): ");
        Object[] arr = list.toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
}
