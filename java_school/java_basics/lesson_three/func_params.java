// Parameters and Arguments

// single paramter
public void greeting(String location) {
  // greet a specific location
  System.out.println("Hello, " + location);
}

greeting("Salt Lake");


// multiple parameter
public void printPhoto(int width, int height, boolean inColor) {
  System.out.println("Width = " + width + " cm");
  System.out.println("Height = " + height + " cm");
  if(inColor) {
    System.out.println("Print in full color.")
  } else {
    System.out.println("Print in black and white.")
  }
}
printPhoto(30, 40, true);
