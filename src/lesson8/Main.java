package lesson8;

public class Main {
    public static void main(String[] args) {
        Client c = new Client("Иванов Иван Иванович", 35, 500000, Season.SPRING);
        Client c2 = new Client("Сидоров Сидр Сидорович", 25, 5000000, Season.AUTUMN);
        Employee e = new Employee("Петров Петр Петрович", 50, 1100000, Season.SUMMER);
        c.sendLetter();
        c.printInfo();
        c2.printInfo();
        e.printInfo();

        Printable pr = createPrintable("Тулонов Николай Константинович", 41, 10000000, Season.SPRING,true);
        pr.printInfo();

        print(new Employee("Федоров Федор Федорович", 38, 800000, Season.WINTER));
        print(pr);
        c2.printSeason();
        e.printSeason();

        ClickHandler ch = clickHandler("Тулонов Николай Константинович", 41, 10000000, Season.SPRING,true);
        ch.printSeason();

    }

    static void print (Printable p) {
        p.printInfo();
    }

    static Printable createPrintable(String name, int age, double sum, Season s, boolean option){
        return option ? new Client(name, age, sum, s) : new Employee(name, age, sum, s);
    }

    static ClickHandler clickHandler(String name, int age, double sum, Season s, boolean option){
        return option ? new Client(name, age, sum, s) : new Employee(name, age, sum, s);
    }
}
