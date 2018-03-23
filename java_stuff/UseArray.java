//usearray.java

import java.util.*;
import java.util.stream.*;

public class UseArray {
  
  private int[] myArray;
  
  public UseArray(int x) {// constructor
    myArray = new int[x];
  }
     

  public void readValues() {                       //method to scan ints and store to array
    int j;
    int i;  
    Scanner scan = new Scanner(System.in);
      for ( i = 0; i < myArray.length; ) {          //for loop cycles thru each array element
        System.out.println("Enter an integer");
        j = scan.nextInt();                         //assigns next int enetered by user to a variable
       
        if (j >= 3 && j % 3 == 0 && j % 2 != 0 && j != 999) {// conditions for odd multiples of 3 except 999
          myArray[i] = j; // sets the element we have cycled to in the for loop to the user entered mult of 3
          i++;            // back to top of for loop, advances to next array element
        }
        else if ( j <= 2 || j % 2 == 0 || j % 3 != 0 && j != 999) {//condition for all other entered #s but 999
          System.out.println("Invalid please re-enter");// nothing is entered to array, we stay on same element
        }                                            // back to beginning of for loop on the same array element
        else if ( j == 999 && i == 0 ) {            // condition for users enters 999 to element myArray[0]
          System.out.println("Error. Please restart the Array");
        }
        else if ( j == 999 && i != 0) {             //condition for 999 being entered anytime after element 0
          break;                                    //forces the loop to conclude
        }
      }
      System.out.println(Arrays.toString(myArray));
  }

  public double findAverage() {                     //method that finds average of all array values
    int i;
    int count = 0;
    for ( i = 0; i<myArray.length; i++) {          //cycles thru elements to find # of valid entries
      if (myArray[i] != 0) {
        count++;
      }
    }
                                                                   //steam method gets total of all entries
    double average = (double) IntStream.of(myArray).sum() / count; //cast double to average calculation
    return average;                                                //return the average to constructor
  }
  
  public int findDifference() {        //method to find the difference between max and min values in array
    int difference;
    int max = Arrays.stream(myArray).max().getAsInt();  //this stream method finds the max value
    
    int min = myArray[0];
    for ( int i = 0; i < myArray.length; i++ ) {
      if ( myArray[i] < min && myArray[i] != 0) {    //finds the min value that isn't 0 if 999 was entered
        min = myArray[i];
      }
      
    }
    difference = max - min;
    return difference;                                 //returns the difference to constructor
    }
  
  public void printValues() {                         //method to print array values backwards
    for (int i = myArray.length - 1; i >= 0; i--) {   //excluding 0 values if 999 has been entered
      if (myArray[i] != 0){
      }
    }
  }
}
