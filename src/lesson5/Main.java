package lesson5;

import java.util.Scanner;

public class Main {
    private static int choice;
    private static String primer;
    private static String[] lexems;
    private static String operation;
    private static double a;
    private static double b;
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===========Программа Калькулятор==================");
        System.out.println("Выберите пункт меню");
        Calculator calc = new Calculator(0,0);
        while (choice!=3){
            System.out.println("1. Ввести пример");
            System.out.println("2. Продолжить работать с предыдущим примером");
            System.out.println("3. Выход");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите пример:");
                    primer = sc.next();
                    primer = primer.replaceAll("\\s+","");
                    lexems = primer.split("");
                    if (lexems.length==3){
                        try{
                            a = Double.parseDouble(lexems[0]);
                            b = Double.parseDouble(lexems[2]);
                        }
                        catch (NumberFormatException ex){
                            ex.printStackTrace();
                        }
                        operation = lexems[1];
                    } else {
                        try{
                            a = Double.parseDouble(lexems[0]);
                        }
                        catch (NumberFormatException ex){
                            ex.printStackTrace();
                        }
                        operation = lexems[1];
                    }
                    printResult(a,b,operation,calc);
                    calc.setAlreadyWorked(true);
                    break;
                case 2:
                    if (calc.getAlreadyWorked()) {
                        double secondOperand;
                        double firstOperand;
                        double tempResult;
                        System.out.println("Выберите операцию:");
                        System.out.println("1. Сложение");
                        System.out.println("2. Вычитание");
                        System.out.println("3. Умножение");
                        System.out.println("4. Деление");
                        System.out.println("5. Факториал");
                        System.out.println("6. Степень");
                        System.out.println("7. Сравнение");
                        System.out.println("8. Назад");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Введите второй операнд: ");
                                secondOperand = sc.nextDouble();
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand,secondOperand,"+",calc);
                                break;
                            case 2:
                                System.out.println("Введите второй операнд: ");
                                secondOperand = sc.nextDouble();
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand,secondOperand,"-",calc);
                                break;
                            case 3:
                                System.out.println("Введите второй операнд: ");
                                secondOperand = sc.nextDouble();
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand,secondOperand,"*",calc);
                                break;
                            case 4:
                                System.out.println("Введите второй операнд: ");
                                secondOperand = sc.nextDouble();
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand,secondOperand,"/",calc);
                                break;
                            case 5:
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand, firstOperand, "!",calc);
                                break;
                            case 6:
                                System.out.println("Введите второй операнд: ");
                                secondOperand = sc.nextDouble();
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand,secondOperand,"^",calc);
                                break;
                            case 7:
                                System.out.println("Введите второй операнд: ");
                                secondOperand = sc.nextDouble();
                                firstOperand = calc.getLastResult();
                                printResult(firstOperand,secondOperand,"?",calc);
                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("Пункт недоступен - нет предыдущего примера");
                    }
                    break;
                case 3:
                    break;
            }

        }

    }

    private static void printResult(double a, double b, String operation, Calculator calc){
        double tempResult;
        switch (operation) {
            case "+":
                tempResult = calc.plus(a,b);
                System.out.println("Результат: " + a + " " + operation + " " + b + " = " + tempResult);
                calc.setLastResult(tempResult);
                break;
            case "-":
                tempResult = calc.minus(a,b);
                System.out.println("Результат: " + a + " " + operation + " " + b + " = " + tempResult);
                calc.setLastResult(tempResult);
                break;
            case "*":
                tempResult = calc.multiply(a,b);
                System.out.println("Результат: " + a + " " + operation + " " + b + " = " + tempResult);
                calc.setLastResult(tempResult);
                break;
            case "/":
                tempResult = calc.division(a,b);
                System.out.println("Результат: " + a + " " + operation + " " + b + " = " + tempResult);
                calc.setLastResult(tempResult);
                break;
            case "!":
                if (a>6) {
                    calc.setCountIterations(6);
                    int count = calc.getCountIterations();
                    tempResult = calc.factorial(a);
                    System.out.println("Результат ограничен " + count + " итерациями: " + a + " " + operation + " = " + tempResult);
                    calc.setLastResult(tempResult);
                } else {
                    tempResult = calc.factorial(a);
                    System.out.println("Результат: " + a + " " + operation + " = " + tempResult);
                    calc.setLastResult(tempResult);
                }
                break;
            case "^":
                tempResult = calc.degree(a,b);
                System.out.println("Результат: " + a + " " + operation + " " + b + " = " + tempResult);
                calc.setLastResult(tempResult);
                break;
            case "?":
                System.out.println("Результат: " + a + " " + operation + " " + b + " = " + calc.compare(a,b));
                calc.setLastResult(a);
                break;
            default:
                System.out.println("Неверная операция");
                break;
        }
    }
}
