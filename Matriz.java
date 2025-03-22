import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mat[][] = {{15, 0, 4}, {0, 2, 0}, {2, 3, 8}}; 
        int mat2[][] = new int[3][3]; 
      
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j <= i; j++) {
                mat2[i][j] = s.nextInt(); 
        }
     }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

    }
}


    