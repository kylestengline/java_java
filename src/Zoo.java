public class Zoo {
  
  //Here is where we call the methods after creating our objects.
  public static void main(String[] args) {
    
    Animal animal1 = new Animal(5,"Male", 4 ); 
    Bird bird = new Bird(3, "F", 10);
    Fish fish = new Fish(6, "F", 13);

    animal1.eat();

    fish.swim();

    bird.fly();

    //the below methods are from the animal class
    //we can do this now, because extends allows us to grab methods from the parent or animal class
    bird.eat();
    bird.sleep();

    animal1.sleep();
  }
}
