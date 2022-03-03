package lesson9;

public class Warrior<T> extends Hero {
    private int level;
    protected int longAttack;
    protected int range;
    private int defense;

    public Warrior(T id){
        super(id);
        this.typeOfHero="Warrior";
    }

    public Warrior(T id, String name, int x, int y, int level){
        super(id, name, x, y);
        this.typeOfHero="Warrior";
        switch (level) {
            case 1: {
                this.health=100;
                this.strength=5;
                this.velocity=5;
                this.longAttack = 1;
                this.range = 50;
                this.defense = 1;
                this.level = level;
            }
            case 2: {
                this.health=150;
                this.strength=7;
                this.velocity=7;
                this.longAttack = 2;
                this.range = 70;
                this.defense = 2;
                this.level = level;
            }
            case 3: {
                this.health=200;
                this.strength=10;
                this.velocity=10;
                this.longAttack = 3;
                this.range = 100;
                this.defense = 3;
                this.level = level;
            }
            default: {
                System.out.println("Неправильный уровень");
                break;
            }
        }
    }

    @Override
    public void greetingsHero(){
        System.out.println("Воин " + getName() + " приветствует тебя");
    }

}
