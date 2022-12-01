// count blocks

public int countBlocks (int levels) {
  int total = 0;
  for (int i = 1; i <= levels; i++){
    total = total + (i*i);
  }
  return total;
}
