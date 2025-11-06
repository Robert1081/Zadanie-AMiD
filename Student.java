package pack;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String imie;
    private String nazwisko;
    private double ocena;
    private char plec;
    private String kierunek;

    private List<Double> oceny = new ArrayList<>();

    public Student(String imie, String nazwisko, double ocena, char plec, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ocena = ocena;
        this.plec = plec;
        this.kierunek = kierunek;

        oceny.add(ocena);

        WyswietlInformacje();
    }

    public void WyswietlInformacje() {
        System.out.println("\n=== Student ===");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Płeć: " + plec);
        System.out.println("Kierunek: " + kierunek);
        System.out.println("Ocena: " + ocena);
    }

    public String getKierunek() {
        return kierunek;
    }

    public double getOcena() {
        return ocena;
    }

    public static double SredniaKierunku(String kierunek, List<Student> studenci) {
        double suma = 0;
        int licznik = 0;

        for (Student s : studenci) {
            if (s.getKierunek().equalsIgnoreCase(kierunek)) {
                suma += s.getOcena();
                licznik++;
            }
        }

        if (licznik == 0) {
            System.out.println("\nBrak studentów na kierunku: " + kierunek);
            return 0;
        }

        double wynik = suma / licznik;
        System.out.println("\nŚrednia ocen na kierunku " + kierunek + ": " + wynik);
        return wynik;
    }
}
