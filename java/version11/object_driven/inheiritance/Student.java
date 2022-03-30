public class Student extends Person {
  private String registration;

  public Student(String registration, int id, String name) {
    super(id, name);
    this.registration = registration;
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }
}