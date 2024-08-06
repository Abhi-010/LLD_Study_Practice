package DesignPattern.Singleton.DoubleChecking;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;
    private DatabaseConnection(){

    }
    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){ //first check without lock
            synchronized (DatabaseConnection.class){
                if(databaseConnection == null){//second check with lock
                    databaseConnection = new DatabaseConnection();
                }
            }
       }
        return databaseConnection;
    }
}
