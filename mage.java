public abstract class mage extends joueur{

    int dommage;
    string name;
    int life;

    int level,life,strength,agility,intelligence=0

    public String mage(int joueurnumber,level,life,strength,agility,intelligence){
        String str = "Abracadabra je suis le "+ this.getClass() + "joueur"+ joueurnumber " niveau " + this.level + " je possède " + this.life + " de vitalité, " + this.strength + " de force, " + this.agility + " d'agilité et "
                + this.intelligence + " d'intelligence !"}

    public basique(int intelligence){
        this.intelligence = dommage;
        name = "Boule de Feu";
    }

    public speciale(int level, intelligence){
        this.intelligence*2 + life = life;
        name = "Soin";
    }

}