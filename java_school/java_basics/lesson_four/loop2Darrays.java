public static double englishAverage(int [][] grades) {
  int total = 0;
  
  for(int i= 1; i < 5; i++){
    total += grades[1][i];
  }
  double average = total/5.0;
  return average;
}

// modified
public static double studentAverage(int [][] grades, int student) {
  int total = 0;
  inst subjects = grades.length;
  
  for(int i= 1; i < subjects; i++){
    total += grades[1][students];
  }
  double average = total/(double)subjects;
  return average;
}
