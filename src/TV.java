public class TV implements Device{

  public void turnOn(){
    SwitchToFavoriteChannel();
    System.out.println("TV has been turned on");
  }

  public void turnOff(){
    tvOff();
    System.out.println("TV has been turned off");
  }

  private void SwitchToFavoriteChannel(){
    System.out.println("Switched to your favorite Channel");
  }

  private void tvOff(){
    System.out.println("TV powering off..");
  }
}
