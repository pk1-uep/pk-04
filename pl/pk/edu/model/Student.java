package pl.pk.edu.model;

import java.util.List;

public class Student {

    private String name;
    private double grade;

    private static List<Double> validGrades = List.of(2.0, 3.0, 3.5, 4.0, 4.5, 5.0);

    // *********************** Constructor ************************
    public Student(String name, double grade) {
        if (! validGrades.contains(grade)) {
            throw new IllegalArgumentException("Błąd: " + grade + " nie jest poprawną oceną!");
        }
        this.name = name;
        this.grade = grade;
    }

    // *********************** Getters & Setters ******************
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

}
