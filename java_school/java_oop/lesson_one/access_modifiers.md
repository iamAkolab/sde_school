# Fields (public vs private)
To label a field as private or public simply add the modifier just before the field type when declaring it:
```
public int score;
private String password;
```
You always have the final call on which fields you'd want to make public vs private, and it always depends on the purpose of the field as well as the overall design of your code.

However, it's strongly recommended in Java to label ALL fields as private:
A better design would be to declare that field as private and then create public methods that return the value of such hidden field (known as getters) as 
well as public methods that provide a way to set or change its value (known as setters)
```
public class Book{
   private String title;
   private String author;
   private boolean isBorrowed;
   public Book(String title, String author){
      this.title = title;
      this.author = author;
   }
   public void borrowBook(){
      isBorrowed = true;
   }
   public void returnBook(){
      isBorrowed = false;
   }
   public boolean isBookBorrowed(){
      return isBorrowed;
   }
}
```
Setting the isBorrowed field as private will prevent you from mistakenly changing its value somewhere in the code, because the only way to change it now is to call either borrowBook() or returnBook() which is much more explicit.

And to be able to read the value of isBorrowed, we've created a getter method called isBookBorrowed() that is public and simply returns the value of isBorrowed

# Summary
* Always try to declare all fields as private
* Create a constructor that accepts those private fields as inputs
* Create a public method that sets each private field, this way you will know when you are changing a field. These methods are called setters
* Create a public method that returns each private field, so you can read the value without mistakingly changing it. These methods are called getters

# Methods (public vs private)
With methods, it's common to have a mix of private and public methods.

The private methods are usually known as helper methods, since they can only be seen and called by the same class, they are usually there to organize your code and keep it simple and more readable.

The public methods are the actual actions that the class can perform and are pretty much what the rest of the program can see and call.

Here's an example of when you'd want to use public methods vs private methods

```
class Person{
   private String userName;
   private String SSN;
   private String getId(){
      return SSN + "-" + userName;
   }
   public String getUserName(){
      return userName;
   }
   public boolean isSamePerson(Person p){
      if(p.getId().equals(this.getId()){
         return true;
      }
      else{
         return false;
      } 
   }
}
```
The class Person has both its fields set to private because if they were public then any other class will be able to change such sensitive information. Setting them to private means that only methods and constructors inside this class can do so!

The method getId() was also set to private so that no other class can know the social security number of any person.

However, we were still able to use that method internally when comparing this person with another person object in the isSamePerson(Person p) method.

This means that any other class can only call getUserName or isSamePerson and will seem as if these are the only 2 methods provided by the class Person

## Public classes
Even classes can be labeled as public or private! And even though you are allowed to label a class as private, it requires you to know about nested classes which is not covered in this course.

So for now, make sure you label all your classes public.

## Summary
To summarize, it's recommended to:

* Set all your classes to public
* Set all your fields to private
* Set any of your methods to public that are considered actions
* Set any of your methods to private that are considered helper methods
