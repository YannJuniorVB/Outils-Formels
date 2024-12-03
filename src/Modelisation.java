public class Modelisation {
    public enum Etat{
        VerificationCode ,Acces_Accepte , Verification, Acces,  Acces_Refuser,Alarme

    }
    private Etat etatcurant;
    private Specification specification;
    public Modelisation(Etat etatcurant ){
        this.etatcurant=Etat.Verification;

    }
    public Etat getEtatcurant(){
        return etatcurant;
    }
    public void Verification (){
        if (Specification.Acces_Accepte()){
            this .etatcurant=Etat.Acces_Accepte;
        }else{
            this .etatcurant=Etat.Acces_Refuser;
        }
    }
    public void alarme (){
        this.etatcurant=Etat.Alarme;
    }
}