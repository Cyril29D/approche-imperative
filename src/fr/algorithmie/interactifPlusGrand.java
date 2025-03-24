package fr.algorithmie;

import java.util.Scanner;

public class interactifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez 10 nombres  : ");
            int nombre = scanner.nextInt();
            if (nombre > max) max = nombre;
        }
        System.out.println(max);
        }

    }

