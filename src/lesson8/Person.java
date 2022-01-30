package lesson8;

public abstract class Person {
    private String name;
    private int age;
    private double deposit;
    private String status;

    public Person(){
        this.name = "Без имени";
        this.deposit = 0;
        setStatus();
    }

    public Person(String name, int age, double deposit) {
        this.name = name;
        this.age = age;
        this.deposit = deposit;
        setStatus();
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        if (this.deposit >= 1000000) {
            this.status = "VIP";
        } else {
            this.status = "NOVIP";
        }
    }

    public abstract void sendLetter();
}
