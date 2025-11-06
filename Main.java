package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> lista = new ArrayList<>();

        System.out.print("Ilu studentów chcesz dodać? ");
        int ile = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < ile; i++) {
            System.out.println("\n--- Dodawanie studenta " + (i+1) + " ---");

            System.out.print("Imię: ");
            String imie = scanner.nextLine();

            System.out.print("Nazwisko: ");
            String nazwisko = scanner.nextLine();

            System.out.print("Ocena: ");
            double ocena = scanner.nextDouble();

            System.out.print("Płeć (M/K): ");
            char plec = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Kierunek: ");
            String kierunek = scanner.nextLine();

            Student s = new Student(imie, nazwisko, ocena, plec, kierunek);
            lista.add(s);
        }

        System.out.print("\nPodaj kierunek do obliczenia średniej: ");
        String k = scanner.nextLine();

        Student.SredniaKierunku(k, lista);
    }
}
