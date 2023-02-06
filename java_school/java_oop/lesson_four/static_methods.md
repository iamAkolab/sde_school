# Static Fields
The static keyword can also be used to describe methods, allowing you to simply call the method from the class rather than having to create an object first and then calling the method. Static methods, however, have limited capabilities since it can't access non-static fields in the object anymore.

But before we get too much into static methods, go ahead and try out the static fields yourself.

So when should we declare fields or methods to be static and when should we not?

The short answer is in most cases you would want the variables and methods to belong to a certain object rather than the entire class, which means most of the time you won't declare them as static. However, if you end up creating a class that provides some sort of functionality rather than have a state of its own, then that's a perfect case to use static for almost all of its methods and fields.

For example, remember the Math class that we used to generate random numbers? It turns out that Math is nothing more than a class with a bunch of static methods like random() and others. Because it doesn't really make sense to create an object called math1 and another called math2, all Maths are the same and hence we can simply use the class itself to call its methods directly, and that's why static was a good choice here.

## Static Methods
A static method takes input arguments and returns a result based only on those input values and nothing else.

Not needing any field values makes it easy for a method to be attached to the class definition and not an individual object since it doesn't care about the values of any of the fields.

However, a static method can still access static fields, that's because static fields also belong to the class and are shared amongst all objects of that class.

Here's an example of a calculator implementation with some static methods:

```

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}
```

Since both add and subtract don't need any object-specific values, they can be declared static as seen above and hence you can call them directly using the class name Calculator without the need to create an object variable at all:

```
Calculator.add(5,10);
```
