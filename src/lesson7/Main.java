package lesson7;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println("Количество героев = " + Hero.getCountOfHeroes());
        System.out.println("Имя героя: " + h.getName() + " , здоровье = " + h.getHealth() + ", статус: " + h.getStatus() + ", сила = " + h.getStrength() + " , скорость = " + h.getVelocity());
        h.greetingsHero();
        Hero h2 = new Hero("Боромир", 0,0, 10, 5);
        System.out.println("Количество героев = " + Hero.getCountOfHeroes());
        System.out.println("Имя героя: " + h2.getName() + " , здоровье = " + h2.getHealth() + ", статус: " + h2.getStatus() + ", сила = " + h2.getStrength() + " , скорость = " + h2.getVelocity());
        h2.greetingsHero();
        Hero a = new Archer("Соколиный глаз", 10, 10, 1);
        System.out.println("Количество героев = " + Hero.getCountOfHeroes());
        System.out.println("Имя героя: " + a.getName() + " , здоровье = " + a.getHealth() + ", статус: " + a.getStatus() + ", сила = " + a.getStrength() + " , скорость = " + a.getVelocity());
        a.greetingsHero();

        Hero e = new Elf("Леголас", 5, 5, 1);
        System.out.println("Количество героев = " + Hero.getCountOfHeroes());
        System.out.println("Имя героя: " + e.getName() + " , здоровье = " + e.getHealth() + ", статус: " + e.getStatus() + ", сила = " + e.getStrength() + " , скорость = " + e.getVelocity());
        e.greetingsHero();

        Hero w = new Warrior("Артур", 5, 5, 1);
        System.out.println("Количество героев = " + Hero.getCountOfHeroes());
        System.out.println("Имя героя: " + w.getName() + " , здоровье = " + w.getHealth() + ", статус: " + w.getStatus() + ", сила = " + w.getStrength() + " , скорость = " + w.getVelocity());
        w.greetingsHero();
    }
}
