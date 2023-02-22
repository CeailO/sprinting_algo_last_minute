# Stack

Ordered list in which insertions are done at one end (top) and deletion start at the same end (top)

**LIFO** - Last In First Out

Abstract Data Type

`1. Fixed Array Stack`
`2. Dynamic Array Stack`
`3. Linked List Stack`
`4. Array List Stack`
`5. Generic Stack`

### Concept

1. Elements inserted - **PUSH**
2. Elements removed - **POP**
3. _Popping_ empty stack - **UNDERFLOW**
4. _Pushing_ full stack - **OVERFLOW**

### Push Operation Steps

```
Step 1: Check if stack is full
Step 2: if stack full, produce error and exit programs
Step 3: If stack not full, increment top to a point next empty space
Step 4: Add element to the space location, where top pointed out
Step 5: Return success
```

### Pop Operation Steps

```
Step 1: Checks if the stack is empty.
Step 2: If the stack is empty, produces an error and exit.
Step 3: If the stack is not empty, accesses the data element at which top is pointing.
Step 4: Decreases the value of top by 1.
Step 5: Returns success.
```

### Auxillary Stack Operations

- int **top()** : Return the last inserted element
- int **size()** : Return the number of elements stored in the stack
- int **isEmpty()** : Indicates any element exist in the stack
- int **isFull()** : Indicates the stack is full of elements

### Application of Stack

- Balancing arithmetic operations

- Infix-to-postfix conversion

- Page-visited history operations

- Recursion operations
