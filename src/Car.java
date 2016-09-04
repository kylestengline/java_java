public class Car {
  
  int wheels;
  String color;
  String name;
  int hp;
  int doors;

  public Car(int wheels, String color, String name, int hp, int doors) {
   super();
   this.wheels = wheels;
   this.name = name;
   this.color = color;
   this.hp = hp;
   this.doors = doors;
  }

  public void shows() {
    System.out.println("This " + name + " has " + doors + " doors.");
    System.out.println("It has " + hp + " horsepower and " + wheels + " wheels.");
    System.out.println("This is a " +color+ " car");
  }

  public void drive(){
    System.out.println("vrooomm....");
    System.out.println("vrooomm....");
  }

}
