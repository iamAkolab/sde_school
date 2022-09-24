// Basic 6 sides

public int rollDice() {
  // random num between 0 and (almost) 1
  double randomNumber = Math.random();
  
  // change range to 0 to (almost) 6
  randomNumber = randomNumber *6;
  
  // shift range up one
  randomNumber = randomNumber + 1;
  
  // cast to integer (ignore decimal part)
  // ex. 6.998 becomes 6
  int randomInt = (int) randomNumber;
  
  // returm statement
  return randomInt;
}

int roll1 = rollDice();
int roll2 = rollDice();

System.out.println("Roll 1: " + roll1);
System.out.println"Roll 2: " + roll2);


// Improving on the model
public int rollDice(int sides) {
  // random num between 0 and (almost) 1
  double randomNumber = Math.random();
  
  // change range to 0 to (almost) 6
  randomNumber = randomNumber * sides;
  
  // shift range up one
  randomNumber = randomNumber + 1;
  
  // cast to integer (ignore decimal part)
  // ex. 6.998 becomes 6
  int randomInt = (int) randomNumber;
  
  // returm statement
  return randomInt;
}
