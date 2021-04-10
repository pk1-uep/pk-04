package pl.pk.edu.service;

import java.util.Scanner;

public class ReadService {

    private static Scanner console = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        String line = console.nextLine();
        return line;
    }

    public static double readDouble(String prompt) {
        while (true) {
            String line = readString(prompt);
            try {
                double value = Double.parseDouble(line);
                return value;
            }
            catch (Exception ex) {
                System.out.println("Błąd! To nie jest liczba.");
            }
        }
    }

    public static int readInt(String prompt) {
        while (true) {
            String line = readString(prompt);
            try {
                int value = Integer.parseInt(line);
                return value;
            }
            catch (Exception ex) {
                System.out.println("Błąd! To nie jest liczba całkowita.");
            }
        }
    }

}
