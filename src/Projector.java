public class Projector extends RemoteControl {

  public Projector(Boolean connectToProjector, Boolean connectToTV, Boolean connectToSSS){
    super(connectToProjector, connectToTV, connectToSSS);
    System.out.println("Connected to projector");
  }

  public void project() {
    System.out.println("Projecting");
  }

  public void connectToDevice(){
    project();
  } 

}
