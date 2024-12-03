import java.util.Scanner;

public class test {
    private static final int numero_carte_valide =791320;
    private static final int code_secret_valide = 1963;
    private static final int max_tentatives = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentatives =max_tentatives ;

        while (tentatives-- > 0) {
            if (verifierAcces(scanner)) {
                System.out.println("Accès accepté");
                return;
            }
            System.out.println("non autorise. Tentatives restantes : " + tentatives);
        }

        System.out.println(" impossible.");
    }

    private static boolean verifierAcces(Scanner scanner) {

        System.out.print("Numéro de carte : ");
        int numero = scanner.nextInt();

        System.out.print("Code secret : ");
        int code = scanner.nextInt();

        return numero == numero_carte_valide && code == code_secret_valide;
    }
}

