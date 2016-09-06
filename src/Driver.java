public class Driver {
  public void drive(Vehicle raceCar){
    raceCar.accelerate();
  }
}
//Objects can have dependencies.
//Driver object needs a vehicle object in order to drive(accelerate). It depends on the vehicle. Only when we give him the vehicle object, can the driver actually drive or use the accelerate method.
//This dependency is known as association.
//Associations should be organized around how the software should behave.
