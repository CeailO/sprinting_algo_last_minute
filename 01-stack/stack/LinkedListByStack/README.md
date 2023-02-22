# Dynamic Array Stack

![](stack_impl_using_linkedlist.png "")

### Performance

Let n be the number of elements in the stack. Complexities are represented as:

| Type                                               | Complexity         |
| -------------------------------------------------- | ------------------ |
| Space Complexity (for n push operations)           | **O(n)**           |
| Time Complexity of stack creation: DynArrayStack() | **O(1)**           |
| Time Complexity of push()                          | **O(1) (average)** |
| Time Complexity of pop()                           | **O(1)**           |
| Time Complexity of top()                           | **O(1)**           |
| Time Complexity of isEmpty()                       | **O(1)**           |
| Time Complexity of deleteStack()                   | **O(n)**           |

### Comparisons

| Pure Dynamic Array                                                                           | Linked List                                                     |
| -------------------------------------------------------------------------------------------- | --------------------------------------------------------------- |
| Operation at constant time                                                                   | Operation at constant time O(1)                                 |
| Expensive doubling occurs                                                                    | Grows and shrink                                                |
| Sequence of n operation from empty stack - "amortized" is a factor of time proportional to n | Extra allocation of space and time when dealing with references |
