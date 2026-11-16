package ukol1dod;

import java.util.Scanner;

public class VyslechVysky {
    private final Scanner sc;

    public VyslechVysky(Scanner sc) {
        this.sc = sc;
    }

    public Vysky proved() {
        System.out.println("Včera se všechno rozkradlo");
        System.out.print("1: Kolik myslíš, že měl zloděj na výšku? ");
        int a = sc.nextInt();
        System.out.printf("Myslím, že měl výšku kolem %d%nDobře, pošli sem dalšího svědka.%n2: Kolik odhadem měl zloděj na výšku?%n", a);
        int b = sc.nextInt();
        System.out.printf("Vím to přesně, měl %d%nZajímavé, no nic, pošli sem dalšího.%n3: Dobrý den!%nDobry den, chtěl bych se vás zeptat, přibližně jakou výšku měl protivník?%n", b);
        int c = sc.nextInt();
        System.out.printf("Myslím si, že měl výšku kolem 170, ale ne, počkat, měl výšku %d%nDobře, moc nám to pomohlo.%nMůžete jít a poslat dalšího.%n4: Nazdaaaar%nDobrý den, posaďte se, chtěl bych vám položit otázku.%n4: No povídejte, detektive.%nJakou přibližně měl výšku zloděj?%n", c);
        int d = sc.nextInt();
        System.out.printf("Protivník měl výšku %d. Musím jít, čus.%nNa shledanou. Pošlete dalšího.%n5: Dobrý den, nemám moc času, tak rychle.%nJasně, posaďte se a řekněte mi, jakou přibližnou výšku měl protivník.%n", d);
        int e = sc.nextInt();
        System.out.printf("Výška byla kolem %d%nMůžu už jít? Docela spěchám.%n", e);
        return new Vysky(new int[] {a, b, c, d, e});
    }
}
