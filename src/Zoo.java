public class Zoo {
  
  //Here is where we call the methods after creating our objects.
  public static void main(String[] args) {

//    Animal bird = new Bird(3, "F", 10);
//    bird.move();

    Animal fish = new Fish(6, "F", 13);
 //   fish.move();
    
    Animal sparrow = new Sparrow(4, "M", 20);
//    sparrow.move();

    Flyable flyingBird = new Sparrow(1, "M", 4);
    flyingBird.fly();

    //We can use the instance variables sparrow or fish to pass into the
    //moveAnimals method. This is because, the fish instance variable is of type
    //Fish and belongs to the object Fish
    moveAnimals(fish);

    moveAnimals(sparrow);

  }

  //we can give an argument of type Animal. 
  //Then we call animal.move();, now this method moveAnimals(); can be called on ANY animals.
  public static void moveAnimals(Animal animal){
    animal.move(); 
  }

}
//    Chicken chick1 = new Chicken(1, "M", 7);

    //varible is of type animal, but the object is of type Sparrow.
    //Mehods we can invoke on variables are based on the type specification
    //Therefore we can not call fly method because it is not of the animal
    //specification.
//    Animal sparrow = new Sparrow(4, "M", 20);



//    bird.fly();

    //the below methods are from the animal class
    //we can do this now, because extends allows us to grab methods from the parent or animal class
//    bird.eat();
 //   bird.sleep();

 //   animal1.sleep();
