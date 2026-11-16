package ukol1dod;

import java.util.Scanner;

public class CasovyVyslech {
    private final Scanner sc;

    public CasovyVyslech(Scanner sc) {
        this.sc = sc;
    }

    public void proved() {
        for (int svedek = 1; svedek <= 5; svedek++) {
            if (svedek == 1) {
                System.out.println("Číslo 1, mezi kolika hodinami se stal zločin? Zadej hodinu a minutu.");
            } else if (svedek == 2) {
                System.out.printf("Můžete poslat 2%nDvojko, mezi jakými časy se stal čin?%n");
            } else {
                System.out.printf("Číslo %d, stejná otázka.%n", svedek);
            }

            double cas = sc.nextDouble();
            if (svedek == 1) {
                System.out.println("1: Myslím si, že se zločin stal " + cas);
            } else if (svedek == 2) {
                System.out.println("2: Čin se určitě stal v " + cas);
            }

            if (cas < 10 || cas > 15) {
                System.out.println("Tomu nevěřím.");
            } else if (svedek == 2) {
                System.out.println("Vyčkejte venku a pošlete dalšího.");
            } else {
                System.out.println("V pořádku, vyčkejte venku.");
            }
        }
    }
}
