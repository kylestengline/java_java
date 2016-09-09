public class SurroundSoundSystem extends RemoteControl {

  public SurroundSoundSystem(Boolean connectToProjector, Boolean connectToTV, Boolean connectToSSS){
    super(connectToProjector, connectToTV, connectToSSS);
    System.out.println("Connected to Surround Sound System...");
  }

  public void sound() {
    System.out.println("*Loud Noises*");
  }

  public void connectToDevice(){
    sound();
  } 

}
