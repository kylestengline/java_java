
public class Earth {
//This method is the entry point for all java apps
//Code is executed sequentially within this method
  public static void main(String args[]){
  
    //these values are able to be called because it references the Human constructor method within Human.java
    Human human1 = new Human("Tom", 25, 76, "Blue");
    Human human2 = new Human("Jerry", 75, 24, "Red");

    human1.speak();
    human2.speak();

//New is used when calling the constructor method when creating a new object. Assigning the Human variable as tom and assigning that variable a new Human object
//Our object is called tom
//Tom is more so a variable and is not an object until we call new on it. More so an instance variable
//    Human tom;
    
//Assigning tom the object Human
//New keyword is used to call the constructor method when creating a new object
//    tom = new Human();
//    tom.age = 5;
//    tom.eyeColor = "brown";
//    tom.heightInInches = 73;
//    tom.name = "Tom Hammond";
    
//invoking methods on tom
//    tom.speak();

    //one-liner for calling the constructor method
//    Human joe = new Human();

//    joe.age = 12;
//    joe.eyeColor = "brown";
//    joe.heightInInches = 73;
//    joe.name = "Joe Delarose";

 //   joe.speak();

  }
}
