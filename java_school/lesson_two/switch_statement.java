// SWITCH STATEMENT

// Checks he value of a variable and tests it for equality

// If implementation
int passcode = 555;
String coffeeType;

if (passcode == 555) { 
    // espresso passcode
  coffeType = "Espresso"
} else if ( passcode == 312) { 
  // vanilla passcode
  coffeeType = "Vanilla latte";
} else if ( passcode == 629) { 
  // vanilla passcode
  coffeeType = "Drip coffee";
} else { 
  // vanilla passcode
  coffeeType = "Unknown";
}
System.out.println(coffeeType);


/// Switch implementation
int passcode = 555;
String coffeeType;

switch(passcode) {
  case 555: 
    coffeeType = "Espresso";
    break;
  case 312: 
    coffeeType = "Vanilla Latte";
    break;
  case 629: 
    coffeeType = "Drip coffee"
    break;
  default: 
    coffeeType = "Unknown"
    break;
}
System.out.println(coffeeType);
