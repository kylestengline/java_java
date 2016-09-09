public class SurroundSoundSystem implements Device {

  public void turnOn(){
    switchToFavoriteCD();
    increaseVolume();
    System.out.println("Sound system has been turned on");
  }

  public void turnOff(){
    lowerVolume();
    System.out.println("Sound system has been turned off");
  }

  private void increaseVolume(){
    System.out.println("Volume has increased...");
  }

  private void switchToFavoriteCD(){
    System.out.println("I'm gonna crawl..now playing...");
  }

  private void lowerVolume(){
    System.out.println("Lowering surround sound volume before closing system");
  }
}
