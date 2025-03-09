package Error_handling;
// 1️⃣ Створюємо власний виняток (наприклад, некоректний номер картки)
class InvalidCardException extends RuntimeException {
    public InvalidCardException(String message) {
        super(message);
    }
}
// 2️⃣ Використовуємо цей виняток у методі
public class Unchecked_Exceptions {
    public static void validateCard(String cardNumber) {
        if (cardNumber == null || cardNumber.length() !=16) {
            throw new InvalidCardException("❌ Невірний номер картки! Введіть 16 цифр.");
        }
        System.out.println("✅ Картка " + cardNumber + " валідна.");
    }
    public static void main(String[] args) {
        try {
            validateCard("123");
        } catch (InvalidCardException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
