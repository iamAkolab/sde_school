boolean action =  true;
boolean romance = true;
boolean horror = true;
boolean comedy = true;

if(action && romance) {
  
  // includes action and romance
  System.out.println("This movie includes actiona and romance.");
  if(comdey || horror) { 
  
    // everyone's preference have been met!
    System.out.println("This also includes comedy or horror!");
  }
}
