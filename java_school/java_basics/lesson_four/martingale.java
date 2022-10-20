// double bet every time you loose till you win

public int martingale(){
  int money = 1000;
  int target = 1200;
  int bet = 10;
  while (money > bet) {
    bolean win = play();
    if (win) {
      money += bet;
      bet = 10;
    }
    else {
      money -= bet;
      bet *= 2;
    }
  }
}
