package creational.builder.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class Student {
    String fname;
    String lname;
    String email;
    String phone;
    String address;
}
