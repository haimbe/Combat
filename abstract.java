abstract class joueur{
    protected int level,life,strength,agility,intelligence;

    abstract void basique();
    abstract void speciale();

    public int getLevel() {
        return level;
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