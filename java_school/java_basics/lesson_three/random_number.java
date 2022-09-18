// using math.random

// random number between 0 and (almost 1)
double randomNumber = Math.random();

// change range to 0 to (almost) 10
randomNumber = randomNumber * 10;

// cast to integer (ignore decimal part)
// ex. 9.985 becomes 9
int randomInt = (int) randomNumber;
