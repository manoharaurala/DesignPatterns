package creational.singleton;

public class ConnectionPool {
    private static  ConnectionPool connectionPool=null;

    private ConnectionPool() {
        // Step 1 - private constructor
    }

    public static ConnectionPool getInstance(){
        if(connectionPool==null){
            connectionPool=new ConnectionPool();
        }
        return connectionPool;
    }
}
