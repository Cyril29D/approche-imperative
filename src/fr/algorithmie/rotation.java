package fr.algorithmie;

import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        if (array.length > 1) {
            int lastElement = array[array.length - 1];

            System.arraycopy(array, 0, array, 1, array.length - 1);

            array[0] = lastElement;
        }

        System.out.println(Arrays.toString(array));
    }
}
