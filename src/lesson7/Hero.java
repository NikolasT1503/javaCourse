package lesson7;

public abstract class Hero {
    private int x;
    private int y;
    protected int health;
    protected int strength;
    protected int velocity;
    protected String typeOfHero;
    private String status;
    private static int countOfHeroes = 0;

    public Hero(){
        this.health = 100;
        this.status = "Здоров"; // Ранен, Умер
        countOfHeroes++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health, boolean operation) {
        if (operation) { this.health = this.health + health; } else {this.health = this.health - health; }
        this.status = ((this.health <100) & (this.health>0)) ? "Ранен" : (this.health<=0) ? "Умер" : "Здоров";
    }

    public String getTypeOfHero() {
        return typeOfHero;
    }

    public void setTypeOfHero(String typeOfHero) {
        this.typeOfHero = typeOfHero;
    }

    public String getStatus() {
        return status;
    }

    public abstract void attack();

    public abstract void moveTo();

    public static int getCountOfHeroes(){
        return countOfHeroes;
    }

}
