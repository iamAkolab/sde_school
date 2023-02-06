```
Static methods
The static keyword can also be used to describe methods, allowing you to simply call the method from the class rather than having to create an object first and then calling the method. Static methods, however, have limited capabilities since it can't access non-static fields in the object anymore.

But before we get too much into static methods, go ahead and try out the static fields yourself.

So when should we declare fields or methods to be static and when should we not?

The short answer is in most cases you would want the variables and methods to belong to a certain object rather than the entire class, which means most of the time you won't declare them as static. However, if you end up creating a class that provides some sort of functionality rather than have a state of its own, then that's a perfect case to use static for almost all of its methods and fields.

For example, remember the Math class that we used to generate random numbers? It turns out that Math is nothing more than a class with a bunch of static methods like random() and others. Because it doesn't really make sense to create an object called math1 and another called math2, all Maths are the same and hence we can simply use the class itself to call its methods directly, and that's why static was a good choice here.
```
