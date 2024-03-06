import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c = 0;
        boolean pertence = false;

        while (c <= numero) {
            if (c == numero) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}