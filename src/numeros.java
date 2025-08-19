import java.util.ArrayList;

public class numeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Número na posição 1: " + numeros.get(1));

        numeros.set(1, 25);
        numeros.remove(0);

        System.out.println("Tamanho atual:" + numeros.size());

        for (int num : numeros) {
            System.out.println("valor: " + num);
        }
    }
}