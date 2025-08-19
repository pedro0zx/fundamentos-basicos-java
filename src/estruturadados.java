import java.util.ArrayList;

public class estruturadados {
    public static void main(String[] args) {
        //array simples
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("array tradicional: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        //arraylist (estrutura dinamica)
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana");

        System.out.println("\nArrayList de nomes: ");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }
}