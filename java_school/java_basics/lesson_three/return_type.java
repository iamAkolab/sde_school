/// the return parameter must be specified after the class access declaration ///

public String admission(double height){
  String passText;
  if(height > 120) {
    passText = "You pass the height requirements.";
  } else {
    passText = " Sorry, you do not pass.";
  } return passText
}

public double makeChange(double itemCost, double dollarsProvided) {
  double change = dollarsProvided - itemCost;
  return change;
}
