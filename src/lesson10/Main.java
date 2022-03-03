package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s;
        String digits;
        while (true) {
            System.out.println("введите строку");
            s = scr.nextLine();
            try {
                digits = findDigits(s);
                if (digits.length()!=0) throw new DigitException("Строка содержит цифры", digits);
                break;
            } catch (DigitException de) {
                System.out.println(de.getMessage());
                System.out.println(de.getDigits());
            }
        }
    }

    public static String findDigits(String s){
        String[] stmp = s.split("\\D+");
        String numbers = String.join("",stmp);
        return numbers;
    }
}
