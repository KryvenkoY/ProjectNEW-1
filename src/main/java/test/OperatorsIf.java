package test;
import java.util.Scanner;

public class OperatorsIf {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int num = 1998;
        // if (num >= 1999)
        {
            // System.out.println("Якщо ваше число >= 1999");
        }
        // else
        {
            // System.out.println("Якщо Ваше число не >= 1999");
        }

    // int price_car_citroen = 5000;
    // int price_car_bmw = 23000;
    // int price_car_ferrari = 90000;
    // int salary = 90000;
    // if (salary == price_car_citroen)
    // {
    // System.out.println("Тоді я можу купити авто Сітроєн");
    // }
    // else if (salary == price_car_bmw)
    // {
    //     System.out.println("Тоді я можу купити авто бмв");
    // }
    // else if (salary == price_car_ferrari)
    // {
    //     System.out.println("Тоді я можу купити авто Ферарі");
    // }
    // else
    // {
    //     System.out.println("Тоді я буду їздити на таксі");
    // }

    // String word = "";
    // while (word.equals("Кола") != true)
    // {
    //     System.out.println("Хочу лимонад але не знаю який");
    //     word = scanner.nextLine();
    // }
    // System.out.println("Ти вгадав");

    // for (int num1 = 3; num1 <= 9; num1=num1+3)
        // фор - працює по формулі з трьох частин (початок;кінець;крок дії)
        {
            //System.out.println(num1);


        //int day = 2;
        //switch (day) {
        //    case 1:
        //        System.out.println("Понеділок");
        //        break;
        //    case 2:
        //        System.out.println("Вівторок");
        //        break;
        //    case 3:
        //        System.out.println("Середа");
        //        break;
        //    case 4:
        //        System.out.println("Четвер");
        //        break;
        //    case 5:
        //        System.out.println("П'ятниця");
        //        break;
        //    default:
        //        System.out.println("Вихідний");

                // int numX = 5;
                // do {
                //     System.out.println("Число: " + numX);
                //     numX++;
                // } while (numX < 3);
                    String password;

                    do {
                        System.out.println("Введіть пароль: ");
                        password = scanner.nextLine();
                    } while (!password.equals("1999"));

                    System.out.println("Пароль вірний! Доступ дозволено.");
                    scanner.close();

                    }



            }
        }
