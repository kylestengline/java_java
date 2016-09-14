package processes;

public abstract class GeneralManufacturingProcess {

  private String processName;

  public GeneralManufacturingProcess(String name){
    processName = name;
  }

  protected abstract void assembleDevice();
  protected abstract void testDevice();
  protected abstract void packageDevice();
  protected abstract void storeDevice();

  //This template below is known as the 'Template Method Design Pattern'. 
  //It's often used for abstracting workflows common across many types of objects.
  //The abstract methods are implemented in the sub-classes, but called in the abstract method itself.
  //This is more a behaviorial design pattern.
  //template method
  public void launchProcess(){

    if(processName !=null && !processName.isEmpty()){
    
      assembleDevice();
      testDevice();
      packageDevice();
      storeDevice();
    
    } else {
      System.out.println("No process name was specified");
    }
  }
}
