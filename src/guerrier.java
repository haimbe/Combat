package combat;

public class guerrier extends joueur{

    int dommage;
    String name;

    int level,life,strength,agility,intelligence,nbJoueur;

    public guerrier() {
        level = 0;
        life = 0;
        strength = 0;
        agility = 0;
        intelligence = 0;
        nbJoueur = 0;
    }

    public guerrier(int level, int life, int strength, int agility, int intelligence, int nbJoueur) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.nbJoueur = nbJoueur;
    }


    public String guerrierToString(){
        String str = "Woarg je suis le "+ this.getClass() + "joueur"+ this.nbJoueur + " niveau " + this.level + " je possède " + this.life + " de vitalité, " + this.strength + " de force, " + this.agility + " d'agilité et "
                + this.intelligence + " d'intelligence !"}

    public int basique(){
        this.name = "Coup d'Epée";
        System.out.println("Joueur "+ this.nbJoueur+ " utilise "+this.name+" et inflige"+this.strength+" dommages.");
        if (this.nbJoueur==1)
            system.out.println("Joueur 2 perd "+this.strength+" points de vie");
            else
            system.out.println("Joueur 1 perd "+this.strength+" points de vie");

            return this.strength;
    }

    public speciale(){
        this.dommage = this.strength*2;
        this.life = this.life/2;
        this.name = "Coup de Rage";
        System.out.println("Joueur"+ this.nbJoueur + " utilise "+this.name+" et inflige"+this.dommage+" dommages.");
        if (this.nbJoueur == 1)
            System.out.println("Joueur 2 perd "+this.dommage+" points de vie");
            System.out.println("Joueur 2 perd "+this.dommage+" points de vie");
        else
            System.out.println("Joueur 1 perd "+this.dommage+" points de vie");

        return this.dommage;
    }

}