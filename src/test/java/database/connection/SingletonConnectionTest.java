package database.connection;

import org.junit.Before;
import org.junit.Test;

import static database.connection.SingletonConnection.getInstance;
import static org.junit.Assert.*;

public class SingletonConnectionTest {

    SingletonConnection connection;

    @Before
    public void init() {
        connection = getInstance();
    }


    @Test
    public void getInstanceTest() {
        assertNotNull(SingletonConnection.getInstance());
    }

    @Test
    public void databaseIsConnectedTest() {
        assertTrue(SingletonConnection.getInstance().databaseIsConnected());
    }

}