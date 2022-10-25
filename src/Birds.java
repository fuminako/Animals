public abstract class Birds extends Animals {
    private final String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "дерево";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public abstract String eat();

    public abstract String sleep();

    public abstract String move();

    public abstract String hunt();
}
