//Define characteristics of the human class
//Contstructor provides a way to construct objects
//Constructor method always has the same name as a class
public class Human {
//Classes contains instructions for how objects can be created as well as how objects carry out certain behavior
  
  String name;
  int age;
  int heightInInches;
  String eyeColor;

  //Constructor method
  //Special method for creating or "birthing" humans. i.e Contstructing humans.
  //Doesn't need a return type. We call this within another java file to reference it for the construction of Human
  public Human(){
     
  }

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
