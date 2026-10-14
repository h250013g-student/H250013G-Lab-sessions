class Address {
    String city;
    Address(String city) { this.city = city; }
}
class Person {
    String name;
    Address address;
}

public class Exercise5PersonAddress {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Leslie Sarai";
        person.address = new Address("Harare");
        System.out.println(person.address.city);

        person.address = null;
        try {
            System.out.println(person.address.city);
        } catch (NullPointerException e) {
            System.out.println("Address is null");
        }
    }
}
