package combat;

class ChoixDuReste extends Exception{
    public ChoixDuReste(){
        System.out.println("Il faut choisir un chiffre entre 0 et 100");
    }
}