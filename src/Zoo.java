public class Zoo {
  
  public static void main(String args[]) {
    
    Animal animal1 = new Animal("Bird", "blue", 4 ); 
    Animal animal2 = new Animal("Dragon", "red", 25); 
    Animal animal3 = new Animal("T-rex", "brown", 15); 

    animal1.things();
    animal2.things();
    animal3.things();

    animal1.fly();
    animal2.fly();
    animal3.fly();

    animal1.swim();
    animal3.swim();
    animal2.swim();

    animal1.run();
    animal2.run();
    animal3.run();
  }
}
