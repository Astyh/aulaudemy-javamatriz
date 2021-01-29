/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.println("Digite a Quantidade de colunas: ");
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        sc.nextLine();

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Linha " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Digite um numero: ");
        int compara = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (compara == matriz[i][j]) {
                    System.out.print("Posição: ");
                    System.out.print(i + "," + j);
                    System.out.println();
                    if (j > 0) {
                        System.out.print("Esquerda: " + matriz[i][j - 1]);
                        System.out.println();
                    }
                    if (i > 0) {
                        System.out.print("Cima: " + matriz[i - 1][j]);
                        System.out.println();
                    }
                    if (j < n - 1) {
                        System.out.print("Direita: " + matriz[i][j + 1]);
                        System.out.println();
                    }
                    if (i < m - 1) {
                        System.out.print("Baixo: " + matriz[i + 1][j]);
                        System.out.println();
                    }

                }

            }
        }

        sc.close();
    }

}
