# Generics
In a nutshell, Generics enable classes to accept parameters when defining them, much like the more familiar parameters used in method declarations.

Defining a type parameter for a class provides a way for you to re-use the same code with different inputs. The difference is that the inputs to 
formal parameters are values, while the inputs to type parameters are types.

## Generics in Collections
For example: ArrayLists use Generics to allow you to specify the data type of the elements you're intending to add into that ArrayList.
The way to do so is by defining that data type between <> when declaring the ArrayList variable:

```
ArrayList<String> listOfStrings = new ArrayList();
```

This is explicitly saying that you want to create an ArrayList of Strings, and hence the compiler will only allow Strings to be inserted into 
this ArrayList and will show you an error if you try to insert something else.

## Generics eliminate the need for casting
Remember how we had to cast the return value of a pop() method when we were using a collection like the Stack earlier?

Well, because of generics you can now specify the datatype of the stack or queue or any collection when declaring it, thus eliminating the need to cast any return types:

The following code snippet without generics requires casting:
```
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);
```
When re-written to use generics, the code does not require casting:
```
List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0);   // no cast
```
