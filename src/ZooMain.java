public class ZooMain {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк");

        Сrocodile crok = new Сrocodile('a','b', 'c' );
        System.out.printf("Крокодил говорит : "); crok.klats();

        Owl owl = new Owl();
        owl.woohoo();
        crok.klats();
        Hog h = new Hog();
        h.growl();
Fish fish = new Fish('р','ы');
fish.bubble();
    }
}