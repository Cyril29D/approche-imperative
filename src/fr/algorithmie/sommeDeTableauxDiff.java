package fr.algorithmie;

public class sommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

        int[] array3 = new int[Math.max(array1.length, array2.length)];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = (i < array1.length ? array1[i] : 0) + (i < array2.length ? array2[i] : 0);
        }

        for (int valeur : array3) {
            System.out.print(valeur + " ");
        }
    }
}
