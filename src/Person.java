public class Person {

  public static void main(String args[]){
    
    Projector niceProjector = new Projector();
    TV niceLargeScreenTV = new TV();

    RemoteControl remoteControl = RemoteControl.getInstance();

    remoteControl.connectToDevice(niceProjector);
    remoteControl.deviceOn();

    remoteControl.connectToDevice(niceLargeScreenTV);
    remoteControl.deviceOff();
  }
}
