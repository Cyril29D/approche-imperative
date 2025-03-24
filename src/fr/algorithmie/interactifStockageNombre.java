package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class interactifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nombres = new int[5];
        int compte = 0;

        while (true) {
            System.out.println("\nMenu :\n1. Ajouter un nombre\n2. Afficher les nombres\n3. Quitter");
            int choix = scanner.nextInt();

            if (choix == 1) {
                System.out.print("Entrez un nombre : ");
                int nombre = scanner.nextInt();
                if (compte == nombres.length) nombres = Arrays.copyOf(nombres, nombres.length * 2);
                nombres[compte++] = nombre;
            }
            else if (choix == 2) {
                System.out.println("Nombres : " + Arrays.toString(Arrays.copyOf(nombres, compte)));
            }
            else if (choix == 3) {
                System.out.println("Programme terminé.");
                break;
            }
            else {
                System.out.println("Option invalide. Réessayez.");
            }
        }

    }
}
