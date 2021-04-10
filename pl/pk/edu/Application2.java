package pl.pk.edu;

import pl.pk.edu.service.ReadService;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>();

        while (true) {
            double g = ReadService.readDouble("Wprowadź ocenę: ");
            if (g == 0) {
                break;
            }
            if (g==2.0 || g == 3.0 || g == 3.5 || g == 4.0 || g == 4.5 || g == 5.0) {
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
    }

}
