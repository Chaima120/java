public class exercice4 {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau de nombres
        int[] nombres = {10, 20, 30, 40, 50};

        // Variable pour stocker la somme
        int somme = 0;

        // Boucle for pour parcourir le tableau et calculer la somme
        for (int i = 0; i < nombres.length; i++) {
            somme += nombres[i];  // Ajoute chaque élément du tableau à la somme
        }

        // Affiche la somme des éléments
        System.out.println("La somme des éléments du tableau est : " + somme);
    }
}
