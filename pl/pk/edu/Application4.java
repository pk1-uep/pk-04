package pl.pk.edu;

import pl.pk.edu.model.Student;
import pl.pk.edu.service.ReadService;

import java.util.ArrayList;
import java.util.List;

public class Application4 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

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

        if (students.isEmpty()) {
            System.out.println("Brak danych - koniec pracy");
            return;
        }

        double sum = 0.0;
        for (Student s : students) {
            double grade = s.getGrade();
            sum = sum + grade;
        }
        int count = students.size();
        double avg = sum / count;

        System.out.println("Liczba studentów: " + count);
        System.out.println("Srednia ocen: " + avg);
    }

}
