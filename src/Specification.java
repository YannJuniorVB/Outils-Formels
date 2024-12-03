public class Specification {
    private boolean VerificationCarte;
    private static boolean VerificationCode;

    public static boolean Acces_Accepte() {
        return Acces_Accepte();
    }

    public boolean AccesAccepte() {
        boolean AccesAccepte;

        if (VerificationCarte && VerificationCode) {
            AccesAccepte = true;
        } else {
            AccesAccepte = false;
        }

        AccesAccepte = false;

        return AccesAccepte;
    }

    public boolean isVerificationCarte() {
        return VerificationCarte;
    }

    public boolean isVerificationCode() {
        return VerificationCode;
    }
}



