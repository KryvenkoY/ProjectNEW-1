package Error_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Що таке винятки (Exceptions)?
Виняток (Exception) — це неочікувана помилка, яка виникає під час роботи програми.
🔹 Види винятків (Exception):
 */
public class BankExceptions {
    public static void main(String[] args) {
        System.out.println("\n=== Перевірений виняток (Checked Exception) ===");
        readBankStatement();

        System.out.println("\n=== Неперевірений виняток (Unchecked Exception) ===");
        bankBalance();

        System.out.println("\n=== ArithmeticException: Нарахування відсотків ===");
        bankInterest();

        System.out.println("\n=== IllegalArgumentException: Некоректний переказ ===");
        try {
            makeTransfer(-1000); // ❌ Некоректна сума
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
    // 1️⃣ Checked Exception (Перевірений виняток)
    public static void readBankStatement() {
        try {
            File statement = new File("statement.pdf"); // Виписка по рахунку
            Scanner scanner = new Scanner(statement);
        } catch (FileNotFoundException e) {
            System.out.println("Помилка: Виписка не знайдена! Зверніться в підтримку.");
            /*🏦 Що це означає в банку?
            Якщо банк не може знайти виписку, система повинна повідомити клієнта, а не "впасти".
             */
        }
    }
    /* 2️⃣ Неперевірені винятки (Unchecked Exceptions, RuntimeException)
    📌 Java не змушує нас обробляти ці помилки, але вони можуть зламати програму.
    Виникають через логічні помилки в коді (наприклад, null, неправильний індекс масиву).
     */
    public static void bankBalance() {
        Double balance = null;
        try {
            System.out.println("Ваш баланс: " + balance.toString() + " грн");
        } catch (NullPointerException e) {
            System.out.println("Помилка: Неможливо отримати баланс! Спробуйте пізніше.");
        }
    }
    /*3️⃣ ArithmeticException → Нарахування відсотків по депозиту
    📌 Аналогія: 🔹 Клієнт відкрив депозит, але банк випадково намагається розділити відсотки на 0.
     */
    public static void bankInterest() {
        double deposit = 10000;
        double interestRate = 0;
        try {
            double interest = deposit / interestRate;
            System.out.println("Відсотки нараховані: " + interest);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: Невірна ставка депозиту! Оновіть налаштування.");
            /*🏦 Що це означає в банку?
            Якщо ставка 0%, банк має викинути коректну помилку.
             */
        }
    }
    /*🏦 Що це означає в банку?
    Якщо ставка 0%, банк має викинути коректну помилку.
    */
    public static void makeTransfer(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сума переказу має бути більше 0!");
        }
            System.out.println("Переказ на " + amount + " грн успішний.");
    }
}
/*🔹 Як обробляти винятки? (try-catch-finally)
Якщо щось може піти не так, ми можемо використати try-catch для обробки винятків.
🔹 Викидання власних винятків (throw)
Іноді нам потрібно створити власну помилку.
 */
