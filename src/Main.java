import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args){

        //Задание 1-1
        String output = "__________'\"____ \n" +
                        "_________---____\n" +
                        "______/\\_|_|____\n" +
                        "_____/__\\|_|____\n" +
                        "____/____\\_|____\n" +
                        "___/______\\|____\n" +
                        "__/__[__]__\\____\n" +
                        "_/|________|\\___\n" +
                        "/_|________|_\\__\n" +
                        "__|__---___|_____\n" +
                        "__|__|_|___|_____\n";
        System.out.println(output);

        //Задание 1-2
        String city = "Moscow";
        int population = 12655050;
        float unemployed = 1.56F;
        System.out.printf("Город: %s, Население: %d, %% Безработных: %.2f \n", city, population, unemployed);
        String str = String.format("Секция на трибуне: %c, Место: %d, Стоимость билета: %.2f %c", '\u0042', 15, 1000.50F, '\u20bd');
        System.out.println(str);
        System.out.printf("Имя: %s, Возраст: %d, Рост %d\n", "Николай", 41, 170);
        System.out.printf("Номер машины: %c%d%c%c, вес авто: %.1f кг\n", '\u0422', 123, '\u041d', '\u041a', 1350.5F);
        NumberFormat f = NumberFormat.getInstance(new Locale("ru", "RU"));
        int income = 120500800;
        System.out.printf("Название компании: \"%s\", Годовой доход: %s %c, Доля рынка, %%: %.1f\n", "Николас", f.format(income), '\u0024', 75.8F);
        System.out.printf("Резус фактор: \"%c\", Группа крови: %d, Доля, %%: %.1f\n", '\u002d', 3, 52.3F);
        System.out.printf("Университет: \"%s\", Число студентов: %d, Доля отчисленных, %%: %.1f\n", "МИРЭА", 2500, 1.8F);
        System.out.printf("Рейтинг фильма: \"%c%c%c\", Продажи: %s %c, Рейтинг IMDB: %.1f\n", '\u0041','\u0041','\u002d', f.format(225000000), '\u20bd', 7.8F);
        System.out.printf("Название бренда: \"%s\", Произведено товара: %d, Процент продаж: %.1f\n", "LEVI's", 115000, 68.9);
        System.out.printf("Категория товара: \"%c\", Штрих-код: %s, Процент покупателей: %.2f\n", '\u0041', f.format(1234567890), 7.8F);


    }
}
