package pl.pk.edu;

import pl.pk.edu.service.ReadService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application3 {

    public static void main(String[] args) {
        List<Double> validGrades = List.of(2.0, 3.0, 3.5, 4.0, 4.5, 5.0);
        List<Double> grades = new ArrayList<>();

        while (true) {
            double g = ReadService.readDouble("Wprowadź ocenę: ");
            if (g == 0) {
                break;
            }
            if (validGrades.contains(g)) {
                grades.add(g);
            }
            else {
                System.out.println("To nie jest ocena!");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("Brak ocen - koniec pracy");
            return;
        }

        double sum = 0.0;
        for (Double g : grades) {
            sum = sum + g;
        }
        int count = grades.size();
        double avg = sum / count;

        System.out.println("Liczba ocen: " + count);
        System.out.println("Srednia ocen: " + avg);

        Collections.sort(grades);
        for (Double g : grades) {
            System.out.println(g);
        }

    }

}
