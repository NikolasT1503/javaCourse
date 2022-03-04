package lesson12;

public class Person {
    private String fio;
    private int age;
    private int yearBirthday;

    public Person(String fio, int age, int yearBirthday) {
        this.fio = fio;
        this.age = age;
        this.yearBirthday = yearBirthday;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", yearBirthday=" + yearBirthday +
                '}';
    }
}
