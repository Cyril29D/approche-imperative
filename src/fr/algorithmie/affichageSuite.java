package fr.algorithmie;

public class affichageSuite {
    public static void main(String[] args) {

        System.out.println("afficher les nombres de 1 à 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("nombre pair");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("nombre impair");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("afficher les nombres de 1 à 10 avec while");
        int i = 1 ;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("nombre pair - while");
        int p = 0 ;
        while (p <= 10){
            System.out.println(p);
            p += 2;
        }
        System.out.println("nombre impair - while");
        int l = 0 ;
        while (l <= 10){
            System.out.println(l);
            l += 2;
        }
    }

}
