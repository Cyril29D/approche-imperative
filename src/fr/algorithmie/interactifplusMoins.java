package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class interactifplusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1, essais = 0, nombre;

        System.out.println("Devinez le nombre entre 1 et 100 :");
        while ((nombre = scanner.nextInt()) != nombreAleatoire) {
            System.out.println(nombre < nombreAleatoire ? "C'est plus !" : "C'est moins !");
            essais++;
        }

        System.out.println("Bravo, vous avez trouvé en " + (++essais) + " coups !");
        scanner.close();
    }
}
