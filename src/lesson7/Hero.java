package lesson7;

public class Hero {
    private int x;
    private int y;
    protected int health;
    protected int strength;
    protected int velocity;
    protected String typeOfHero;
    protected String name;
    private String status;
    private static int countOfHeroes = 0;

    public Hero(){
        this.health = 100;
        this.status = "Здоров"; // Ранен, Умер
        this.x = 0;
        this.y = 0;
        this.strength = 1;
        this.velocity = 1;
        this.name = "Default";
        countOfHeroes++;
    }

    public  Hero(String name, int x, int y){
        this();
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public  Hero(String name, int x, int y, int strength, int velocity){
        this();
        this.x = x;
        this.y = y;
        this.name = name;
        this.strength = strength;
        this.velocity = velocity;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void greetingsHero(){
        System.out.println("Герой " + getName() + " приветствует тебя");
    }

    public void attack(String nameHero){
        System.out.println("Атакую героя " + nameHero);
    };

    public void moveTo(int x, int y){
        System.out.println("Иду к точке: x = " + x + ", y = " + y);
        setX(x);
        setY(y);
    };

    public static int getCountOfHeroes(){
        return countOfHeroes;
    }
}
