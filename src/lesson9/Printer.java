package lesson9;

public class Printer<T> implements PrintHero<T> {
    private final T hero;

    public Printer(T hero){
        this.hero = hero;
    }


    @Override
    public T printHero() {
        return this.hero;
    }
}
