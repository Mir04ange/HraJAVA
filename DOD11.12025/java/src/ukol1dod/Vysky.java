package ukol1dod;

public class Vysky {
    private final int[] hodnoty;

    public Vysky(int[] hodnoty) {
        this.hodnoty = hodnoty == null ? new int[0] : hodnoty.clone();
    }

    public int prumer() {
        if (hodnoty.length == 0) {
            return 0;
        }

        long soucet = 0L;
        for (int vyska : hodnoty) {
            soucet += vyska;
        }
        return (int) (soucet / hodnoty.length);
    }
}