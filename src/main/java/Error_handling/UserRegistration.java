package Error_handling;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class UserRegistration {
    public static void registerUser(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("(❌ Error: User " + name + " too young! Age must be 18+.");
        }
        System.out.println("✅ Registration successful pornHub.com ! Welcome, " + name + "!");
    }
    public static void main(String[] args) {
        try {
            registerUser("Yegor", 31);
            registerUser("Mark", 17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
