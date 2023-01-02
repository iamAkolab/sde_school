/*
The main method
This main method is the starting point for any Java program, when a computer runs a Java program, it looks for that main method and runs it.

Inside it you can create objects and call methods to run other parts of your code. And then when the main method ends the program terminates.

If this main method doesn't exist, or if there's more than one, the Java program won't be able to run at all!
*/


public static void main(String [] args){
   // Start my program here
   System.out.println("Hello world!");
}

/* Let's break it down:

public: Means you can run this method from anywhere in your Java program (we will talk more about public and private methods later
static: Means it doesn't need an object to run, which is why the computer starts with this method before even creating any objects (we will also talk more about static methods later on)
void: Means the main method doesn't return anything, it just runs when the program starts, and once it's done the program terminates
main: Is the name of the method
String [] args : Is the input parameter (array of strings) which we will cover how to use it later in this lesson as well!
*/
