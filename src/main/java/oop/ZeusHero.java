package oop;
class HeroOne {
    protected String name;
        public HeroOne(String name) {
            this.name = name;
        }

        // Метод атаки
        public void attack() {
            System.out.println(name + "Завдає звичайну атаку");
        }
    }
    // Визначаємо ульт атака для Зевса
    class Zeus extends HeroOne {
        public Zeus() {
            super("Zeus");
        }

        @Override
        public void attack() {
            System.out.println(name + " Uses Thundergod's Wrath ultimate");
        }
    }
    // Визначаємо атаку для Апарата
    class AncientApparition extends HeroOne {
        public AncientApparition() {
            super("AncientApparition");
        }
        @Override
        public void attack() {
            System.out.println(name+ " Uses Ice Blast Wrath ultimate");
        }
    }
    public class ZeusHero {
        public static void main(String[] args) {
            HeroOne zeus = new Zeus();
            HeroOne ancientApparition = new AncientApparition();

            zeus.attack();
            ancientApparition.attack();
        }
    }
