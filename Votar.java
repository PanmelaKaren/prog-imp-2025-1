import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        
        int idade;  
        Scanner s = new Scanner(System.in);// receber(ler) os valores 
        System.out.println("Digite a sua idade ");
        idade = s.nextInt();
        if (idade >=18){
            System.out.println("Deve votar");}
           else if(idade >=16 && idade < 18){
            System.out.println("Pode votar");
           }else{
            System.out.println("Não vota");
           }
        }
       
        
    }
}
