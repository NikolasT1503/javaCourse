package lesson12;

public class Student {
    private String fio;
    private int age;
    private String group;

    public Student(String fio, int age, String group) {
        this.fio = fio;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
