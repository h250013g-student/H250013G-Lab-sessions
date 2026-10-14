public class Exercise5PersonAddress {
    static class Address { String city; Address(String city) { this.city = city; } }
    static class Person { String name; Address address; Person(String name, Address address) { this.name = name; this.address = address; } }
    public static void main(String[] args) {
        Person person = new Person("Leslie Sarai", new Address("Harare"));
        System.out.println(person.name + " lives in " + person.address.city);
        Person other = new Person("Tariro", null);
        if (other.address == null) System.out.println("Address is not available");
    }
}
