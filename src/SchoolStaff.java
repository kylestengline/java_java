public class SchoolStaff {

  private void makeAnnouncements(){
    System.out.println("made announcements...");
  }
  
  private void takeAttendance(){
    System.out.println("took attendance...");
  }

  private void collectPaperWork(){
    System.out.println("collecting paperwork...");
  }

  private void conductHallwayDuties(){
    System.out.println("conducted hallway duties...");
  }

  /* This is going to be inherited behavior, derivatives of teacher will inherit this behavior, but will implement their own version with the above abstract teach method.
   */
  public void performOtherResponsibilities(){
    makeAnnouncements();
    takeAttendance();
    collectPaperWork();
    conductHallwayDuties();
  }

}
