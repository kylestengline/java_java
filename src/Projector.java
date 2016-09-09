public class Projector implements Device {
  
  public void turnOn(){
    pullDownProjectorScreen();
    System.out.println("Projector has been turned on");
  }

  public void turnOff(){
    pullUpProjectorScreen();
    System.out.println("Projector has been turned off");
  }

  public void pullDownProjectorScreen(){
    System.out.println("Screen has been lowered for viewing");
  }

  public void pullUpProjectorScreen(){
    System.out.println("Screen has been raised");
  }

  public String toString(){
    return "Projector";
  }
}
