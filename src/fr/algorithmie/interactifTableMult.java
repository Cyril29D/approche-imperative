package fr.algorithmie;

import java.util.Scanner;

public class interactifTableMult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int   nb = 0 ;

        System.out.print("Entrez un nombre entre 1 et 10 : ");
        nb = scanner.nextInt();
        while (nb < 1 || nb > 10) {
            System.out.print("Erreur. Entrez un nombre entre 1 et 10 : ");
            nb = scanner.nextInt();
        }
        for (int i = 1; i <= 10; i++){

            int result ;

           result = nb * i ;

            System.out.println(nb+" * "+i+" = "+result);
        }


    }
}

