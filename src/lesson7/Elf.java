package lesson7;

public class Elf extends Hero{
    private int level;
    public Elf(){
        super();
        this.typeOfHero="Elf";
    }

    public Elf(int level){
        switch (level) {
            case 1: {
                this.health=100;
                this.strength=6;
                this.velocity=4;
            }
            case 2: {
                this.health=150;
                this.strength=8;
                this.velocity=6;
            }
            case 3: {
                this.health=200;
                this.strength=15;
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
