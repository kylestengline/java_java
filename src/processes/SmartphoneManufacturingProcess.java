package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess{

  public SmartphoneManufacturingProcess(String name){
    super(name);
  }

  protected void assembleDevice(){
    System.out.println("Assemble smartphone...");  
  } 

  protected void testDevice(){
    System.out.println("Test smartphone...");  
  } 


  protected void packageDevice(){
    System.out.println("Package smartphone...");  
  } 

  protected void storeDevice(){
    System.out.println("Store smartphone...");
  } 

}
