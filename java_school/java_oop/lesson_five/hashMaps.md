# Understanding how different data structures work in Java will help you become a great software developer. 
The reason it is important to use the correct data structure for a variable or a collection is: performance.

A single program can be implemented in so many different ways, but only some will run smoothly and fast enough 
that users will want to continue using it.

## For example:
We've seen how to search an ArrayList of Strings for a particular String inside, we know that we need to use a 
loop to compare that String with every other String in the list (even when using the indexOf method, internally 
it will still use a loop to search for your item).

It may not seem to take that long when you try it on your computer, but if that ArrayList contained millions of 
items (a very common list size in Java btw), it will take a noticeable time to find the item you are looking for.

Users usually consider a program "non-responding" if it takes more than 10 seconds to complete an operation! Which 
means if the search itself took that long, no-one will ever use your program again!

# HashMaps
A HashMap is another type of collection that was introduced in Java to speed up the search process in an ArrayList.

In some sense, it's just another collection of items (Strings or Integers or any other Object), 
but the way it stores those items is unique.

HashMaps allow you to store a key for every item you want to add. This key has to be unique for the entire list, 
very much like the index of a typical array, except that this key can be any Object of any Type!

The point is to be able to find an item in this collection instantly (without having to loop through all the items 
inside) and hence save that precious run-time.

Let's have a look at an example:

Consider you have a class called Book that contains every detail about such book:
```
public class Book{
   String title;
   String author;
   int numOfPages;
   int publishedYear;
   int edition;
   String ISBN;
}
```
If you were to create a Library class that will simulate a virtual library of all the books that exist in the world (~130 Million) 
you can easily create an ArrayList of Books, and fill it up with all the book details that you may have

```
public class Library{
   ArrayList<Book> allBooks;
}
```
Now, to search for a book by its ISBN (String) you will need to create a loop to compare the ISBN of each book with the one you are looking for:
```
Book findBookByISBN(String isbn){
   for(Book book : library.allBooks){
      if(book.ISBN.equals(isbn)){
         return book;
      }
   }
}
```
A way more optimal solution is to use a HashMap instead of ArrayLists. To use HashMaps, you will need to import it at the very top of your Java file:
```
import java.util.HashMap;
```
This is how you declare a HashMap:
```
public class Library{
   HashMap<String, Book> allBooks;
}
```
The above declaration means that we are creating a collection of Books with a key of type String.
To initialize this hash map, use the default constructor like so:
```
allBooks = new HashMap<String, Book>();
```
Then, to add items to the HashMap:
```
Book taleOfTwoCities = new Book();
allBooks.put("9781539687399", taleOfTwoCities);
```

To search for a book using its ISBN:

```
Book findBookByISBN(String isbn){
   Book book = allBooks.get(isbn);
   return book;
}
```
The above code will use the String key (ISBN) to find the book instantly in the entire collection of ~130 Million 
books leading to a much better performing Java program
