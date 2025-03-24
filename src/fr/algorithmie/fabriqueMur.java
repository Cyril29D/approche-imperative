package fr.algorithmie;

import java.util.Scanner;

public class fabriqueMur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de petites briques : ");
        int nbSmall = scanner.nextInt();
        System.out.print("Entrez le nombre de grandes briques : ");
        int nbBig = scanner.nextInt();
        System.out.print("Entrez la longueur du mur : ");
        int longueur = scanner.nextInt();

        int maxBig = Math.min(longueur / 5, nbBig);
        int reste = longueur - (maxBig * 5);

        System.out.println(reste <= nbSmall ? "true" : "false");
        scanner.close();
    }
}
