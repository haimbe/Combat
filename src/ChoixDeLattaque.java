package combat;

class ChoixDeLattaque extends Exception{
    public ChoixDeLattaque(){
        System.out.println("Il faut choisir le chiffre soit 1, soit 2");
    }
}