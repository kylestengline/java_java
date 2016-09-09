public class TV extends RemoteControl {

  public TV(Boolean connectToProjector, Boolean connectToTV, Boolean connectToSSS){
    super(connectToProjector, connectToTV, connectToSSS);
    System.out.println("Connected to TV...");
  }

  public void watch() {
    System.out.println("Shameless is playing...");
  }

  public void connectToDevice(){
    watch();
  } 

}
