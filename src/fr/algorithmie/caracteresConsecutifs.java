package fr.algorithmie;

public class caracteresConsecutifs {
    public static void main(String[] args) {
        String chaine = "aaabbc", res = "";
        for (int i = 0, count = 1; i < chaine.length(); i++) {
            if (i < chaine.length() - 1 && chaine.charAt(i) == chaine.charAt(i + 1)) count++;
            else { res += chaine.charAt(i) + String.valueOf(count); count = 1; }
        }
        System.out.println(res);
    }
}
