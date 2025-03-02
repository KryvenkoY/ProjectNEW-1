
class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мукає: Му-Му!");
    }
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " чірікає: Чик-чирик!");
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Cow myCow = new Cow("Бурьонка");
        Bird myBird = new Bird("Гоша");

        myCow.makeSound();
        myBird.makeSound();
        System.out.println("Ім'я корови: " + myCow.getName());
        System.out.println("Ім'я пташки: " + myBird.getName());

        myCow.setName("Клава");
        myBird.setName("Щегол");

        System.out.println("Нове ім'я корови: " + myCow.getName());
        System.out.println("Нове ім'я пташки: " + myBird.getName());

        myCow.makeSound();
        myBird.makeSound();
    }
}