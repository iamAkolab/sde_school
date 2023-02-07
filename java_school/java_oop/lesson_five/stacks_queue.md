# Stacks
The Stack collection represents a last-in-first-out (LIFO) stack of objects.
It means that the last item added (pushed) to a stack is the first item removed (popped) from that stack.
Just like a stack of plates: The last plate I add on will always be the first plate I take off.

The Stack class includes these five methods:

* push(E item): Adds an item onto the top of this stack
* pop(): Removes the object at the top of this stack and returns that object
* peek(): Returns the object at the top without removing it from the stack.
* empty(): Checks if this stack is empty.
* search(Object o): Searches for an object in this stack and returns its position.
* 
Just like the ArrayList, the Stack also internally uses an array that stores everything in order.

An example of when a stack is useful would be when developing something like an email system: 
Once the email server receives a new email it should add this email to the top of the stack of emails 
so that the user will read the latest email first!

Here's a simple example of how to use a Stack:
```
Stack newsFeed = new Stack();
newsFeed.push("Morning news");
newsFeed.push("Afternoon news");
newsFeed.push("Evening news");
String breakingNews = (String) newsFeed.pop();
System.out.println(breakingNews);
```

```
String moreNews =  (String) newsFeed.pop();
System.out.println(moreNews);
```
