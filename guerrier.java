public abstract class guerrier extends joueur{

    int dommage;
    string name;

    int level,life,strength,agility,intelligence=0


    public String guerrier(int joueurnumber,level,life,strength,agility,intelligence){
        String str = "Woarg je suis le "+ this.getClass() + "joueur"+ joueurnumber " niveau " + this.level + " je possède " + this.life + " de vitalité, " + this.strength + " de force, " + this.agility + " d'agilité et "
                + this.intelligence + " d'intelligence !"}

    public basique(int joueurnumber,int strength){
        this.strength = dommage;
        name = "Coup d'Epée";
        system.out.println("Joueur "+ joueurnumber+ " utilise "+this.name+" et inflige"+this.dommage+" dommages.");
        if (joueurnumber==1)
            system.out.println("Joueur 2 perd "+dommage+" points de vie");
            else
            system.out.println("Joueur 1 perd "+dommage+" points de vie");
    }

    public speciale(int joueurnumber,strength, vitality){
        this.strength*2 = dommage;
        this.vitality/2 = vitality;
        name = "Coup de Rage";
        system.out.println("Joueur"+ joueurnumber+ " utilise "+this.name+" et inflige"+this.dommage+" dommages.");
        if (joueurnumber==1)
            system.out.println("Joueur 2 perd "+dommage+" points de vie");
            system.out.println("Joueur 2 perd "+dommage+" points de vie");
        else
            system.out.println("Joueur 1 perd "+dommage+" points de vie");
    }

}