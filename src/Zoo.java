public class Zoo {
  
  //Here is where we call the methods after creating our objects.
  public static void main(String[] args) {
    
    Animal animal1 = new Animal("Bird", "blue", 4 ); 
    Animal animal2 = new Animal("Dragon", "red", 25); 
    Bird bird = new Bird();

    animal1.things();
    animal2.things();

    bird.fly();

    animal1.fly();
    animal2.fly();

    animal1.swim();
    animal2.swim();

    animal1.run();
    animal2.run();
  }
}
