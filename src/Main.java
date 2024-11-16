import java.util.Scanner;
public class Main {
    private static final int[] CHIFFRES_ARABES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] CHIFFRES_ROMAINES = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String enRoman(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < CHIFFRES_ARABES.length; i++) {
            while (number >= CHIFFRES_ARABES[i]) {
                result.append(CHIFFRES_ROMAINES[i]);
                number -= CHIFFRES_ARABES[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            System.out.print("Entrez un numero entre 1 et 3999 (pour terminer la session tapez 0): ");
            number = scanner.nextInt();
            if (number > 0 && number <= 3999) {
                System.out.println("Le resultat de convertission: " + enRoman(number));
            } else if (number > 3999 || number < 0) {
                System.out.println("Le numero doit etre entre 1 et 3999");
            } else {
                System.out.print("La fin de la session");
            }
        }
    }
}