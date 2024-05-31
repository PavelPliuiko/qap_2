public class Person {
    String lastName;
    String firstName;
    Address home;

    Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
