package database;
//This class is supposed to take care of db connection details. Manages and provides a connection object for clients to interact with the db.
public class DatabaseConnectionManager {
  private Connection conn;

  private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

  private DatabaseConnectionManager() {
    
  }

  public static DatabaseConnectionManager getManagerInstance(){
    return connectionInstance;
  }

  /**
   * contains connection details
   *
   * @throws SQLException
   */

  public void connect() throws SQLException {
    //processing specific to db connection details...
    conn = DriverManager.getConnection("Some/Database/Url");
    System.out.println("Established DB Connection");
  }

  public Connection getConnectionObject() {
    return conn;
  }

  public void disconnect() throws SQLException {
    conn.close();
    System.out.println("Disconnected from DB...");
  }
}
