

package test;
import java.util.Scanner;

public class operatorsIf {
    public static void main (String[] args) {
        Scanner skan = new Scanner(System.in);

       // int num = 1998;
        // if (num >= 1999)
        {
            // System.out.println("Якщо ваше число >= 1999");
        }
        // else
        {
            // System.out.println("Якщо Ваше число не >= 1999");
        }

        int price_car_citroen = 5000;
        int price_car_bmw = 23000;
        int price_car_ferrari = 90000;
        int salery = 90000;
        if (salery == price_car_citroen)
        {
        System.out.println("Тоді я можу купити авто Сітроєн");
        }
        else if (salery == price_car_bmw)
        {
            System.out.println("Тоді я можу купити авто бмв");
        }
        else if (salery == price_car_ferrari)
        {
            System.out.println("Тоді я можу купити авто Ферарі");
        }
        else
        {
            System.out.println("Тоді я буду їздити на таксі");
        }

        String word = "";
        while (word.equals("Кола") != true)
        {
            System.out.println("Хочу лимонад але не знаю який");
            word = skan.nextLine();
        }
        System.out.println("Ти вгадав");

        for (int num1 = 3; num1 <= 9; num1=num1+3)
        // фор - працює по формулі з трьох частин (початок;кінець;крок дії)
        {
            System.out.println(num1);
        }



    }
}
