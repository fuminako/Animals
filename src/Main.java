public class Main {
    public static void main(String[] args) {
        Amphibians snake = new Amphibians("Уж пресноводный", 12, "вблизи водоёмов");
        Amphibians frog = new Amphibians("Лягушка", 1, "вблизи водоёмов");
        System.out.println(snake);
        System.out.println(frog);

        Herbivores gazelle = new Herbivores("Газель", 3, "степи", 20, "трава и сухие ветки");
        Herbivores horse = new Herbivores("Лошадь", 20, "степи", 20, "трава и фрукты");
        System.out.println(gazelle);
        System.out.println(horse);

        Predator hyena = new Predator("Гиена", 7, "саванна", 12, "мелкие животные");
        Predator tiger = new Predator("Тигр", 27, "тайга", 17, "дичь и мелкие животные");
        System.out.println(hyena);
        System.out.println(tiger);

        Flightless peacock = new Flightless("Павлин", 4, "лесистая местность", "зерно");
        Flightless penguin = new Flightless("Пингвин", 5, "прибрежные водаы Антарктики", "рыба");
        System.out.println(peacock);
        System.out.println(penguin);

        Flying seagull = new Flying("Чайка", 1, "прибрежная зона", "рыба");
        Flying falcon = new Flying("Сокол", 10, "степи", "мелкие грызуны");
        System.out.println(seagull);
        System.out.println(falcon);
    }
}