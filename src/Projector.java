public class Projector extends RemoteControl {

  public Projector(Boolean connectToProjector, Boolean connectToTV, Boolean connectToSSS){
    super(connectToProjector, connectToTV, connectToSSS);
    System.out.println("Connected to projector");
  }

  public void projectorOff(){
    System.out.println("Projector powering off...");
  }

  public void projectorOn(){
    System.out.println("Projector powering on...");
  }

  public void project() {
    System.out.println("Projecting");
  }

  public void connectToDevice(){
    project();
  } 

}
