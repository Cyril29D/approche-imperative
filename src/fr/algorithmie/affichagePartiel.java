package fr.algorithmie;

public class affichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("les entiers supérieurs à 3");
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > 3)
            System.out.print(array[i] + " ");
        }
        System.out.println("\n les éléments pairs");
        for (int i = 0; i < array.length ; i++) {

            if (array[i] % 2 == 0)
            System.out.print(array[i] + " ");
        }
        System.out.println("\n les index pairs");
        for (int i = 0; i < array.length ; i += 2) {

                System.out.print(array[i] + " ");
        }
        System.out.println("\n les entiers impairs");
        for (int i = 0; i < array.length ; i++) {

            if (array[i] % 2 != 0)
            System.out.print(array[i] + " ");
        }
    }
}
