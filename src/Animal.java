public abstract class Animal {
  //animal class is referred to as the parent class
  //any class that extends this class is going to need the move method implemented
  
  int age;
  int weightInLbs;
  String gender;

  public Animal(int age,  String gender, int weightInLbs) {
    this.gender = gender;
    this.weightInLbs = weightInLbs;
    this.age = age;
  }

  //public void <method> is creating the behavior of a class
  public void eat() {
    System.out.println("eating...") ;
  }

  public void sleep() {
    System.out.println("sleeping...");
  }

  public abstract void move();
    
}
