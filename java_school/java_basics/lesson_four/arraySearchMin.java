/**
** Searches an array of speed for the fastest(smallest) value.
** @param speed array of speeds
** @return double with the fastest speed found
*/

public double search(doube[] speed) {
  int size = speed.length;
  double min = speed[0];
  for(int i= 1; i < size; i++){
    if(speed[i] < min){
      min = speed[i];
    }
  }
}
