public class Bird extends Animal {
  //bird is now a child class of animal. The animal is also referred to as the super class
  //bird class is a sub-class, containing sub functionality
  //it inherits the methods from the animal class

  //need this to consrtuct bird. Otherwise, bird does not exist
  public Bird(int age, String gender, int weightInLbs){
    super(age, gender, weightInLbs);
  }
  //in the above we're creating the bird class so that it can be referenced in the animal class
  
  

}
