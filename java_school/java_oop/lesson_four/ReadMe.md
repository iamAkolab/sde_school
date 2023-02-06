# Lesson Inheritance

## Encapsulation
Each class is just like a capsule that contains everything it needs and nothing more

## Polymorphism
Multiple shapes or forms. Java objects can have multiple Identities

## Inheritance
Passing down traits or characteristics from a parent to their child

### Super
It is important to note that once you override a method, you basically ignore everything that was in the parent class and instead have your own custom implementation in the child class (literally overwriting it)!

In our case, we don't want to throw away the parent implementation. We actually want to continue to use the original method, and ADD the extra checks for each child class individually.

This is where we get to use the "super" keyword!

You are allowed to re-use the parent method in the child class by using the "super" keyword, followed by a dot and then the method name:

```
super.isValidMove(position);
```

Which means in each of the child classes, before you get to check the custom movement, you can check if super.isValidMove(position) has returned false. If so, then no need to do any more checks and immediately return false; otherwise, continue checking.

```
lass Rock extends Piece{
   boolean isValidMove(Position newPosition){
      // First call the parent's method to check for the board bounds
      if(!super.isValidMove(position)){
         return false;
      }
      // If we passed the first test then check for the specific rock movement
      if(newPosition.column == this.column && newPosition.row == this.row){
         return true;
      }
      else{
         return false;
      }
   }
}
```

You can also use super() to call the parent's constructor. This is usually done when implementing the child's constructor. Typically you would want to first run everything in the parent's constructor then add more code in the child's constructor:

```
class Rock extends Piece{
   // default constructor
   public Rock(){
      super(); // this will call the parent's constructor
      this.name = "rock";
   }
   ```  

Note: If a child's constructor does not explicitly call the parent's constructor using super, the Java compiler automatically inserts a call to the default constructor of the parent class. If the parent class does not have a default constructor, you will get a compile-time error.

## Multiple Inheritance
Extending a class is extremely helpful in many occasions:

Extending the capability of a class without making any changes to it.
Sharing some common code between variations of that class.
Leveraging polymorphism to treat different classes as if they were the same.
However, there is 1 major limitation in Java: A class cannot extend more than 1 class (i.e. multiple inheritance is not allowed in Java).

Why? Because multiple inheritance could cause ambiguity if the parents had similar methods.

# Interface
An interface is a reference type in Java. It is similar to class.
An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
Think of a caravan. Half House Half Car. We can define a mobavle part anf the habitatble part

### Summary
* Interfaces define what a class should do but not how to do it.
* Creating an interface is very similar to creating a class
* An interface's sole purpose is to be implemented by one or more classes
* You cannot create an instance (Object) from an interface
* It's not reducing code repetition it's more about enforcing a good design.
