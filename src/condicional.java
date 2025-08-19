import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade=scanner.nextInt();

        if(idade < 1) {
            System.out.println("você é uma indigente ainda.");
        } else if (idade < 12) {
            System.out.println("você é criança.");
        } else if (idade < 18) {
            System.out.println("você é adolescente.");
        } else {
            System.out.println("você é adulto.");
        }
        scanner.close();
    }
}