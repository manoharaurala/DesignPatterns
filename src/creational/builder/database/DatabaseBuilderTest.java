package creational.builder.database;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseBuilderTest {

    @Test
    public void testDatabaseBuilder() {
        Database database=Database.builder()
                .mysql()
                .withName("test")
                .withUrl("localhost",8080)
                .build();
        assertNotNull(database,"If build method is called, database object should not be null");
        assertEquals("test",database.getName(),"If name is set, on fetching it should be the same");
        Assertions.assertEquals(DatabaseType.MYSQL,database.getType(),"If mysql is set, on fetching it should be the same");
    }

}