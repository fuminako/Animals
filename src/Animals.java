import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public final String getName() {
        return name;
    }


    public final int getAge() {
        return age;
    }

    public final void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Животное";
        } else {
            this.name = name;
        }
    }

    public final void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public abstract String eat();

    public abstract String sleep();

    public abstract String move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
