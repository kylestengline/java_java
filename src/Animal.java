public class Animal {
  
  String type;
  String color;
  int height;

  public Animal(String type, String color, int height) {
    super();
    this.type = type;
    this.color = color;
    this.height = height;
  }

  public void things() {
    System.out.println("I am a " +type);
    System.out.println("I am " +height+ " feet tall");
    System.out.println("I am " +color);
  }

  public void fly() {
    System.out.println("I am a " +type);
    System.out.println("flying");
  }

  public void swim() {
    System.out.println("I am a " +type);
    System.out.println("swimming");
  }
  
  public void run() {
    System.out.println("I am a " +type);
    System.out.println("running");
  }
}
