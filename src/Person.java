public class Person {

  public static void main(String args[]){
    RemoteControl projector = new Projector(true, false, false);
    projector.connectToDevice(projector);
    
  }
}
