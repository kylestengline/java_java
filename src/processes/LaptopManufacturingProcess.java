package processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

  public LaptopManufacturingProcess(String name){
    super(name);
  }

  protected void assembleDevice(){
    System.out.println("Assemble laptop...");  
  } 

  protected void testDevice(){
    System.out.println("Test laptop...");  
  } 


  protected void packageDevice(){
    System.out.println("Package laptop...");  
  } 

  protected void storeDevice(){
    System.out.println("Store laptop...");
  } 

}
