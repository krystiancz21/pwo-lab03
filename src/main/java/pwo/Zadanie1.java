package pwo;

import java.math.BigDecimal;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "fibseq100.txt";
    public static final String FILE_NAME_Z2 = "lucas100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(
                new FibonacciGenerator(), FROM, TO, FILE_NAME);

        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }

        System.out.println("Lucas - wersja 1");
        boolean ok2 = SequenceTools.writeToFileLucas(
                new LucasGenerator(), FROM, TO, FILE_NAME_Z2);

        if (ok2) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME_Z2);
        } else {
            System.out.println("Błąd");
        }
        
    }
}
