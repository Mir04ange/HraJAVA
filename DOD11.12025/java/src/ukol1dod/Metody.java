package ukol1dod;

import java.util.Scanner;

public class Metody {
    public void spust() {
        Scanner sc = new Scanner(System.in);
        Vysky vysky = new VyslechVysky(sc).proved();
        new CasovyVyslech(sc).proved();
        int svedek = new VyslechSvedka(sc).proved();
        new Rozuzleni(sc).proved(svedek, vysky.prumer());
    }
}
