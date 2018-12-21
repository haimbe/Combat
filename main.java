import java.util.Scanner;

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int type1=0;
        int joueurnumber=1;

public int getType1(){
        system.out.println("Création du personnage du Joueur 1");
        system.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2: Rôdeur, 3 : Mage");
        int type1=sc.nextLine();
        if(type1<1||type1>3)
        throw new ChoixDuJoueurMin();
        else
        return type1;}

public int getLevel(){
        system.out.println("Niveau du personnage ?");
        int level=sc.nextLine();
        if(level<1||level>100)
        throw new ChoixDuLevel();
        else
        return level;}

public int getStrength(){
        system.out.println("Force du personnage ?");
        int strength=sc.nextLine();
        if(level<0||level>100)
        throw new ChoixDuReste();
        else
        return strength;}

public int getAgility(){
        system.out.println("Agilité du personnage ?");
        int agility=sc.nextLine();
        if(agility<0||agility>100)
        throw new ChoixDuReste();
        else
        return agility;}

public int getIntelligence(){
public int getAgility(){
        system.out.println("Intelligence du personnage ?");
        int intelligence=sc.nextLine();
        if(intelligence<0||intelligence>100)
        throw new ChoixDuReste();
        else
        return intelligence;}

        switch(type1){
        case 1:guerrier(int joueurnumber,level,life,strength,agility,intelligence);
        Joueur p1=new guerrier();
        break;
        case 2:rodeur(int joueurnumber,level,life,strength,agility,intelligence);
        Joueur p1=new rodeur();
        break;
        case 3:mage(int joueurnumber,level,life,strength,agility,intelligence);
        Joueur p1=new mage();
        }
        }
        int level1=this.level;
        int strength1 = this.strength;
        int agility1 = this.agility;
        int intelligence1 = this.intelligence;
        int life1 = this.level*5;



        int type2=0;
        int joueurnumber=2;

public int getType2(){
        system.out.println("Création du personnage du Joueur 2");
        system.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2: Rôdeur, 3 : Mage");
        int type1=sc.nextLine();
        if(type2<1||type2>3)
        throw new ChoixDuJoueurMin();
        else
        return type2;}

public int getLevel(){
        system.out.println("Niveau du personnage ?");
        int level=sc.nextLine();
        if(level<1||level>100)
        throw new ChoixDuLevel();
        else
        return level;}

public int getStrength(){
        system.out.println("Force du personnage ?");
        int strength=sc.nextLine();
        if(level<0||level>100)
        throw new ChoixDuReste();
        else
        return strength;}

public int getAgility(){
        system.out.println("Agilité du personnage ?");
        int agility=sc.nextLine();
        if(agility<0||agility>100)
        throw new ChoixDuReste();
        else
        return agility;}

public int getIntelligence(){
public int getAgility(){
        system.out.println("Intelligence du personnage ?");
        int intelligence=sc.nextLine();
        if(intelligence<0||intelligence>100)
        throw new ChoixDuReste();
        else
        return intelligence;}

        switch(type2){
        case 1:guerrier(int joueurnumber,level,life,strength,agility,intelligence);
        Joueur p2=new guerrier();
        break;
        case 2:rodeur(int joueurnumber,level,life,strength,agility,intelligence);
        Joueur p2=new rodeur();
        break;
        case 3:mage(int joueurnumber,level,life,strength,agility,intelligence);
        Joueur p2=new mage();
        }
        }
        int level2=this.level;
        int strength2 = this.strength;
        int agility2 = this.agility;
        int intelligence2 = this.intelligence;
        int life2 = this.level*5;


}