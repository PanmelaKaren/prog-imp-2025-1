import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        int soma = 0, n, nota; // declarar variaveis 
        float media; 
        Scanner s = new Scanner(System.in);// receber(ler) os valores 
        System.out.println("Digite a quantidade de notas ");
        n = s.nextInt(); // n recebe o que ler no scanner 4
        
        for(int i = 0; i < n; i++){ // vai ler n vezes a variavel para colocar 
            System.out.println("Digite uma nota: ");
            nota = s.nextInt(); 
            soma = soma + nota; // pegar o valor da soma e somar com a nota nova 
        }
        media = soma/n;
        System.out.println("Média total: " + media);

    }
    
}
