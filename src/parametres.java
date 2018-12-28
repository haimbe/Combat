package Combat;

import java.util.Scanner;

public class parametres extends joueur {

int playerNumber=0;
int type1=0;
String joueurNom=p0;

public static parametres(int playerNumber, String joueurNom){

public static int getType1(this.playerNumber)throws ChoixDuJoueurMin{
        System.out.println("Création du personnage du Joueur "+playerNumber);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2: Rôdeur, 3 : Mage");
        int type1=sc.nextInt();

        if(type1< 1||type1>3){
        throw new ChoixDuJoueurMin();
        }

        return type1;
        }

public static int getLevel()throws ChoixDuLevel{
        System.out.println("Niveau du personnage ?");
        // sc.nextLine() -> new String ret = laStringActuelle; -> return ret;
        // sc.nextInt() -> new Integer ret = laStringActuelleCommeUnChiffre; -> return
        // ret;
        int level=sc.nextInt();
        if(level< 1||level>100)
        throw new ChoixDuLevel();
        return level;
        }

public static int getStrength() throws ChoixDuReste {
                System.out.println("Force du personnage ?");
                try {
                        int strength = sc.nextInt();

                        if (strength < 0 || strength > 100)
                                throw new ChoixDuReste();
                        else
                                return strength;
                } catch (Exception e) {
                        return getStrength();
                }
        }
public static int getAgility() throws ChoixDuReste {
        System.out.println("Agilité du personnage ?");
        int agility = sc.nextInt();
        if (agility < 0 || agility > 100)
        throw new ChoixDuReste();
        return agility;
        }

public static int getIntelligence() throws ChoixDuReste {
        System.out.println("Intelligence du personnage ?");
        int intelligence=sc.nextLine();
        if(intelligence<0||intelligence>100)
        throw new ChoixDuReste();
        else
        return intelligence;}

        return life=level*5;

public static joueur createJoueur(this.type1, this.joueurNom) throws TotalParam {
                if ((strength + agility + intelligence) > level)
                        throw new TotalParam();
                else {

                        switch (type1) {
                                case 1:
                                        joueur joueurNom = new guerrier( int level, int life, int strength, int agility, int intelligence, int playerNumber);
                                        guerrierToString();
                                        break;
                                case 2:
                                        joueur joueurNom = new rodeur( int level, int life, int strength, int agility, int intelligence, int playerNumber);
                                        rodeurToString();
                                        break;
                                case 3:
                                        joueur joueurNom = new mage( int level, int life, int strength, int agility, int intelligence, int playerNumber);
                                        mageToString();
                        }

                }
        }





        }

