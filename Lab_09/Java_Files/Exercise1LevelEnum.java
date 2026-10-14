enum Level { LOW, MEDIUM, HIGH }
public class Exercise1LevelEnum {
    public static void main(String[] args) {
        for (Level level : Level.values()) {
            switch (level) {
                case LOW -> System.out.println("LOW: Keep going");
                case MEDIUM -> System.out.println("MEDIUM: Be careful");
                case HIGH -> System.out.println("HIGH: Take action");
            }
        }
    }
}
