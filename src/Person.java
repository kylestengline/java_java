public class Person {

  public static void main(String args[]){
    RemoteControl projector = new RemoteControl(true, false, false);
    projector.connectToDevice(projector);
  }
}
