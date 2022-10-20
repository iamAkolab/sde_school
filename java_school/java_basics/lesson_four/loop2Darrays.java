public static double englishAverage(int [][] grades) {
  int total = 0;
  
  for(int i= 1; i < 5; i++){
    total += grades[1][i];
  }
  double average = total/5.0;
  return average;
}
