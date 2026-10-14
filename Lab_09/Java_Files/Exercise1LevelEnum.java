public class Exercise1LevelEnum {
    enum Level {
        LOW, MEDIUM, HIGH
    }

    static void advise(Level level) {
        switch (level) {
            case LOW -> System.out.println("Keep monitoring");
            case MEDIUM -> System.out.println("Take care");
            case HIGH -> System.out.println("Act immediately");
        }
    }

    public static void main(String[] args) {
        // values() visits each declared level in order.
        for (Level level : Level.values()) {
            advise(level);
        }
    }
}
