package fr.algorithmie;

import java.util.Scanner;

public class interactifSommeArithmetique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nombre = scanner.nextInt();

        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }

        System.out.println(somme);


    }
    }

