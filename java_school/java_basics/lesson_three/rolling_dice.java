//

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
}
