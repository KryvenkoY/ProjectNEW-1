package test;

import java.util.Scanner;

public class LogicalOperators {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int gold = 1, silver = 1, bronze = 1;
        System.out.println("Завагальна кількість медалей:" + (gold + silver + bronze));
        if (gold > 0 && silver > 0 && bronze > 0) {
            System.out.println("У вас є медалі всіх трьох типів");
        }
        if (gold > 0 || silver > 0 || bronze > 0) {
            System.out.println("У вас як мінімум одна медаль");
        }
        //  int age = s.nextInt();
        //  if (age>40){
        //      System.out.println("Щось підозріло багато років");
        //System.out.println(1==2);
        int a = 5, b = 10;
        if (a == 1 ^ b == 10) {
            System.out.println("так");
        }
        else
        {
            System.out.println("ні");
        }
        // Тобто є такі логічні оператори як:
        // && - що означає "і" тобто обидві умови мають бути true
        // || - що означає "або" хоча б одна умова має бути true
        // ^  що означає двійкове виключення - лише одна умова має бути true, але не обидві
        // ! - що означає інверсію або ж протилежне значення
        // LUX
        // > : більше ніж 10>4
        // < : меньше ніж 6<10
        // == : дорівнює 2==2
        // >= : більше або дорівнює 4>=3
        // <= : меньше або дорівнює 3<=6
        // != : не дорівнює 3!=7






    }
}
