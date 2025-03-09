package Error_handling;
/*📌 Власні винятки у Java (Custom Exceptions)
✅ Власні винятки – це класи, які наслідують Exception або RuntimeException.
🔹 Використовуються, коли стандартних винятків недостатньо для опису помилки.
Створення перевіреного винятку (Checked Exception)
✅ Наслідуємо Exception.
📌 Java змушує обробляти такі винятки через try-catch або throws.
1️⃣ Створюємо власний виняток (наприклад, коли недостатньо коштів)
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super (message);
    }
}
// 2️⃣ Використовуємо цей виняток у методі
public class Custom_Exceptions {
    private double balance;

    public Custom_Exceptions(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("❌ Недостатньо коштів! Ваш баланс: " + balance + " грн.");
        }
        balance -= amount;
        System.out.println("✅ Ви зняли " + amount + " грн. Новий баланс: " + balance + " грн.");
    }
    public static void main (String[] args) {
        Custom_Exceptions account = new Custom_Exceptions(1000);

        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}
