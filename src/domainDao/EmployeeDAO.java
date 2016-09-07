package domainDao;

import domain.Employee;

public class EmployeeDAO {
  //DAO stands for Data Access Object.
  //It's used for data storage and data specific things on employees as well as data retrieval and deletion. 

  public void saveEmployee(Employee employee){
/*    DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
    connectionManager.connect();
    connectionManager.getConnectionObject().prepareStatement("insert into Employee tbl");
    connectionManager.disconnect();*/
    System.out.println("Employee Saved");

  }

  public void deleteEmployee(Employee employee){
    System.out.println("Employee Deleted");
  }
}
