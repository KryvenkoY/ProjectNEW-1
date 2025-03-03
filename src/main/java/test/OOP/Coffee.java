package test.OOP;

class Beverage {
    protected String name;
    protected double price;
    protected int volume;

    public Beverage (String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }
    public void prepare() {
        System.out.println("Готується напій: " + name);
    }
    public void getInfo() {
        System.out.println(name+ " - " + volume + "ml, price: " + price + " grn.");
    }
}
class Espresso extends Beverage {
    public Espresso() {
        super("Espresso" , 45.0, 30);
    }
    @Override
    public void prepare() {
        System.out.println(name + ": варимо шот за допомогою кавомашини.");
    }
}
class Tea extends Beverage {
    public Tea() {
        super("Tea English Breakfast" , 55.0, 350);
    }
    @Override
    public void prepare() {
        System.out.println(name + ": запарюємо заварку у гарячій воді та додаємо лимон або молоко.");
    }
}
class Cappuccino extends Beverage {
    public Cappuccino() {
        super("Cappuccino Coffee" , 75, 230);
    }
    @Override
    public void prepare() {
        System.out.println(name+ ": варимо еспресо та додаємо вспінене молоко та малюємо латте арт.");
    }
}
class Milkshake extends Beverage {
    public Milkshake() {
        super("Mango and pineapple Milkshake" , 130, 450);
    }
    @Override
    public void prepare() {
        System.out.println(name+ ": додаємо молоко з фруктовим п'юре та шейкуємо");
    }
}
class AlcoholicCocktail extends Beverage {
    public AlcoholicCocktail() {
        super("Porn Star cocktail" , 350, 210);
    }
    @Override
    public void prepare() {
        System.out.println(name + ": в шейкер додаємо лід, горілку, білок та п'юре маракуя та шейкуємо");
    }
}
public class Coffee {
    public static void main(String[] args) {
        Beverage[] menu = {
                new Espresso(),
                new Tea(),
                new Cappuccino(),
                new Milkshake(),
                new AlcoholicCocktail()
        };
        for (Beverage drink: menu) {
            drink.getInfo();
            drink.prepare();
            System.out.println("=========================");
        }
    }
}