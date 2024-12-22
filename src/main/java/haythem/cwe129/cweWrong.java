public class ArrayAccess {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Fonction pour accéder à un élément du tableau
        System.out.println(fetchItemFromArray(myArray, 10)); // Indice hors limites
        System.out.println(fetchItemFromArray(myArray, -1)); // Indice négatif
        System.out.println(fetchItemFromArrayCorrect(myArray, 2));  // Indice valide
        System.out.println(fetchItemFromArrayCorrect(myArray, 10)); // Indice hors limites
        System.out.println(fetchItemFromArrayCorrect(myArray, -1)); // Indice négatif
    }

    public static int fetchItemFromArray(int[] arr, int index) {
        // Pas de validation, accès direct
        return arr[index];
    }
    public static String fetchItemFromArrayCorrect(int[] arr, int index) {
        // Validation de l'indice avant l'accès
        if (index >= 0 && index < arr.length) {
            return "Valeur : " + arr[index];
        } else {
            return "Indice hors des limites.";
        }
    }
}