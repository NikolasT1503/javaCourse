package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        CheckAge ca = b -> b >=17 && b <40;


        List<Person> persons = new ArrayList<>(Arrays.asList(new Person("fio1", 15, 2005),
                new Person("fio2", 30, 1985),
                new Person("fio4", 35, 1980),
                new Person("fio5", 24, 1996),
                new Person("fio3", 45, 1975)));



        ConditionByYearBirthday<Integer> isGroup01 = age -> age < 1995;

        List<Student> students = new ArrayList<>();
        students = convertPersons(persons, ca, isGroup01);
        for (Student student : students)
            System.out.println(student);

    }

    private static List<Student> convertPersons (List<Person> persons, CheckAge ca, ConditionByYearBirthday<Integer> condition) {
        List<Student> studentList = new ArrayList<>();
        for (Person person : persons) {
            if (ca.checkAge(person.getAge())) {
                if (condition.execute(person.getYearBirthday())) {
                    Student tmpStudent = new Student(person.getFio(), person.getAge(), "УбИН-01-22");
                    studentList.add(tmpStudent);
                } else {
                    Student tmpStudent2 = new Student(person.getFio(), person.getAge(), "УбИН-02-22");
                    studentList.add(tmpStudent2);
                }
            }
        }
        return studentList;
    }
}

interface ConditionByYearBirthday<T> {
    boolean execute (T param);
}

interface CheckAge {
    boolean checkAge (int age);
}