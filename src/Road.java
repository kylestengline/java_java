public class Road {
  
  public static void main(String[] args){

    Car car1 = new Car(4, "blue", "Ford", 3000, 2);
    Car car2 = new Car(4, "green", "Subaru", 5000, 4);

    car1.shows();
    car1.drive();

    car2.shows();
    car2.drive();
  }
}
