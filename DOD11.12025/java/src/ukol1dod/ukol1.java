package ukol1dod;

import java.util.Scanner;

public class ukol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Včera se ");
        //vše v cm
        System.out.print(" 1: Kolik myslíš že měl výšku zloděj ?  ");
        int a = sc.nextInt();
        System.out.println(" Myslím, že měl výšku kolem " + a);
        System.out.println("Dobře pošli jsem dalšího svědka");
        System.out.println("2:Kolik odhadem měl výšku zlodej  ");
        int b = sc.nextInt();
        System.out.println("Vím to přesně měl " + b);
        System.out.println("Zajímavé no nic pošli jsem dalšího");
        System.out.println("3: Dobrý den!");
        System.out.println("Dobry den, chtěl bych se vás zeptat přibližně jakou výšku měl protivník ? ");
        int c = sc.nextInt();
        System.out.println("Myslím si že měl výšku kolem 170, ale ne počkat měl výšku  " + c);
        System.out.println("Dobře moc nám to pomohlo");
        System.out.println("Můžete jít a poslat dalšího ");
        System.out.println("4:Nazdaaaar");
        System.out.println("Dobrý den posadtě se chtěl bycch vám položit otázku");
        System.out.println(":4: No povídejte detektive");
        System.out.println("Jakou přibližně měl výšku zloděj");
        int d = sc.nextInt();
        System.out.println(" Protivník měl výšku " + d + " Musím jít čus ");
        System.out.println(" Na shledanou. Pošlete dalšího ");
        System.out.println("5: Dobrý den, nemám moc času tak rychle ");
        System.out.println(" Jasně posadtě se a řekně te mi jakou přibližou výšku měl protivník ");
        int e = sc.nextInt();
        System.out.println("Výška byla kolem " + e);
        System.out.println("Můžu už jít docela spěchám ");
        int f = 0;
        if (a == 0 && b == 0 && d == 0 && e == 0) {
            System.out.println("Výška protivníka němůže být 0 ");
        } else {
            f = (a + b + c + d + e)/5;
        }
        System.out.println("číslo 1 mezi kolika hodinami se stal zločin zadej to vr smysli hodina,minuta");
        double g = sc.nextDouble();
        System.out.println("1: Myslím si že se zložin stal " + g);

        if (g < 10 || g > 15) {
            System.out.println("Tomu nevěřím ");

        } else {
            System.out.println("V pořádku vyčkejte venku ");
        }
        System.out.println("Můžete poslat 2");
        System.out.println("Dvojko mezi jakými časy se stal čin ");
        double   h = sc.nextDouble();
        System.out.println("2: čin se určitě stal v " + h);
        if (h < 10 || h > 15) {
            System.out.println("Tomu nevěřím ");

        } else {
            System.out.println("Vyčkejte venku a pošlete dalšího ");
        }
        System.out.println(" čislo 3 stejná otazka ");
        double   i = sc.nextDouble();
        if (i < 10 || i > 15) {
            System.out.println("Tomu nevěřím ");

        } else {
            System.out.println("V pořádku vyčkejte venku ");
        }
        System.out.println(" čislo 4 stejná otazka ");
        double j = sc.nextDouble();
        if (j < 10 || j > 15) {
            System.out.println("Tomu nevěřím ");

        } else {
            System.out.println("V pořádku vyčkejte venku ");
        }
        System.out.println(" čislo 5 stejna otazka");
        double k = sc.nextDouble();
        if (k < 10 || k > 15) {
            System.out.println("Tomu nevěřím ");

        } else {
            System.out.println("V pořádku vyčkejte venku ");
        }
        System.out.println("Vyber svědka, který půjde na výslech");
        int po = sc.nextInt();
        switch (po) {
            case(1):
                System.out.println("Svědek číslo 1");

                break   ;
            case(2):

                    System.out.println("Svědek číslo 2");

                    break;
                    case(3):
                        System.out.println("Svědek čílo 3");

                        break;
            case(4):
                System.out.println("Svědek číslo 4");

                break   ;

            case(5):
                System.out.println("svědek číslo 5");

                break;
            default:
                System.out.println("Ani jeden svědek neexistuje");
        }




        System.out.println("Svědek číslo " + po +" chtěl bych vám položit otázku ohledně podezřelého ");
        System.out.println("Jaké měl pachatel vlasy tmavé světlé zrzavé....");
        String m = sc.next();
        int count = 0;
        if (m.equals("světlé")) {
            count++;
        }
        System.out.println("měl pachatel brýle ano/ne ");
        String n = sc.next();
        if (n.equals("ano")) {
            count++;
        } else if (n.equals("ne")) {
            System.out.println("dobře a poslední otazka");
        }
        System.out.println("jakou měl barvu očí modra,zelena,ruzova");
        String s = sc.next();
        if (s.equals("modra")) {
            count++;

        }
        System.out.println("Dobře děkuji za odpovědi ");
        if (count == 3) {
            System.out.println("Hmm trojka řekla pravdu");
        }
        if (count == 2) {
            System.out.println("Jednou zalhal");
        }
        if (count == 1) {

            System.out.println("Nedá se mu věřit");
        }
        if (count == 0) {
            System.out.println("zalhal mi ve všem myslím jsi že to spáchal");
        }
        System.out.println("číslo "+ po +" co to máš v kapse ");
        System.out.println(po +": niccc ");
        System.out.println("To je ukradený kámen ma barvu");
        System.out.println("D:");
        System.out.println("cerveny,modry,zeleny,jiny");
        String y = sc.next();
        if (y.equalsIgnoreCase("cerveny")) {
            System.out.println(" To je rubím");
        }
        if (y.equalsIgnoreCase("modry")) {
            System.out.println("To je safír");
        }
        if (y.equalsIgnoreCase("zeleny")) {
            System.out.println("To je smaragd");
        }
        if (y.equalsIgnoreCase("jiny")) {
            System.out.println("Co to je, že by nuklearní kámen ?");
        }

        System.out.println("Rozhodl jsem se vím kdo to udělal číslo "+po +" a 5 do kabinetu ");
        System.out.println("číslo "+ po + " řekni mi v kolik hodin jsi tady byl hodna,minuta");
        double z = sc.nextDouble();
        System.out.println("číslo 5 v kolik jsi tam byl hodina/minuta ");
        double we = sc.nextDouble();
        if (we == z) {
            System.out.println(" Spáchali jste to společně ");
        }
        if (we < z) {
            System.out.println("čílo 5 to spáchalo ");
        }
        if (z < we) {
            System.out.println(" číslo "+po +" to spáchalo ");
        }
        System.out.println("máte právo nevypovídat vše co povíte bude použito proti vám a odveď te ho ");
        System.out.println("Zloděj měl přibližnou výšku " + f + " což odpovídá vám");


    }
}