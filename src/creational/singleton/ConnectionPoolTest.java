package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ConnectionPoolTest {

    @Test
    public void getInstanceTest() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        Assertions.assertSame(connectionPool1, connectionPool, "If a new instance is created, it should be the same as the older one");
    }


}