package fr.algorithmie;

public class nombreParfait {
    public static void main(String[] args) {
        int n = 7, s = 0;
        for (int i = 1; i <= n / 2; i++) s += (n % i == 0) ? i : 0;
        System.out.println(n + (s == n ? " est parfait" : " n'est pas parfait"));

    }
}
