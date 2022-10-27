package bookmytrain;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String firstName;
  private String lastName;
  private int age;
  
  Person (String fname, String lname, int age) {
    firstName = fname;
    lastname = lname;
    this.age = age;
  }
}
