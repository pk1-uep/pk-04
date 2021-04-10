package pl.pk.edu.service;

import pl.pk.edu.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EduService {

    private List<Student> students = new ArrayList<>();

    public void insertStudents() {
        while (true) {
            String name = ReadService.readString("Imię i nazwisko: ");
            if (name.equals("")) {
                break;
            }
            double grade = ReadService.readDouble("Ocena: ");

            try {
                Student s = new Student(name, grade);
                students.add(s);
            }
            catch (Exception ex) {
                String msg = ex.getMessage();
                System.out.println(msg);
            }
        }
    }

    public void insertStudent(Student s) {
        students.add(s);
    }

    public int getCount() {
        //int count = students.size();
        //return count;

        return students.size();     // wersja skrócona
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public double getAvg() {
        if (isEmpty()) {
            return 0;
        }

        double sum = 0.0;
        for (Student s : students) {
            double grade = s.getGrade();
            sum = sum + grade;
        }
        int count = getCount();
        double avg = sum / count;
        return avg;
    }

    public void rankByGrade() {
        students.sort(
                Comparator.comparing(Student::getGrade).reversed()
        );
    }

    public void printData() {
        System.out.println("Lista studentów");
        int i = 1;
        for (Student s : students) {
            System.out.println(i + ". " + s.getName() + " - ocena: " + s.getGrade());
            i++;
        }
        System.out.println();
    }

}
