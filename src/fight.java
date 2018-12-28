package Combat;

import java.util.Scanner;


public class fight extends joueur{

    int fightnb = 0;

    public fight(joueur p1 , joueur p2) throws ChoixDeLattaque {
        Scanner sc = new Scanner (System.in);
        System.out.println("Joueur 1 ("+p1.getLife()+" de vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale");
        int fightnb=sc.nextInt();

        if (this.fightnb<1 || this.fightnb>2)
            throw new ChoixDeLattaque();

        else
        p1.getType1();

        switch (this.getType1() && this.fightnb){
            case 1 && 1 : p2.setLife = p2.getLife()-p1.guerrier.basique();
                          p1.guerrier.basique();
                          break;
            case 1 && 2 : p2.setLife = p2.getLife()-p1.guerrier.speciale();
                          p1.setLife = p1.getLife/2;
                          p1.guerrier.speciale();
                          break;
            case 2 && 1 : p2.setLife = p2.getLife()-p1.rodeur.basique();
                          p1.rodeur.basique();
                          break;
            case 2 && 2 : p1.setAgility = p1.getAgility()+p1.rodeur.speciale();
                          p1.rodeur.speciale();
                          break;
            case 3 && 1 : p2.setLife = p2.getLife()-p1.mage.basique();
                          p1.mage.basique();
                          break;
            case 3 && 2 : p1.setLife = p1.mage.speciale();
                          p1.guerrier.speciale();
                          break;

        if (p2.getLige()<1)
            System.out.println("Joueur 2 est mort");
            System.out.println("Joueur 2 a perdu");
        }

    }

    public fight(joueur p2 , joueur p1) throws ChoixDeLattaque {
        Scanner sc = new Scanner (System.in);
        System.out.println("Joueur 2 ("+p2.getLife()+" de vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale");
        int fightnb=sc.nextInt();

        if (this.fightnb<1 || this.fightnb>2)
            throw new ChoixDeLattaque();

        else
        p2.getType1();

        switch (this.getType1() && this.fightnb){
            case 1 && 1 : p1.setLife = p1.getLife()-p2.guerrier.basique();
                p2.guerrier.basique();
                break;
            case 1 && 2 : p1.setLife = p1.getLife()-p2.guerrier.speciale();
                p2.setLife = p2.getLife/2;
                p2.guerrier.speciale();
                break;
            case 2 && 1 : p1.setLife = p1.getLife()-p2.rodeur.basique();
                p2.rodeur.basique();
                break;
            case 2 && 2 : p2.setAgility = p2.getAgility()+p2.rodeur.speciale();
                p2.rodeur.speciale();
                break;
            case 3 && 1 : p1.setLife = p1.getLife()-p2.mage.basique();
                p2.mage.basique();
                break;
            case 3 && 2 : p1.setLife = p2.mage.speciale();
                p2.guerrier.speciale();
                break;

            if (p1.getLige()<1)
                System.out.println("Joueur 1 est mort");
            System.out.println("Joueur 1 a perdu");
        }

    }
}