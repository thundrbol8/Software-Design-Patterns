package creational.builder;

public class User {

  private final String firstName;
  private final String lastName;
  private final String email;
  private final String phone;
  private final String gender;
  private final int age;

  public User(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.phone = builder.phone;;
    this.gender = builder.gender;
    this.age = builder.age;
  }

  public void displayDetails() {
    System.out.println("firstName: " + firstName);
    System.out.println("lastName: " + lastName);
    System.out.println("email: " + email);
    System.out.println("phone: " + phone);
    System.out.println("gender: " + gender);
    System.out.println("age: " + age);
    System.out.println();
  }


  public static class Builder {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String gender;
    private int age;

    public Builder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder setGender(String gender) {
      this.gender = gender;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public User build() {
      return new User(this);
    }

  }
}
