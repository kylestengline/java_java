package domain;

public class HospitalManagement {

  //instead of having if statements, we can now call the abstract method performDuties from employee class and the logic for nurse or doctor will already be in place.
  public void callUpon(Employee employee) {
    employee.performDuties();
  } 
}

//now hospital management has a lot less responsibility. Now we can add more employees and give them their respective duties inside their own class.
