package combat;

public abstract class mage extends joueur{

    int dommage;
    string name;
    int life;
    int life2;

    int level,life,strength,agility,intelligence,nbJoueur;

    public rodeur() {
        level = 0;
        life = 0;
        strength = 0;
        agility = 0;
        intelligence = 0;
        nbJoueur = 0 ;
        life2 = 0 ;
    }

    public rodeur(int level, int life, int strength, int agility, int intelligence, int nbJoueur) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.nbJoueur = nbJoueur;
    }

    public String mageToString(){
        String str = "Abracadabra je suis le "+ this.getClass() + "joueur"+ nbJoueur " niveau " + this.level + " je possède " + this.life + " de vitalité, " + this.strength + " de force, " + this.agility + " d'agilité et "
                + this.intelligence + " d'intelligence !"};

    public basique(){
        this.name = "Boule de Feu";
        System.out.println("Joueur " + this.nbJoueur + " utilise " + this.name + " et inflige " + this.intelligence + " dommages.");
        if (this.nbJoueur==1)
            system.out.println("Joueur 2 perd "+ this.intelligence +" points de vie");
        else
            system.out.println("Joueur 1 perd "+ this.intelligence +" points de vie");

        return this.intelligence;
    }

    public speciale(){
        this.life2 = this.intelligence*2 + this.life;
        this.name = "Soin";
        System.out.println("Joueur " this.nbJoueur + " utilise " + this.name + " et gagne "+ this.intellignece*2 + "en vitalité mais au total, vous êtes limité à "+ this.life + " de vitalité.");
        if(this.life2>this.life){
            return this.life;}
        else
            this.life=this.life2;
            return this.life;
        }

    }

