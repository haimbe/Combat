package Combat;

abstract class joueur{
    protected int level,life,strength,agility,intelligence, nbJoueur, type1;

    abstract void basique();
    abstract void speciale();

    public void setNbJoueur(int nbJoueur){
        this.nbJoueur = nbJoueur;
    }

    public int getLevel() {
        return level;
    }

    public int getType1() {return type1;}

    public void setLevel (int level){
        this.level = level;
    }

    public void setLife (int life){
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
        }
}