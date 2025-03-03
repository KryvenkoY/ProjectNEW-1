package basics;
import java.util.Scanner;

public class JavaMethods {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What`s your name?");
        String name = scanner.nextLine();
        System.out.println("What country are you from?");
        String country = scanner.nextLine();
        double weight = 91.5;
        sayHi(name, country, 31, weight);
    }

    // Методи з параметрами урок 17
    public static void sayHi (String name, String country, int age, double weight)
    {
        System.out.println("Hello, " + name + " from country " + country + "; age" + age);
        System.out.println("Your weight: " + weight);

        //  public void publicMethod() {
        //        System.out.println("Доступний усюди");
        //    }
        //
        //    private void privateMethod() {
        //        System.out.println("Доступний тільки в цьому класі");
        //    }
        //
        //    protected void protectedMethod() {
        //        System.out.println("Доступний у підкласах та в межах пакету");
        //    }
        //
        //    void defaultMethod() {
        //        System.out.println("Доступний тільки в межах пакету");
        //    }

        //    Підсумок
        //
        //    Методи дозволяють розбивати код на логічні частини.
        //    public, private, protected керують доступом до методу.
        //    Тип повернення визначає, що повертає метод (int, String, void тощо).
        //    Параметри дозволяють передавати значення в метод.
        //    Перевантаження методів (Method Overloading) дозволяє використовувати однакові імена, але різні параметри.
        //    Рекурсія – це коли метод викликає сам себе.
        //    static методи можна викликати без створення об'єкта.
    }
}

