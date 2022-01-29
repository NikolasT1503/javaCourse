package lesson7;

public class Warrior extends Hero{
    private int level;
    public Warrior(){
        super();
        this.typeOfHero="Warrior";
    }

    public Warrior(int level){
        switch (level) {
            case 1: {
                this.health=100;
                this.strength=10;
                this.velocity=2;
            }
            case 2: {
                this.health=150;
                this.strength=15;
                this.velocity=5;
            }
            case 3: {
                this.health=200;
                this.strength=20;
                this.velocity=10;
            }
            default: {
                System.out.println("Неправильный уровень");
                break;
            }
        }
    }

    @Override
    public void attack() {

    }

    @Override
    public void moveTo() {

    }
}
