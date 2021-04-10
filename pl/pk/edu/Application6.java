package pl.pk.edu;

import pl.pk.edu.service.CreateService;
import pl.pk.edu.service.EduService;

public class Application6 {

    public static void main(String[] args) {
        EduService edu = new EduService();
        CreateService.insertData(edu);

        if (edu.isEmpty()) {
            System.out.println("Brak danych - koniec pracy");
            return;
        }

        int count = edu.getCount();
        double avg = edu.getAvg();

        System.out.println("Liczba studentów: " + count);
        System.out.println("Srednia ocen: " + avg);

        edu.rankByGrade();
        edu.printData();
    }

}
