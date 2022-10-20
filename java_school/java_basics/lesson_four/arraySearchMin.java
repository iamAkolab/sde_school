/**
** Searches an array of speed for the fastest(smallest) value.
** @param speed array of speeds
** @return double with the fastest speed found
*/

public double search(double[] speed) {
  int size = speed.length;
  double min = speed[0];
  for(int i= 1; i < size; i++){
    if(speed[i] < min){
      min = speed[i];
    }
  }
}

// find the longest Name
names [] = ["Anja", "Kimberli", "Edmond", "Shenna", "Apolonia", "Caroll", "Heike"]

public Strinf findlingLongestNmae(String [] names) {
  int size = names.length;
  String longestName = names[0];
  for(int i= 1; i < size; i++){
    if(names[i].length() > longestName.lenght()){
      longestName = names[i];
    }
  }
  return longestName;
}
