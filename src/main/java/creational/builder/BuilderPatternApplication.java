package creational.builder;

public class BuilderPatternApplication {

  public static void main(String[] args) {

    User user1 = new User.Builder()
      .setFirstName("Ankush")
      .setLastName("Sonker")
      .setEmail("ankushsonker72@gmail.com")
      .setPhone("8756603729")
      .setGender("MALE")
      .setAge(25)
      .build();

    User user2 = new User.Builder()
      .setFirstName("Suman")
      .setLastName("Sonker")
      .setEmail("sumansonker72@gmail.com")
      .setPhone("8176875150")
      .setGender("FEMALE")
      .setAge(44)
      .build();

    User user3 = new User.Builder()
      .setFirstName("Aditi")
      .setLastName("Sonker")
      .setEmail("aditisonker72@gmail.com")
      .setPhone("9005545938")
      .setGender("FEMALE")
      .setAge(23)
      .build();

    user1.displayDetails();
    user2.displayDetails();
    user3.displayDetails();

  }
}
