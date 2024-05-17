import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (digite um número negativo para sair): ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Você digitou um número negativo. O programa terminou.");
        scanner.close();
    }
}