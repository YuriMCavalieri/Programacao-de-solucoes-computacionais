package atividade7;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizResultado = new int[2][2];

        
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

       
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz Resultante da Multiplicação:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
