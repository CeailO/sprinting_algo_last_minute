# Queue

Ordered list in which insertions are done at one end (rear) and deletion at another end (front)

**FIFO** - First In First Out

### Concept

1. Elements inserted - **ENQUEUE**
2. Elements removed - **DEQUEUE**
3. _DeQueuing_ empty stack - **UNDERFLOW**
4. _EnQueuing_ full stack - **OVERFLOW**

### EnQueue Operation Steps

```
Step 1: Check if the queue is full.
Step 2: If the queue is full, produce overflow error and exit.
Step 3: If the queue is not full, increment a rear pointer to point the next empty space.
Step 4: Add data element to the queue location, where the rear is pointing.
Step 5: return success.
```

### DeQueue Operation Steps

```
Step 1: Check if the queue is empty.
Step 2: If the queue is empty, produce underflow error and exit.
Step 3: If the queue is not empty, access the data where the front is pointing.
Step 4: Increment front pointer to point to the next available data element.
Step 5: Return success.
```

### Auxillary Queue Operations

- **enqueue()** : add (store) an item to the queue.
- **dequeue()**: remove (access) an item from the queue.
- **peek()** - Gets the element at the front of the queue without removing it.
- **isEmpty()** : Check if queue is empty
- **isFull()** : Check if queue is full

### Application of Queue

- Operating systems schedule jobs (with equal priority) at arrival orders.

- First come first serve booth queue

- Multiprograming queue like asynchronous queue

- Asynchronous data transfer (file IO, pipe, socket, etc)
