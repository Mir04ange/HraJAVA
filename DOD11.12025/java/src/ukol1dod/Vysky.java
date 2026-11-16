package ukol1dod;

public class Vysky {
    private final int[] hodnoty;

    public Vysky(int[] hodnoty) {
        this.hodnoty = hodnoty.clone();
    }

    public int prumer() {
        int soucet = 0;
        for (int vyska : hodnoty) {
            soucet += vyska;
        }
        return soucet / hodnoty.length;
    }
}
