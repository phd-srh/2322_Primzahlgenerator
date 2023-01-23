import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Startwert ein: ");
        int startwert = eingabe.nextInt();
        System.out.print("Bitte geben Sie die Anzahl ein: ");
        int anzahl = eingabe.nextInt();

        Primzahlgenerator pg = new Primzahlgenerator(startwert);
        for (int i=0; i<anzahl; i++) {
            System.out.println( pg.generiere() );
        }
    }
}
