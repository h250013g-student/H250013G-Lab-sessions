public class Exercise4ImmutablePerson {
    static final class ImmutablePerson {
        private final String name; private final int age;
        ImmutablePerson(String name, int age) { this.name = name; this.age = age; }
        String getName() { return name; } int getAge() { return age; }
    }
    public static void main(String[] args) { ImmutablePerson p = new ImmutablePerson("Leslie Sarai", 21); System.out.println(p.getName() + ", " + p.getAge()); }
}
