package oop;
interface Athlete {
    void warmUp();   // Метод для розминки спортсменів
    void train();    // Метод для основного тренування спортсменів
}
// Клас Runner(Бігун) реалізує Athlete
class Runner implements Athlete {
    @Override
    public void warmUp() {
        System.out.println("Бігун розминається: робить легку пробіжку 500 метрів.");
    }
    @Override
    public void train () {
        System.out.println("Бігун тренується: бігає 10 км.");
    }
}
// Клас Weightlifter реалізує Athlete
class Weightlifter implements Athlete {
    @Override
    public void warmUp() {
        System.out.println("Штангіст розминається: робить вправи з порожнім грифом.");
    }
    @Override
    public void train() {
        System.out.println("Штангіст тренується: піднімає штангу 200 кг.");
    }
}
// Клас Swimmer реалізує Athlete
class Swimmer implements Athlete {
    @Override
    public void warmUp() {
        System.out.println("Плавець розминається: робить вправи на гнучкість.");
    }
    @Override
    public void train() {
        System.out.println("Плавець тренується: плаває 1000 метрів.");
    }
}
// Клас Boxer реалізує Athlete
class Boxer implements Athlete {
    @Override
    public void warmUp() {
        System.out.println("Боксер розминається: робить вправи з боксерською грушею.");
    }
    @Override
    public void train() {
        System.out.println("Боксер тренується: проводить спаринг на витривалість.");
    }
}
public class TrainingCamp {
    public static void main(String[] args) {
        Athlete[] athletes = { new Runner(), new Weightlifter(), new Swimmer(), new Boxer()};

        for (Athlete athlete : athletes) {
            athlete.warmUp();
            athlete.train();
            System.out.println("----------------------------");
        }
    }
}