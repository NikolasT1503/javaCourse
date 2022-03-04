package lesson11;

import java.util.*;

public class Main {
    private static int choice;
    public static void main(String[] args) {
        Comparator<Student> studentComparator = new StudentAgeCompare().thenComparing(new StudentFIOCompare());
        TreeSet<Student> students = new TreeSet<>(studentComparator);
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите пункт меню");
        students.add(new Student(1,"Иванов Иван Иванович", 20, "637-1", Subject.MATH));
        students.add(new Student(2, "Петров Петр Петрович", 21, "637-2", Subject.GEOMETRY));
        students.add(new Student(3, "Иванов Иван Петрович", 22, "537-1", Subject.ENGLISH));
        students.add(new Student(4, "Сидоров Петр Иванович", 19, "537-1", Subject.LITERATURE));

        while (choice!=5){
            System.out.println("1. Ввести студента");
            System.out.println("2. Вывести всех учеников по возрасту по возрастанию");
            System.out.println("3. Вывести всех учеников по возрасту по убыванию");
            System.out.println("4. Удалить ученика по индексу");
            System.out.println("5. Выход");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите данные студента:");
                    System.out.println("Введите идентификатор студента");
                    int idStudent = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Введите ФИО:");
                    String fioStudent = sc.nextLine();
                    System.out.println("Введите возраст:");
                    int ageStudent = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Введите группу студента:");
                    String groupStudent = sc.nextLine();
                    System.out.println("Выберите любимый предмет студента - нажмите соответствующуу цифру:");
                    System.out.println("1. Математика");
                    System.out.println("2. Геометрия");
                    System.out.println("3. Английский");
                    System.out.println("4. Литература");
                    int subjectStudent = sc.nextInt();
                    for (Student student : students) {
                        if (student.getId()==idStudent) {
                            System.out.println("Студент с таким id уже существует");;
                            break;
                        }
                    }
                    switch (subjectStudent) {
                        case 1: students.add(new Student(idStudent, fioStudent, ageStudent, groupStudent, Subject.MATH));
                        case 2: students.add(new Student(idStudent, fioStudent, ageStudent, groupStudent, Subject.GEOMETRY));
                        case 3: students.add(new Student(idStudent, fioStudent, ageStudent, groupStudent, Subject.ENGLISH));
                        case 4: students.add(new Student(idStudent, fioStudent, ageStudent, groupStudent, Subject.LITERATURE));
                        default: students.add(new Student(idStudent, fioStudent, ageStudent, groupStudent, Subject.MATH));
                    }
                    break;
                case 2:
                    System.out.println(students);
                    break;
                case 3:
                    System.out.println(students.descendingSet());
                    break;
                case 4:
                    System.out.println(students);
                    System.out.println("Введите id студента для удаления:");
                    int id = sc.nextInt();
                    for (Student student : students) {
                        if (student.getId()==id) {
                            students.remove(student);
                            break;
                        }
                    }
                    System.out.println(students);
                    break;
                case 5:
                    break;
                default:
                    break;
            }

        }

    }
}

class StudentAgeCompare implements Comparator<Student> {
    public int compare (Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}

class StudentFIOCompare implements  Comparator<Student> {
    public int compare (Student s1, Student s2) {
        return s1.getFio().compareTo(s2.getFio());
    }
}
