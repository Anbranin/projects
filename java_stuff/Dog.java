// Dog.java
// Christopher Harris 2/18/17 chharris@umass.edu

// imports the Random class in the util package
import java.util.Random;

// states the class
public class Dog
{
  // declaring pirvate variables
  private int speed;
  private double loudness;
  private String name;

  // constructor
  public Dog()
  { 
    // initializes variables, giving them a value
    Random generator = new Random();
    this.speed = generator.nextInt(10); 
    this.loudness = generator.nextDouble();
    this.name = "Rex";
  }
  
// getter and setter for speed
  public void setSpeed(int speed)
  {
    this.speed = speed;
  }
  public int getSpeed()
  {
    return speed;
  }
  // getter and setter for loudness
  public void setLoudness(double loudness)
  {
    this.loudness = loudness;
  }
  
  public double getLoudness()
  {
    return loudness;
  }
  
  // getter and setter for name
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return name;
  }
  
  // method for printing out this class' variables
  public void printVariables()
  {
    System.out.println("Dog's Name: " + name);
    System.out.println("Dog's Speed: " + speed);
    System.out.println("Dog's Loudness: " + loudness);
  }
  //*************************************************************
  // main method for testing this class
  // prints Rex's attributes
  public static void main(String[] args)
  {
    // instantiates a dog
    Dog dog_1 = new Dog();
    dog_1.printVariables(); // prints the dog's variables
  }
}
