package ukol1dod;

import java.util.Scanner;

public class Rozuzleni {
    private final Scanner sc;

    public Rozuzleni(Scanner sc) {
        this.sc = sc;
    }

    public void proved(int svedek, int prumernaVyska) {
        System.out.printf("Rozhodl jsem se, vím, kdo to udělal: číslo %d a 5 do kabinetu.%nČíslo %d, řekni mi, v kolik hodin jsi tady byl?%n", svedek, svedek);
        double casSvedka = sc.nextDouble();
        System.out.println("Číslo 5, v kolik jsi tam byl?");
        double casPateho = sc.nextDouble();

        if (casPateho == casSvedka) {
            System.out.println("Spáchali jste to společně.");
        } else if (casPateho < casSvedka) {
            System.out.println("Číslo 5 to spáchalo.");
        } else {
            System.out.printf("Číslo %d to spáchalo.%n", svedek);
        }

        System.out.printf("Máte právo nevypovídat. Vše, co povíte, bude použito proti vám. Odveďte ho.%nZloděj měl přibližnou výšku %d cm.%n", prumernaVyska);
    }
}
