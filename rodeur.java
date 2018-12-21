public abstract class rodeur extends joueur{

    int dommage;
    string name;

    int level,life,strength,agility,intelligence=0

    public String rodeur(int joueurnumber,level,life,strength,agility,intelligence){
        String str = "Youhou je suis le "+ this.getClass() + "joueur"+ joueurnumber " niveau " + this.level + " je possède " + this.life + " de vitalité, " + this.strength + " de force, " + this.agility + " d'agilité et "
                + this.intelligence + " d'intelligence !"}

    public basique(int agility){
        this.agility = dommage;
        name = "Tir à l'Arc";
    }

    public speciale(int level, agility){
        this.level/2 + agility = agility;
        name = "Concentration";
    }

}