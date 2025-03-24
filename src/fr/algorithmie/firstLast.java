package fr.algorithmie;

public class firstLast {
    public static void main(String[] args) {
        int[] tableau = {7, 6, 3, 4, 5, 6};

        boolean result = tableau.length > 0 && tableau[0] == tableau[tableau.length - 1];
        System.out.println(result);
    }
}
