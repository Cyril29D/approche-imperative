package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tableau = {7, 6, 3, 4, 5, 6};

        boolean result = tableau.length > 0 && (tableau[0] == 6 || tableau[tableau.length - 1] == 6);

        System.out.println(result);
    }
}
