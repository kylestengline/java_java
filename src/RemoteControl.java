public class RemoteControl implements ConnectToDevice {
  
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
    connectToDevice(remoteControl);
  }

  public static void turnOn(){
    System.out.println("Turning device on"); 
  }

  public static void turnOff(){
    System.out.println("Turning device off"); 
  }

  RemoteControl.connectDevice(projector);
  //not working ^. May be calling it wrong

}
//  public abstract void connectToDevice();
//  not sure if I need this, because I have an interface method. Also not sure if interface is the best way to go about this.

