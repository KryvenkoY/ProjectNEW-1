package oop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* 🔹 Основи Java Collections: ArrayList, HashMap, HashSet
Java Collections Framework (JCF) – це набір класів і інтерфейсів, які спрощують роботу зі структурами даних.
 */
public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<String> avengers = new ArrayList<>();
        //Додаємо персонажів з індивідуальним індексом
        avengers.add("IronMan");
        avengers.add("Captain Ukraine");
        avengers.add("Thor");
        avengers.add("Hulk");
        //Додаємо нового героя який приєднався до команди(Людина павук)
        avengers.add(2,"Spider Man");
        //IronMan пішов на пенсію
        avengers.remove("IronMan");
        System.out.println("Поточний склад Avengers: " +avengers);
        System.out.println("Лідер команди: " +avengers.get(0));
    }
}
class InfinityStones {
    public static void main(String[] args) {
        HashMap<String, String> stones = new HashMap<>();
        // Додаємо Камені Нескінченності (ключ → значення)
        stones.put("Space", "Teleportation");
        stones.put("Mind", "Control minds");
        stones.put("Reality", "Change reality");
        stones.put("Power", "Unlimited strength");
        stones.put("Time", "Time travel");
        stones.put("Soul", "Control over souls");
        // Отримання властивості каменю
        System.out.println("Time Stone power: " + stones.get("Time"));

        // Танос втратив Камінь Душі
        stones.remove("Soul");

        // Чи є Камінь Реальності?
        if (stones.containsKey("Reality")) {
            System.out.println("Reality Stone still exists!");
        }

        // Виведення всіх каменів
        System.out.println("Всі Камені Нескінченності:");
        for (String stone : stones.keySet()) {
            System.out.println(stone + " Stone → " + stones.get(stone));
        }
    }
}
class MarvelMultiverse {
    public static void main(String[] args) {
        HashSet<String> universes = new HashSet<>();

        // Додаємо унікальні всесвіти
        universes.add("Earth-616");
        universes.add("Earth-199999"); // Основний кіновсесвіт MCU
        universes.add("Earth-1610"); // Ultimate Universe
        universes.add("Earth-838");
        // Спроба додати дублікат
        boolean added = universes.add("Earth-616");
        if (!added) {
            System.out.println("Всесвіт Earth-616 вже існує!");
        }

        // Чи існує всесвіт Earth-199999?
        if (universes.contains("Earth-199999")) {
            System.out.println("MCU (Earth-199999) знайдено!");
        }

        // Виведення унікального списку всесвітів
        System.out.println("Всі відомі всесвіти Marvel:");
        for (String universe : universes) {
            System.out.println(universe);
        }
    }
}
//ArrayList	1) Месники (Avengers)	Порядковий список, можна змінювати
//HashMap 2) Камені Нескінченності	Збереження пар "ключ → значення", швидкий пошук
//HashSet 3) Мультивсесвіти Marvel	Тільки унікальні елементи, без дублікатів