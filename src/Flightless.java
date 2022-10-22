public class Flightless extends Birds {
    private final String typeMove;

    public Flightless(String name, int age, String livingEnvironment, String typeFood) {
        super(name, age, livingEnvironment);
        if (typeFood == null || typeFood.isBlank()) {
            this.typeMove = "передвигается по земле";
        } else {
            this.typeMove = typeFood;
        }
    }

    public String getTypeMove() {
        return typeMove;
    }

    public String eat() {
        return "ест еду клювом";
    }

    public String sleep() {
        return "спит в норе";
    }

    public String move() {
        return "бегает или прыгает на конечностях";
    }

    public String walk() {
        return "ходит по земле";
    }

    public String hunt() {
        return "Вытягивает червяков и жуков клювом";
    }

    @Override
    public String toString() {
        return "Травоядное " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() +
                ", питание: " + eat() + ", сон: " + sleep() + ",тип передвижения: " + getTypeMove() +
                ", перемещение: " + move() + ". " + hunt() + ", " + walk() + "; " + getClass();
    }
}
