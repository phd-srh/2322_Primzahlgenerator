public class Primzahlgenerator {
    private int startwert;

    public Primzahlgenerator(int startwert) {
        this.startwert = startwert;
    }

    public boolean prüfeAufPrimzahl(int zahl) {
        for (int teiler=2; teiler<zahl; teiler++) {
            int rest = zahl % teiler;
            if (rest == 0) return false;
        }
        return true;
    }

    // gibt die nächste Primzahl zurück
    public int generiere() {
        do {
            startwert++;
        }
        while ( ! prüfeAufPrimzahl(startwert) );
        return startwert;
    }
}
