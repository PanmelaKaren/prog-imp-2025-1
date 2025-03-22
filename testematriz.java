import java.util.Scanner; 

public class testematriz {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int mat [][] = {{3,0,4} , {0,2,0} , {2,3,8}};
        int mat2 [][] = new int[3][3];
     
        for (int i = 0; i < mat.length; i++) { // loop pra passar pelas linhas 
             for (int j = 0; j < matriz[i].length; j++) { // loop pra passar pelas colunas
                 System.out.print(mat[i][j] + " ");
             }

        System.out.println();   
    }

    
    }
}