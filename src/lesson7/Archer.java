package lesson7;

public class Archer extends Hero{
    private int level;
    public Archer(){
        super();
        this.typeOfHero="Archer";
    }

    public Archer(int level){
        switch (level) {
            case 1: {
                this.health=100;
                this.strength=5;
                this.velocity=5;
            }
            case 2: {
                this.health=150;
                this.strength=7;
                this.velocity=7;
            }
            case 3: {
                this.health=200;
                this.strength=10;
                this.velocity=10;
            }
            default: {
                System.out.println("Неправильный уровень");
                break;
            }
        }
    }

    public void attack(Hero otherHero) {
        System.out.println();
    }

    @Override
    public void moveTo() {

    }
}
