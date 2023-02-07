# Lesson 5 Collections

## Java Arrays
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets.

```
String[] names = new String[10];
names[0] = "Trisha"
names[1] = "James"
names[2] = "Will"
```

### Limitations
* You need to know the number of elements you want to use in the array while initializing it
* Once you initialize an array with a specific number, You are not allowed to add or remove any cell.
* When you remove item from a cell, it leaves a weird gap in the structure as it doesn't update the indices

# Collections
Collections are bunch of classes and interafaces java allows you to use to simplify you dealing with mulitiple
items of the same type. They include List, Stack, Map and Queue.

## Lists
A List in Java is an interface that behaves very similarly to an array

* It's an ordered collection (also known as a sequence).
* The user of this interface has precise control over where each item is inserted in the list.
* The user can access items by their integer index (position in the list).
* The user can search for items in the list by looping over the items in it.


## ArrayList
This is the most common class that implements the List interface uses an Array internally. 
It allows you initialize this collection variable names, without specifying the number of items in it.
An ArrayList is a class that implements the interface List. It's simply a wrapper around an array, 
but provides really powerful methods that make dealing with the array much simpler.

Note: An item in an ArrayList is known as an element

Let's have a look at some of the ArrayList's methods:

* add(E element): Appends the specified element to the end of this list.
* add(int index, E element): Appends the specified element to the specified index of this list.
* get(int index): Returns the element at the specified position in this list.
* contains(Object o): Returns true if this list contains the specified element.
* remove(int index): Removes the element at the specified position in this list.
* size(): Returns the number of elements in the list.

To create and initialize an ArrayList:

```
ArrayList names = new ArrayList();
names.add("Arya")
names.add("Tim")
names.add("Luke")
names.add("Tessa")

names.remove("Tim")
```
Remove will remove the items as well as take care of the indices.
