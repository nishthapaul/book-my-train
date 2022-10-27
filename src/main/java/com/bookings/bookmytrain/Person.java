package bookmytrain;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String firstName;
  private String lastName;
  Person (String fname, String lname) {
    firstName = fname;
    lastname = lname;
  }
}
