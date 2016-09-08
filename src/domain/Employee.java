package domain; 
abstract public class Employee {
//to still have the ability to call upon any employee object to do their respective work we make employee an abstract class and create a method for this as well.  

  private int id;
  private String name;
  private String department;
  private Boolean working;
  //making these variables private, prevents clients from modifying this objects internal state directly.

  public Employee(int id, String name, String department, Boolean working) {
    super();
    this.id = id;
    this.name = name;
    this.department = department;
    this.working = working;
  }

  public abstract void performDuties();

  @Override
  public String toString(){
    return "Employee [ id=" + id + ", name=" + name + ", department=" 
      + department + ", working=" + working + "]";
  }

}
