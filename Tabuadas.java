/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class Tabuadas {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nEXIBIÇÃO DE TABUADAS");
            System.out.println("------------------");
            System.out.println("1 - Gerar nova tabuada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            if(opcao == 1) {
                System.out.print("\nDigite um número: ");
                int numero = scanner.nextInt();
                
                System.out.println("\nTabuada do " + numero + ":");
                for(int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %2d = %3d\n", numero, i, (numero * i));
                }
            } else if(opcao != 0) {
                System.out.println("Opção inválida!");
            }
            
        } while(opcao != 0);
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
   
