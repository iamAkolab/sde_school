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
