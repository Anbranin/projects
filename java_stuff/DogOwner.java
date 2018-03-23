// DogOwner.java
// Christopher Harris 2/18/17 chharris@umass.edu

import java.util.Random;

// states class DogOwner
public class DogOwner
{
  // declares 3 private variables
  private String name;
  private int remainingDogFood;
  private Dog dog;
  
  // constructor for DogOwner
  public DogOwner() 
  {  
    // initializes variables
    int max = 50;
    int min = 10;
    //creates a random class method
    Random generator = new Random(); 
    remainingDogFood = generator.nextInt((max - min) + 1) + min;
    //generates a pseudorandom int within a range
    name = "Suzy";
    dog = new Dog();
    dog.setName("Fido");
  }
  
  // get and set methods for name
   public void setName(String name) 
   {
    name = name;
  } 
  public String getName() 
  {
    return name;
  }
  
  // set and get methods for remaining dog food
   public void setRemainingDogfood(int remainingDogfood) 
   {
     remainingDogFood = remainingDogFood;
   }
  public int getRemainingDogfood() 
  {
    return remainingDogFood;
  }
  
  // set and get methods for dog speed
  public void setDogSpeed(int speed)
  {
    dog.setSpeed(speed);
  }
  public int getDogSpeed()
  {
    return dog.getSpeed();
  }
  
 // set and get methods for dog loudness
  public void setDogLoudness(double loudness)
  {
    dog.setLoudness(loudness);
  }
  public double getDogLoudness()
  {
    return dog.getLoudness();
  }
  
  // set and get methods for dogname
  public void setDogName(String name)
  {
    dog.setName(name);
  }
  public String getDogName()
  {
    return dog.getName();
  }
  
  // method to print dog food and decrease the amount
  public void feedDog() 
  {
    remainingDogFood = remainingDogFood - 1;
    System.out.println(dog.getName() + " has been fed!");
  }
  
  // method to print variables of the dog owner
  public void printVariables()
  {
    System.out.println("Owner's Name: " + name);
    System.out.println("Dog Food Remaining: " + remainingDogFood);
    System.out.println("Dog's Name: " + dog.getName());
    System.out.println("Dog's Speed: " + dog.getLoudness());
    System.out.println("Dog's Loudness: " + dog.getSpeed());
  }
  
  //*****************************************************************************
  // main method for testing the class
  public static void main(String[] args)
  {

    DogOwner Suzy = new DogOwner(); // instantiates a dog owner object
    Suzy.feedDog(); // run the feedDog method
    Suzy.printVariables(); // run method that prints DogOwner variables
  }
}
