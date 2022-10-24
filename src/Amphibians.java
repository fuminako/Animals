
public class Amphibians extends Animals {
    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "болото";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public String eat() {
        return "заглатывает пойманную добычу";
    }

    public String sleep() {
        return "спит поглубже в норе";
    }

    public String move() {
        return "ползает, прыгает или плавает";
    }

    public String hunt() {
        return "Сливается с окружением и хватает жертву";
    }

    @Override
    public String toString() {
        return "Земноводное " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() +
                ", питание: " + eat() + ", сон: " + sleep() + ", перемещение: " + move() + ", охота: " + hunt() + "; " + getClass();
    }

}
