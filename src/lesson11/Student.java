package lesson11;

import java.util.Comparator;

public class Student {
    private String fio;
    private int age;
    private String group;
    Subject subject;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Student(int id, String fio, int age, String group, Subject subject){
        this.id = id;
        this.subject = subject;
        this.fio = fio;
        this.age = age;
        this.group = group;
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", subject=" + subject +
                '}';
    }
}
