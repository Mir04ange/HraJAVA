package ukol1dod;

import java.util.Scanner;

public class CasovyVyslech {
    private final Scanner sc;

    public CasovyVyslech(Scanner sc) {
        this.sc = sc;
    }

    public void proved() {
        for (int svedek = 1; svedek <= 5; svedek++) {
            String prompt;
            if (svedek == 1) {
                prompt = "Číslo 1, mezi kolika hodinami se stal zločin? Zadej hodinu a minutu: ";
                System.out.println("Číslo 1, mezi kolika hodinami se stal zločin? Zadej hodinu a minutu.");
            } else if (svedek == 2) {
                prompt = "Můžete poslat 2\nDvojko, mezi jakými časy se stal čin? ";
                System.out.printf("Můžete poslat 2%nDvojko, mezi jakými časy se stal čin?%n");
            } else {
                prompt = "Číslo " + svedek + ", stejná otázka: ";
                System.out.printf("Číslo %d, stejná otázka.%n", svedek);
            }

            double cas = InputHelper.nextDouble(sc, prompt);
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