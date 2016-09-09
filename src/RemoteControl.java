abstract public class RemoteControl {
  
  Boolean connectToProjector;
  Boolean connectToTV;
  Boolean connectToSSS;
  
  public RemoteControl(Boolean connectToProjector, Boolean connectToTV, Boolean connectToSSS){
    super();
    this.connectToProjector = connectToProjector;
    this.connectToTV = connectToTV;
    this.connectToSSS = connectToSSS;
  }

  public static void connectDevice(){
    System.out.println("Connectiong to device...");
  }

  public static void turnOn(){
    System.out.println("Turning device on"); 
  }

  public static void turnOff(){
    System.out.println("Turning device off"); 
  }

  public abstract void connectToDevice(RemoteControl remoteControl);

}
