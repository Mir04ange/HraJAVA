package ukol1dod;

import java.util.Scanner;

public class VyslechSvedka {
    private final Scanner sc;

    public VyslechSvedka(Scanner sc) {
        this.sc = sc;
    }

    public int proved() {
        int svedek;
        do {
            System.out.print("Vyber svědka (1–5), který půjde na výslech: ");
            svedek = sc.nextInt();
            if (svedek < 1 || svedek > 5) {
                System.out.println("Takový svědek neexistuje.");
            }
        } while (svedek < 1 || svedek > 5);

        System.out.printf("Svědek číslo %d, chtěl bych vám položit otázku ohledně podezřelého.%nJaké měl pachatel vlasy: tmavé, světlé, zrzavé?%n", svedek);
        int pravdiveOdpovedi = sc.next().equalsIgnoreCase("světlé") ? 1 : 0;

        System.out.println("Měl pachatel brýle? ano/ne");
        if (sc.next().equalsIgnoreCase("ano")) {
            pravdiveOdpovedi++;
        }

        System.out.println("Jakou měl barvu očí: modrá, zelená, růžová?");
        String barvaOci = sc.next();
        if (barvaOci.equalsIgnoreCase("modrá") || barvaOci.equalsIgnoreCase("modra")) {
            pravdiveOdpovedi++;
        }

        System.out.println("Dobře, děkuji za odpovědi.");
        switch (pravdiveOdpovedi) {
            case 3:
                System.out.println("Hmm, trojka řekla pravdu.");
                break;
            case 2:
                System.out.println("Jednou zalhal.");
                break;
            case 1:
                System.out.println("Nedá se mu věřit.");
                break;
            default:
                System.out.println("Zalhal mi ve všem, myslím si, že to spáchal.");
        }

        System.out.printf("Číslo %d, co to máš v kapse?%n%d: Niccc.%nTo je ukradený kámen, má barvu:%nD: červený, modrý, zelený, jiný%n", svedek, svedek);
        switch (sc.next().toLowerCase()) {
            case "cerveny":
            case "červený":
                System.out.println("To je rubín.");
                break;
            case "modry":
            case "modrý":
                System.out.println("To je safír.");
                break;
            case "zeleny":
            case "zelený":
                System.out.println("To je smaragd.");
                break;
            case "jiny":
            case "jiný":
                System.out.println("Co to je, že by nukleární kámen?");
                break;
            default:
                System.out.println("Tuto barvu neznám.");
        }
        return svedek;
    }
}
