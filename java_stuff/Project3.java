//project3.java

public class Project3 {
  
  public static void main(String[] args) {
    UseArray theArray = new UseArray(5);
    theArray.readValues();
    theArray.findAverage();
    theArray.findDifference();
    theArray.printValues();
    System.out.println(theArray.findAverage());
    System.out.println(theArray.findDifference());
  }
}
