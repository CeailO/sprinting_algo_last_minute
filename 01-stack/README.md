# Stack

Abstract Data Type

`1. Fixed Array Stack`
`2. Dynamic Array Stack`
`3. Linked List Stack`
`4. Array List Stack`
`5. Generic Stack`

### Concept

1. Elements inserted - **PUSH**
2. Elements removed - **POP**
3. Popping empty stack - **UNDERFLOW**
4. Pushing full stack - **OVERFLOW**

### Push Operation Steps

```
Step 1: Check if stack is full
Step 2: if stack full, produce error and exit programs
Step 3: If stack not full, increment top to a point next empty space
Step 4: Add element to the space location, where top pointed out
Step 5: Return success
```

### Auxillary Stack Operations

- int **top()** : Return the last inserted element
- int **size()** : Return the number of elements stored in the stack
- int **isEmpty()** : Indicates any element exist in the stack
- int **isFull()** : Indicates the stack is full of elements
