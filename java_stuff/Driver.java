// Driver.java
// Christopher Harris 2/18/17 chharris@umass.edu

public class Driver
{ 
  // main method for executing methods
  public static void main(String[] args)
  {
    // instantiates 2 DogOwner objects
    DogOwner dogOwner_1 = new DogOwner();
    DogOwner dogOwner_2 = new DogOwner();
     // sets DogOwner_1's name as a string
    dogOwner_1.setName("George Jackson");
    // sets dogOwner_1's dog name to a string
    dogOwner_1.setDogName("Rover"); 
    // raises the dog's loudness by .1
    dogOwner_1.setDogLoudness(dogOwner_1.getDogLoudness() + .1); 
    // doubles the remaining dog food
    dogOwner_1.setRemainingDogfood(dogOwner_1.getRemainingDogfood() * 2);
    // while loop statement that runs the feedDog method 3 times
    int count = 0; 
      while(count <=2)
      {
      dogOwner_1.feedDog();
      count++;
      }
    dogOwner_1.printVariables(); // prints this dog owner's variables
    // sets dogOwner_2's name to a string
    dogOwner_2.setName("Peter Smithson"); 
    // sets the dog's speed to 5
    dogOwner_2.setDogSpeed(5);
    // sets remaining dog food to 25
    dogOwner_2.setRemainingDogfood(25);
    // while loop statement that runs the feedDog method twice
    int count_b = 0; 
      while(count_b <=1)
      {
      dogOwner_2.feedDog();
      count_b++;
      }
    // prints this dog owner's variables
    dogOwner_2.printVariables();
  }
} 
