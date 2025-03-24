package fr.algorithmie;

import java.util.Scanner;

//import static sun.security.util.FilePermCompat.nb;

public class interactifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int   nb = 0 ;


            System.out.print("Entrez un nombre entre 1 et 10 : ");
           nb = scanner.nextInt();
         while (nb < 1 || nb > 10) {
             System.out.print("Erreur. Entrez un nombre entre 1 et 10 : ");
             nb = scanner.nextInt();
         }
        System.out.println("le nombre est correct");
        scanner.close();
    }
}
