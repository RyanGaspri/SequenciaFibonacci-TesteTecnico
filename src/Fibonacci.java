import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int num = ler.nextInt();
        ler.close();

        if(pertenceFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, c;

        if(num == 0 || num == 1) {
            return true;
        } else {
            for(int i = 2; i <= num; i++) {
                c = a + b;
                if(c == num) {
                    return true;
                }
                a = b;
                b = c;
            }
        }

        return false;
    }
}
