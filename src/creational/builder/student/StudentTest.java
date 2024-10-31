package creational.builder.student;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudent(){
        Student student=Student
                .builder()
                .fname("Ruby")
                .lname("420")
                .phone("6499")
                .email("rubbypiddi@gmail.com")
                .build();
        assertNotNull(student,"student object is not null");
        assertEquals("Ruby",student.getFname());

    }

}