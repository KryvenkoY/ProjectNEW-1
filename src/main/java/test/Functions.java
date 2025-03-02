package test;

public class Functions {
    //Functions !
    //Функції в Java називаються методами.
    //Вони можуть бути зі змінними (приймати параметри) та без.
    //Всі методи пишуться всередині класів.

    public static void main (String[] args) {
        int result = sum(10, 9);
     // info("Hello");
     // info("Hi");
     // String words = "hi all";
     // info(words);
    }
    //public static void sum(int x, int y) {
    public static int sum(int x, int y) {
        int res = x + y;
        info (String.valueOf(res));
        System.out.println(res);
        return res;
    }
    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
