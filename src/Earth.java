
public class Earth {
//This method is the entry point for all java apps
//Code is executed sequentially within this method
  public static void main(String args[]){
  
//New is used when calling the constructor method when creating a new object. Assigning the Human variable as tom and assigning that variable a new Human object
//Our object is called tom
    Human tom;
    
//Assigning tom the object Human
//New keyword is used to call the constructor method when creating a new object
    tom = new Human();
    tom.age = 5;
    tom.eyeColor = "brown";
    tom.heightInInches = 73;
    tom.name = "Tom Hammond";
    
//invoking methods on tom
    tom.speak();
    tom.walk();
    tom.work();
    tom.eat();

  }
}
