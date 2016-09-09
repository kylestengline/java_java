public class RemoteControl {

  private Device device = null;
  private static final RemoteControl INSTANCE = new RemoteControl();
  
  private RemoteControl(){
  }

  public static RemoteControl getInstance(){
    return INSTANCE;
  }

  public void connectToDevice(Device aDevice){
    this.device = aDevice;
    System.out.println("Connected to " + device); 
  }

  public void deviceOn(){
    System.out.println("Turning device on...");   
    device.turnOn();
  }

  public void deviceOff(){
    System.out.println("Turning device off..");
    device.turnOff();
  }

}
