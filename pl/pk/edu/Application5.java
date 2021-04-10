package pl.pk.edu;

import pl.pk.edu.service.EduService;

public class Application5 {

    public static void main(String[] args) {
        /*
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
        */
        EduService edu = new EduService();
        edu.insertStudents();

        if (edu.isEmpty()) {
            System.out.println("Brak danych - koniec pracy");
            return;
        }

        /*
        double sum = 0.0;
        for (Student s : students) {
            double grade = s.getGrade();
            sum = sum + grade;
        }
        int count = students.size();
        double avg = sum / count;
        */
        int count = edu.getCount();
        double avg = edu.getAvg();

        System.out.println("Liczba studentów: " + count);
        System.out.println("Srednia ocen: " + avg);

        edu.printData();
        edu.rankByGrade();
        edu.printData();
    }

}
