package combat;

import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

public class main {
    public static Scanner sc = new Scanner(System.in);

    joueur p1 = createJoueur(getType1(1));
    try{
    parametres(1,p1);
    joueur p2 = createJoueur(getType1(2));
    parametres(2,p2);}
    catch (ChoixDuReste | ChoixDuLevel | ChoixDuJoueurMin | TotalParam e){ }

    public static void fight(joueur p1, joueur p2) {

        try {

            for (int i = 0; p1.getLife() > 0 && p2.getLife() > 0; i++) {
                if (i % 2 == 0)
                    damageFunction(p1, p2);
                else
                    damageFunction(p2, p1);
            }
        } catch (ChoixDeLattaque e2){}
    }



