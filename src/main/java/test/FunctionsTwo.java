package test;

public class FunctionsTwo {
    //Functions !
    //Функції в Java називаються методами.
    //Вони можуть бути зі змінними (приймати параметри) та без.
    //Всі методи пишуться всередині класів.
    public static void main (String[] args) {
        int[] nums1 = {9, 4, 3, 4};
        summa (nums1);
        int[] nums2 = {9, 4, 3, 4, 5};
        summa (nums2);
    }
    public static void summa(int [] arr) {
        int sum = 0;
        for (int el: arr) {
            sum += el;
        }
        System.out.println("Summa of all elements: " + sum);
    }
}
