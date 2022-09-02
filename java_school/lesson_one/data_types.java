int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

// If you don't want others (or yourself) to overwrite existing values, 
// use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
