package test;

class Hero {
    String name;
    int health;
    int mana;

    public Hero(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }
    public void attack() {
        System.out.println(name + " :Attack the enemy!");
    }
    public void useAbility(String ability) {
        System.out.println(name + "uses" + ability + "!");
    }
}
class StrengthHero extends Hero {
    int armor;
    public StrengthHero(String name, int health, int mana, int armor) {
        super(name, health, mana);
        this.armor = armor;
    }
    public void tank() {
        System.out.println(name + " :Blocks the attack thanks to the armor " + armor);
    }
}
public class HeroDota {
    public static void main(String[] args) {
        StrengthHero Axe = new StrengthHero("Axe", 3000, 400, 15);
        Axe.attack();
        Axe.tank();
    }
}
