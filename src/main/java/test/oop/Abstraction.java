package test.oop;
/*Абстракція – це один із ключових принципів об'єктно-орієнтованого програмування (ООП),
    що дозволяє приховати реалізацію та показати тільки необхідні деталі.
     */
    /*Способи реалізації абстракції в Java:
1️⃣ Абстрактний клас (abstract class)
🟢 Це шаблон, від якого всі напої успадковують основні характеристики.
2️⃣ Інтерфейси (interface)
🟢 Це договір (контракт), який гарантує, що клас міститиме певні методи
     */
// Абстрактний клас Abstraction - це (шаблон для напоїв);
abstract class Drink {
    protected String name;
    protected double price;
    protected int volume;
    protected char temperature;



    public Drink(String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;


    }
    // Абстрактний метод (кожен напій в нашій кав'ярні реалізує(prepare) його по-своєму)
    public abstract void prepare();
    // Далі йде Загальний метод для всіх напоїв
    public void getInfo() {
        System.out.println(name + " - " + volume + " мл, ціна: " + price + " грн." );
    }
}
// Клас Espresso Macchiato успадковує Abstraction
class Espresso_Macchiato extends Drink {
    public Espresso_Macchiato() {
        super("Espresso Macchiato", 45.0, 30);
    }

    @Override
    public void prepare() {
        System.out.println(name + ": варимо еспресо за допомогою кавомашини та додаємо трішки пінки молока.");
    }
}

// Клас IceTea успадковує Abstraction
class IceTea extends Drink {
    public IceTea() {
        super("Ice tea", 55.0, 350);
    }

    @Override
    public void prepare() {
        System.out.println(name + ": запарюємо чайний пакетик у гарячій воді та переливаємо в стакан з купою льоду.");
    }
}
class Lemonade extends Drink {
    public Lemonade() {
        super("Lemonade apple", 140, 500);
    }
    @Override
    public void prepare() {
        System.out.println(name + ": в стакан з льодом додаємо яблучне пюре та мінеральну воду");
    }
}
// Основний клас
public class Abstraction {
    public static void main(String[] args) {
        Drink[] menu = {new Espresso_Macchiato(), new IceTea(), new Lemonade()};
        for (Drink drink : menu) {
            drink.getInfo();
            drink.prepare();
            System.out.println("-------------------------------");
        }
    }
}