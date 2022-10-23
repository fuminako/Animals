public class Flying extends Birds {
    private final String typeMove;

    public Flying(String name, int age, String livingEnvironment, String typeFood) {
        super(name, age, livingEnvironment);
        if (typeFood == null || typeFood.isBlank()) {
            this.typeMove = "летит";
        } else {
            this.typeMove = typeFood;
        }
    }

    public String getTypeMove() {
        return typeMove;
    }

    @Override
    public String toString() {
        return "Травоядное " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() +
                ", питание: " + eat() + ", сон: " + sleep() + ",тип передвижения: " + getTypeMove() +
                ", перемещение: " + move() + ". " + hunt() + ", " + fly() + "; " + getClass();
    }

    public String eat() {
        return "ест еду клювом";
    }

    public String sleep() {
        return "спит в гнезде";
    }

    public String move() {
        return "летает на крыльях";
    }

    public String fly() {
        return "гуляет на свежем воздухе";
    }

    public String hunt() {
        return "Налетает на жертву сверху и захватывает клювом";
    }
}
