class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class AddressPerson {
    String name;
    Address address;

    AddressPerson(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class Exercise5PersonAddress {
    public static void main(String[] args) {
        AddressPerson person = new AddressPerson("Leslie Sarai", new Address("Harare"));
        System.out.println(person.name + " lives in " + person.address.city);

        AddressPerson other = new AddressPerson("Tariro", null);
        // An address can be absent, so check before using it.
        if (other.address == null) {
            System.out.println("Address is not available");
        }
    }
}
