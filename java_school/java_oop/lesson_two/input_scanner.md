## Input Scanner
The most flexible and common way to read an input from a user is by asking them to type in something and wait till they respond.

Just like we've seen how this command will print "Hello World" to the command line as an output:

```
System.out.println("Hello World!");
```

You can also ask the user to type in a message and then your Java program can read it into a variable and use it.
First, to be able to access this class, you have to point your program to the java.util library that includes the Scanner class. 
You do that by typing this at the very top of the file

```
import java.util.Scanner;
```

A Scanner allows the program to read any data type from a particular input, if we create the scanner object like this:
```
Scanner scanner = new Scanner(System.in);
```

Then the scanner will be reading from the System's input (hence System.in) which is basically the command line.
It will continue to read whatever the user is typing until they hit "enter" then the program continues to execute.
Once the scanner object has been created, you can use it to read a String, an integer or an entire line.
Calling the method nextLine() in that scanner object will return a String that contains everything the user has typed in before they hit "enter".

```
scanner.nextLine();
```
