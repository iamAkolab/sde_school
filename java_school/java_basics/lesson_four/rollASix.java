/** 
* Rolss a dice till you get a 6 then you win 
* but if you get a 3 you lose
*/

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
public boolean rollASix() {
  int dice = rollDice();
  while(dice != 6) {
    dice = rollDice();
    if(dice == 3)
      break;
  }
  if(dice ==6)
    return true;
  else
    return false;

}
