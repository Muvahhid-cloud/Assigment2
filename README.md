# Assigment 2 

##  Overview

This project implements custom data structures in Java **without using `java.util.*`** (except `Iterator`). The main goal was to 
create low-level versions of `ArrayList`, `LinkedList`, `Stack`, `Queue`, and `MinHeap`, and test their behavior and performance.

### Technologies Used
- Java (Generics, Interfaces, Iterators)
- No external libraries (completely manual implementation)

---

## Implemented Classes

### 1. **MyList<T>** – Interface
Defines all necessary operations such as `add`, `remove`, `get`, `sort`, `toArray`, etc.

### 2. **MyArrayList<T>**
Custom array-based implementation of `MyList<T>`:
- Resizable array
- Supports random access
- Sort via Bubble Sort

### 3. **MyLinkedList<T>**
Doubly-linked list implementation of `MyList<T>`:
- Uses custom Node class with `prev` and `next`
- Efficient insertion/removal at both ends

### 4. **MyStack<T>**
- Backed by `MyArrayList`
- LIFO structure (Last-In-First-Out)
- Operations: `push`, `pop`, `peek`

### 5. **MyQueue<T>**
- Backed by `MyLinkedList`
- FIFO structure (First-In-First-Out)
- Operations: `enqueue`, `dequeue`, `peek`

### 6. **MyMinHeap<T extends Comparable<T>)**
- Array-based binary min-heap
- `insert`, `extractMin`, `peekMin`
- Maintains min-heap property via `heapifyUp()` and `heapifyDown()`

---

## Testing

Each data structure is thoroughly tested via its corresponding test class:
- `MyArrayListTest`
- `MyLinkedListTest`
- `MyStackTest`
- `MyQueueTest`
- `MyMinHeapTest`

Each test checks:
- Edge cases (empty list, out-of-bounds)
- Core logic
- Size consistency
- Iterator usage
---
