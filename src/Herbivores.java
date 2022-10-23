
public class Herbivores extends Mammals {
    private final String typeFood;
    Herbivores[] animals;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeFood == null || typeFood.isBlank()) {
            this.typeFood = "растительная пища";
        } else {
            this.typeFood = typeFood;
        }
        animals = new Herbivores[0];
    }

    public String getTypeFood() {
        return typeFood;
    }

    @Override
    public String toString() {
        return "Травоядное " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() +
                ", питание: " + eat() + ",тип питания: " + getTypeFood() + ", сон: " + sleep() +
                ", перемещение: " + move() + ", скорость перемещения: " + getMovementSpeed() + ". " + pasture() + ", " + walk() +
                "; " + getClass();
    }

    public String eat() {
        return "медленно пережёвывают растительную пищу";
    }

    public String sleep() {
        return "спит по ночам";
    }

    public String move() {
        return "бегает, прыгает";
    }

    public String walk() {
        return "гуляет на свежем воздухе";
    }

    public final String pasture() {
        return "Пасётся на поле";
    }
}
