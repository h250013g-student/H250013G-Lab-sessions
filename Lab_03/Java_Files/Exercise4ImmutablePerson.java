final class ImmutablePerson {
    private final String name;
    private final int age;

    ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class Exercise4ImmutablePerson {
    public static void main(String[] args) {
        // Final fields and no setters keep this value unchanged.
        ImmutablePerson person = new ImmutablePerson("Leslie Sarai", 21);
        System.out.println(person.getName() + ", " + person.getAge());
    }
}
