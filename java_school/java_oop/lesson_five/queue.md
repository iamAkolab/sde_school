# Queue
Another very common collection type used in Java is the Queue. As the name suggests it resembles the queue or line of people one after the other.
Unlike the stack, it's a First-In-First-Out (FIFO) data type where the first element added to the queue is the first element to be accessed or removed.

The Queue is only an Interface and not a Class by itself, however, it defines 2 important methods for all classes that do implement the Queue interface.

* add(E element): Inserts the specified element into this queue
* poll(): Retrieves and removes the head of this queue


A special type of Queues is known as Deque which is a double-ended queue. Meaning that you can add or remove elements from either end of a Deque (Front or End).

Along with the 2 Queue methods, a Deque also offers these methods:

* addFirst(E element): Inserts the specified element at the front of this deque
* addLast(E element): Inserts the specified element at the end of this deque
* pollFirst(): Retrieves and removes the first element of this deque
* pollLast(): Retrieves and removes the last element of this deque


Java also provides a few classes that implement the Queue Interface, perhaps the most popular of all is the LinkedList
Here's an example on how to create and use a LinkedList object:

```
Queue orders = new LinkedList();
orders.add("Order1");
orders.add("Order2");
orders.add("Order3");
System.out.print(orders.poll());
System.out.print(orders.poll());
System.out.print(orders.poll());
```
