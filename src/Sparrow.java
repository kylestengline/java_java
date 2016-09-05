public class Sparrow extends Bird implements Flyable {
//above we're implementing the functionality of the flyable interface
//we can implement many other kinds of interfaces as well.

  public Sparrow(int age, String gender, int weightInLbs) {
    super(age, gender, weightInLbs);
  }

  //if we don't have this method the class won't be able to compile
  public void fly() {
    System.out.println("The sparrow flies...");
  }
}
