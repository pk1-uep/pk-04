package pl.pk.edu;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>();
        grades.add(5.0);
        grades.add(3.5);
        grades.add(2.0);
        grades.add(4.5);

        // List<Double> grades = List.of(5.0, 3.5, 2.0, 4.5);    // utworzenie i inicjalizacja listy w jednym wierszu

        double sum = 0.0;
        for (Double g : grades) {
            System.out.println(g);
            sum = sum + g;
        }
        System.out.println("Liczba ocen: " + grades.size());
        System.out.println("Suma: " + sum);

        double avg = sum / grades.size();
        System.out.println("Srednia: " + avg);
    }

}
