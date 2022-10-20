/** 
* Rolss a dice till you get a 6 then you win 
* but if you get a 3 you lose
*/
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
