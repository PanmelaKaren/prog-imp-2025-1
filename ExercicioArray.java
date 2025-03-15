import java.util.Scanner;

public class exerci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação do array de inteiros
        int[] v = {1, 2, 5, 6, 3, 0, 5};
        
        // Leitura dos valores mínimo e máximo fornecidos pelo usuário
        System.out.print("Digite o valor mínimo (x): ");
        int x = scanner.nextInt();
        
        System.out.print("Digite o valor máximo (y): ");
        int y = scanner.nextInt();
        
        // Garantir que x seja o menor e y seja o maior
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        
        // Impressão dos valores no array que estão entre min e max
        System.out.println("Valores entre " + min + " e " + max + ":");
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= min && v[i] <= max) {
                System.out.println(v[i]);
            }
        }
        
        scanner.close();
    }
}

