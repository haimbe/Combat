package combat;

class ChoixDuLevel extends Exception{
    public ChoixDuLevel(){
        System.out.println("Il faut choisir un chiffre entre 1 et 100");
    }
}