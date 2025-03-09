package Error_handling;
public class MultipleExceptionHandling {
    public static void processData(Integer number) {
        try {
            System.out.println("Value: " + number.toString());
            int results = 10 / number;
            System.out.println("The result of the division: " + results);
        } catch (NullPointerException e) {
            System.out.println("❌ The variable has the value null!");
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Division by zero is impossible!");
        } finally {
            System.out.println(" Processing complete.\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("=== Test 1: Correct number ===");
        processData(5);
        System.out.println("=== Test 2: Division by 0 ===");
        processData(0);
        System.out.println("=== Test 3: NullPointerException ===");
        processData(null);
    }
}
