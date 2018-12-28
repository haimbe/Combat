package combat;

class TotalParam extends Exception{
    public TotalParam(){
        System.out.println("Il faut que la somme de votre force, agilité et intelligence ne dépasse pas votre niveau");
    }
}