//Project 4

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayActions {
  
  private static int[][] intArray;
  private static double[][] doubleArray;
  private static boolean[][] boolArray = new boolean[5][6];
  private static ArrayList<Double> myArrayList = new ArrayList<Double>();
  private static int lessCount;
  
  //constructor for intArray
  /*public ArrayActions(int[][] intArray) {
    this.intArray = intArray;
  }
  
  //constructor for doubleArray
  public ArrayActions(double[][] doubleArray) {
   this.doubleArray = doubleArray;
  }*/
  
  //this method checks for doubles in the array that are less
  //than a specified double, and records that count to a variable
  public static int CheckDouble(double myDouble, double[][] doubleArray) {
    lessCount = 0;
    for (int i = 0; i < doubleArray.length; i++) {
      for (int j = 0; j < doubleArray[i].length; j++) {
        if (doubleArray[i][j] < myDouble) {
          lessCount++;
        }
      }
    }
          
    
    return lessCount;
  }
  
  //this method creates a new 2d boolean array and takes 2d int and double arrays
  //as parameters.  the elements of each are compared with respect to their x,y values
  //and stores true to the boolean array if double > int and false if double < int
  public static boolean[][] CompareIntDouble(int[][] intArray, double[][] doubleArray) {
    for (int i = 0; i < doubleArray.length; i++) {
      for (int j = 0; j < doubleArray[i].length; j++) {
           if (doubleArray[i][j] > intArray[i][j]) {
            boolArray[i][j] = true;
           }
           else if (doubleArray[i][j] < intArray[i][j]) {
             boolArray[i][j] = false;
           }
      }
    }
    return boolArray;
  }
  
   //this method takes an int and double array as parameters and
  //divides each int element by the corresponding double element,
  //stores them in a new int array and prints
  public static void DivideValues(int[][] intArray, double[][] doubleArray) {
    
    double value;
    int[][] intValues = new int[5][6];
    
    for (int i = 0; i<intArray.length; i++) {
      for (int j = 0; j<intArray[i].length; j++) {
        if (doubleArray[i][j] != 0) {
          value = (double) (intArray[i][j] / doubleArray[i][j]);
          intValues[i][j] = (int) value;
        }
        else if (doubleArray[i][j] == 0) {
          intValues[i][j] = 0;
        }
      }
    }
    
    for ( int i = 0; i < intValues.length; i++) {
      for ( int j = 0; j < intValues[i].length; j++ ) {
        System.out.print(intValues[i][j] + "," + " ");
      }
      System.out.println();
    }
  }
  
  public static void EraseRow(int[][] intArray) {
    int[] myArray = { intArray[0][0], intArray[0][1], intArray[0][2] };
    intArray[0] = myArray;

    for ( int i = 0; i < intArray.length; i++) {
      for ( int j = 0; j < intArray[i].length; j++ ) {
        System.out.print(intArray[i][j] + "," + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
  public static ArrayList AboveAverage(double[][] doubleArray) {
    int count = 0;
    double sum = 0;
    double average = 0;
    
    for ( int i = 0; i < doubleArray.length; i++) {
      for ( int j = 0; j < doubleArray[i].length; j++) {
        sum = (int) (sum + doubleArray[i][j]);
        count++;
      }
    }
    average =  sum / count;
    
    for ( int i = 0; i < doubleArray.length; i++) {
      for ( int j = 0; j < doubleArray[i].length; j++) {
        if ( doubleArray[i][j] > average ) {
          myArrayList.add( doubleArray[i][j] );
        }
        else {
          continue;
        }
      }
    }
    return myArrayList;
  }
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
  
    //declare, initialize and print int[][] intArray
    System.out.println("\n" + "int[][] initialized:");
    int[][] intArray = { 
      { 1, 2, 3, 4, 5, 6 }, 
      { 7, 8, 9, 10, 11, 12 }, 
      { 13, 14, 15, 16, 17, 18 },
      { 19, 20, 21, 22, 23, 24 }, 
      { 25, 26, 27, 28, 29, 30 }
    };
    for ( int i = 0; i < intArray.length; i++) {
      for ( int j = 0; j < intArray[i].length; j++ ) {
        System.out.print(intArray[i][j] + "," + " ");
      }
      System.out.println();
    }
    System.out.println();
    
    //declare, initialize and print double[][] doubleArray
    System.out.println("double[][] initialized:");
    double[][] doubleArray = {
      { 32.001, 33.002, 34.003, 35.004, 36.005, 37.006 },
      { 38.007, 39.008, 40.009, 41.010, 42.011, 43.012 },
      { 44.013, 45.014, 46.015, 47.016, 48.017, 49.018 },
      { 50.019, 51.020, 52.021, 53.022, 54.023, 55.024 },
      { 56.025, 57.026, 58.027, 59.028, 60.029, 61.030 }
    };
    for ( int i = 0; i < doubleArray.length; i++) {
      for ( int j = 0; j < doubleArray[i].length; j++ ) {
        System.out.print( doubleArray[i][j] + "," + " ");
      }
      System.out.println();
    }
    
    //call method CheckDouble, scan in the double parameter to check array
    //elements against and print the result
    System.out.println("\n"+"Enter a double for CheckDouble method");
    CheckDouble(scan.nextDouble(), doubleArray);
    System.out.println("# of elements that are < the double you entered: " + lessCount);
    System.out.println();
    
    //pass intArray and doubleArray to CompareIntDouble()
    //and print the resultion boolean[][]
    System.out.println("CompareIntDouble() values:");
    CompareIntDouble(intArray, doubleArray);
      for ( int i = 0; i < boolArray.length; i++) {
        for ( int j = 0; j < boolArray[i].length; j++ ) {
          System.out.print( boolArray[i][j] + "," + " ");
        }
        System.out.println();
      }
    System.out.println();
    
    //pass 2 array parameters to method
    //method prints the array internally with a for loop
    System.out.println("DivideValues() values:");
    DivideValues(intArray, doubleArray);
    System.out.println();
    
    System.out.println("EraseRow() values:");
    EraseRow(intArray);
    
    //passes the double[][] to AboveAverage method by adding all of
    //the double[][]'s elements and dividing by # of elements.  while
    //loop is used to print the array list
    System.out.println("AboveAverage() values:");
    AboveAverage(doubleArray);
    int index = 0;
    while ( index < myArrayList.size() ) {
      System.out.println(myArrayList.get(index));
      index++;
      
      
    }
  }
}