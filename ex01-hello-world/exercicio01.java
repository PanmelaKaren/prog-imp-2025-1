import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[15];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = s.next();
        }
        
        System.out.println("\nNomes na ordem contrária:");
        for (int i = nomes.length -1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        
    }
}

