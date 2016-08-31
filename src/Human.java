//Define characteristics of the human class
//Contstructor provides a way to construct objects
//Constructor method always has the same name as a class
public class Human {
//Classes contains instructions for how objects can be created as well as how objects carry out certain behavior
  
  String name;
  int age;
  int heightInInches;
  String eyeColor;

//when we do it this way, we're making the constructor method more dynamic as opposed to hardcoding the values.
//We're expecting the caller of the Human constructor method to insert these values.
  public Human(String name, int age, int heightInInches, String eyeColor) {
    super();
    this.name = name;
    this.age = age;
    this.heightInInches = heightInInches;
    this.eyeColor = eyeColor;
  }

  //Constructor method
  //Special method for creating or "birthing" humans. i.e Contstructing humans.
  //Doesn't need a return type. We call this within another java file to reference it for the construction of Human
//  public Human(){
//    age = 12;
//    eyeColor = "brown";
//    heightInInches = 73;
//    name = "Joe Delarose";
//  }

//Instructions for how humans will behave.
  public void speak(){
    System.out.println("Hello, my name is " + name);
    System.out.println("I am " + heightInInches + " inches tall");
    System.out.println("I am " + age + " years old");
    System.out.println("My eye color is " + eyeColor);
  }

  public void eat(){
    System.out.println("eating..."); 
  }

  public void walk(){
    System.out.println("walking...");  
  }

  public void work(){
    System.out.println("working...");
  }
}
