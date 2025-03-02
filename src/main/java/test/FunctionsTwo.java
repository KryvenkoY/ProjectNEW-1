package test;

public class FunctionsTwo {
    //Functions !
    //Функції в Java називаються методами.
    //Вони можуть бути зі змінними (приймати параметри) та без.
    //Всі методи пишуться всередині класів.
    public static void main (String[] args) {
        int[] nums1 = {9, 4, 3, 4};
        sum (nums1);
        int[] nums2 = {9, 4, 3, 4, 5};
        sum (nums2);
    }
    public static void sum(int [] arr) {
        int sum = 0;
        for (int el: arr) {
            sum += el;
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
