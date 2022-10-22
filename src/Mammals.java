public abstract class Mammals extends Animals {
    private final String livingEnvironment;
    private final int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "поле";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        this.movementSpeed = Math.max(movementSpeed, 0);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public abstract String eat();

    public abstract String sleep();

    public abstract String move();

    public abstract String walk();
}
