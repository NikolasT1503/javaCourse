package lesson3;

import java.util.Scanner;


public class lesson31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку, состоящую из имени и чисел: ");
        String s = sc.nextLine();
        String[] lexems = s.split(" ");
        String name = lexems[0];
        String sumStr = lexems[1];
        int sum = 0;
        for (String sym : sumStr.split("")){
            if (isNumber(sym)) {
                sum += Integer.parseInt(sym);
            }
        }
        System.out.println("Здравствуй " + name + "! Сумма чисел в числе = " + sum);
    }

    private static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
