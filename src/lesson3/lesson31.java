package lesson3;

import java.util.Scanner;


public class lesson31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку, состоящую из имени и чисел: ");
        String s = sc.nextLine();
        String[] lexems = s.split(" ");
        String name = lexems[0];
        char[] charArray = lexems[1].toCharArray();

        printSum(name, sum(charArray, charArray.length-1));
    }

    private static int sum( char[] arr, int n ) {
        if (n < 0) {
            return 0;
        } else{
            int a;
            try {
                a = Character.getNumericValue(arr[n]);
            } catch (NumberFormatException e) {
                a = 0;
                System.out.println("Ошибка преобразования в число");
            }
            return a + sum(arr, n-1);
        }
    }
    private static void printSum (String name, int sum) {
        switch (sum) {
            case 0:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Ноль");
                break;
            case 1:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Один");
                break;
            case 2:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Два");
                break;
            case 3:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Три");
                break;
            case 4:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Четыре");
                break;
            case 5:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Пять");
                break;
            case 6:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Шесть");
                break;
            case 7:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Семь");
                break;
            case 8:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Восемь");
                break;
            case 9:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Девять");
                break;
            case 10:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = Десять");
                break;
            default:
                System.out.println("Здравствуй " + name + "! Сумма чисел в числе = " + sum);
                break;
        }
    }
}
