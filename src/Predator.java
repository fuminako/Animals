public class Predator extends Mammals {
    private final String typeFood;

    public Predator(String name, int age, String livingEnvironment, int movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeFood == null || typeFood.isBlank()) {
            this.typeFood = "плотоядные";
        } else {
            this.typeFood = typeFood;
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public String eat() {
        return "съедает жертву";
    }

    public String sleep() {
        return "спит днём";
    }

    public String move() {
        return "бегает, прыгает";
    }

    public String walk() {
        return "гуляет по ночам";
    }

    public String hunt() {
        return "Неожиданно нападает на жертву";
    }

    @Override
    public String toString() {
        return "Хищник " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() +
                ", питание: " + eat() + ",тип питания: " + getTypeFood() + ", сон: " + sleep() +
                ", перемещение: " + move() + ", скорость перемещения: " + getMovementSpeed() + ". " + hunt() + ", " + walk() +
                "; " + getClass();
    }
}
