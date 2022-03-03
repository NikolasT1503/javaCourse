package lesson9;

import java.util.Objects;

public class Hero<T> implements Cloneable, Comparable<T>{
    private int x;
    private int y;
    protected int health;
    protected int strength;
    protected int velocity;
    protected String typeOfHero;
    protected String name;
    private String status;
    private static int countOfHeroes = 0;
    private T id;

    public Hero(T id){
        this.health = 100;
        this.status = "Здоров"; // Ранен, Умер
        this.x = 0;
        this.y = 0;
        this.strength = 1;
        this.velocity = 1;
        this.name = "Default";
        this.id = id;
        countOfHeroes++;
    }

    public Hero(T id, String name, int x, int y){
        this(id);
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Hero(T id, String name, int x, int y, int strength, int velocity){
        this(id);
        this.x = x;
        this.y = y;
        this.name = name;
        this.strength = strength;
        this.velocity = velocity;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass()!=o.getClass()) {
            return false;
        }
        Hero h = (Hero) o;
        return this.health == h.health && this.name.equals(h.name) && this.x == h.x && this.y == h.y && this.strength == h.strength && this.velocity == h.velocity && this.status.equals(h.status);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(getName(),getHealth(),getStatus(), getStrength(), getTypeOfHero(), getVelocity(), getX(), getY());
        return 31 * (getX()+getY()) + 11*getName().hashCode();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", health=" + health +
                ", strength=" + strength +
                ", velocity=" + velocity +
                ", typeOfHero='" + typeOfHero + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public Hero clone() throws CloneNotSupportedException {
        return (Hero) super.clone();
    }

    public static int getCountOfHeroes(){
        return countOfHeroes;
    }

    @Override
    public void compareTo(T o) {
        if (this.equals(o)) {
            System.out.println("Совпадают");
        } else {
            System.out.println("Не совпадают");
        }
    }
}
