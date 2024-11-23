import java.util.Scanner; // Importe la classe Scanner pour lire les entrées utilisateur depuis la console
public class Main { // Déclare la classe principale appelée "Main"
    private static final int[] CHIFFRES_ARABES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; // Déclare un tableau contenant les valeurs des chiffres arabes correspondants aux chiffres romains
    private static final String[] CHIFFRES_ROMAINES = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; // Déclare un tableau contenant les symboles des chiffres romains en ordre décroissant

    public static String enRoman(int number) { // Déclare une méthode publique et statique qui convertit un entier en un nombre romain
        StringBuilder result = new StringBuilder(); // Crée un objet StringBuilder pour construire efficacement la chaîne de caractères du résultat
        for (int i = 0; i < CHIFFRES_ARABES.length; i++) { // Parcourt les tableaux des chiffres arabes et romains
            while (number >= CHIFFRES_ARABES[i]) { // Tant que le nombre est supérieur ou égal à la valeur actuelle du tableau CHIFFRES_ARABES :
                result.append(CHIFFRES_ROMAINES[i]); // Ajoute le symbole romain correspondant au résultat
                number -= CHIFFRES_ARABES[i]; // Soustrait la valeur arabe correspondante au nombre
            }
        }
        return result.toString(); // Retourne la chaîne contenant le nombre converti en chiffres romains
    }

    public static void main(String[] args) { // Déclare la méthode principale qui sera exécutée au lancement du programme
        Scanner scanner = new Scanner(System.in); // Crée un objet Scanner pour lire les entrées utilisateur
        int number = -1; // Initialise la variable "number" avec une valeur négative pour entrer dans la boucle
        while (number != 0) { // Démarre une boucle qui se termine lorsque l'utilisateur entre 0
            System.out.print("Entrez un numero entre 1 et 3999 (pour terminer la session tapez 0): "); // Affiche une invitation pour que l'utilisateur entre un nombre
            number = scanner.nextInt(); // Lit un entier saisi par l'utilisateur
            if (number > 0 && number <= 3999) { // Vérifie si le nombre est dans l'intervalle valide (1 à 3999)
                System.out.println("Le resultat de convertission: " + enRoman(number)); // Affiche le résultat de la conversion en chiffres romains
//            } else if (number > 3999 || number < 0) { // Vérifie si le nombre est en dehors de l'intervalle valide
                System.out.println("Le numero doit etre entre 1 et 3999"); // Affiche un message d'erreur pour une entrée invalide
            } else { // Si le nombre est égal à 0 (cas de sortie de la boucle)
                System.out.print("La fin de la session"); // Affiche un message indiquant la fin du programme
            }
        }
    }
}