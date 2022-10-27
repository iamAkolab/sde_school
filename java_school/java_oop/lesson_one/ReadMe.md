# LESSON 1 The World of Objects

This lesson provides an introduction to object-oriented programming, and also explains how to use classes and objects in Java.

* Fields
* Methoda
* Objects and Classess

## Why Use Objects
* Objects combine variables together to make yor code meaningful.

## Fields
* The fields of an object are all the data variables that make up that object. 
* They are also sometimes referred to as attributes or member variables.
* For example a book object may contain fields like title, author and numberOfPages.
Then a library object may contain a field named books that will store all book objects in an array.

### Accessing fields:
Accessing a field in an object is done using the dot modifier ‘.’

For example, if we had an object called book that contains these fields:

String title;
String author;
int numberOfPages;
To access the title field you would use

book.title

## Methods
Methods in Java are functions that belong to a particular object. When we get to creating our own object types later in this lesson we will be creating methods the same way we used to created functions.

### Calling a method
To use a method you call it (just like calling a function). This is also done using the dot modifier .

Methods, just like any function can also take in arguments. For Example: Assume that our book object has a method called setBookmark that takes the page number as a parameter:

void setBookmark(int pageNum);

Here's a comparison that illustrates when to use which:

| Class	      | Object |
| :---:        | :---: |
| What:		| A Data Type	A Variable |
| Where:		| Has its own file	Scattered around the project |
| Why:		| Defines the structure	Used to implement to logic
| Naming convention:		CamelCase (starts with an upper case)	camelCase | (starts with a lower case) |
| Examples:		Country	| australia |
| Book	| lordOfTheRings | 
| Pokemon	| pikachu |

