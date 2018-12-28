package combat;

public class rodeur extends joueur{

    int dommage;
    string name;

    int level,life,strength,agility,intelligence,nbJoueur;

    public rodeur() {
        level = 0;
        life = 0;
        strength = 0;
        agility = 0;
        intelligence = 0;
        nbJoueur = 0 ;
    }

    public rodeur(int level, int life, int strength, int agility, int intelligence, int nbJoueur) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.nbJoueur = nbJoueur;
    }

    public String rodeurToString(){
        String str = "Youhou je suis le "+ this.getClass() + "joueur"+ this.nbJoueur " niveau " + this.level + " je possède " + this.life + " de vitalité, " + this.strength + " de force, " + this.agility + " d'agilité et "
                + this.intelligence + " d'intelligence !"}

    public basique(){

        this.name = "Tir à l'Arc";
        System.out.println("Joueur "+ this.nbJoueur+ " utilise "+this.name+" et inflige"+this.agility+" dommages.");
        if (this.nbJoueur==1)
            system.out.println("Joueur 2 perd "+this.agility+" points de vie");
        else
            system.out.println("Joueur 1 perd "+this.agility+" points de vie");

        return this.agility;

    }

    public speciale(){
        this.agility = this.level/2 + this.agility;
        this.name = "Concentration";
        System.out.println("Joueur " + this.nbJoueur + " utilise " + this.name + " et gagne " + this.level/2 + " points en agilité.");

        return this.agility;
    }

}