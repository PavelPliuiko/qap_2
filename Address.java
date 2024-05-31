public class Address {
    String street;
    String city;
    String state;
    String zip;

    Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " + zip;
    }
}
