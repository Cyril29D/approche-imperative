package fr.algorithmie;

public class affichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("le tableau :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nle tableau inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n la copy du tableau :");
        int [] arrayCopy = array ;
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }

    }
}
