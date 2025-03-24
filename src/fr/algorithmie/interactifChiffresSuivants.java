package fr.algorithmie;

import java.util.Scanner;

public class interactifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print((nombre + i) + (i < 10 ? ", " : "\n"));
        }

    }
}
