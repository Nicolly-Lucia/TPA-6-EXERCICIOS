/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadordenumerosprimos;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class VerificadorDeNumerosPrimos {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int opcao;
        
do {
System.out.println("\nVERIFICADOR DE NÚMERO PRIMO");
System.out.println("--------------------------");
System.out.println("1 - Verificar se um número é primo");
System.out.println("0 - Sair");
System.out.print("Escolha uma opção: ");
            
opcao = scanner.nextInt();

if (opcao == 1) {
System.out.print("Digite um número: ");
int numero = scanner.nextInt();
                
boolean Primo = verificarPrimo(numero);
                
if (Primo) {
System.out.println(numero + " é um número primo.");
}
else {
System.out.println(numero + " não é um número primo.");
}
}
else if (opcao != 0) {
System.out.println("Opção inválida!");
}
            
}
while (opcao != 0);
       
System.out.println("Programa encerrado.");
scanner.close();
    }
    
// Método de verificação de um número é primo
public static boolean verificarPrimo(int numero) {
    if (numero <= 1) {
    
return false;
}
        
for (int i = 2; i <= Math.sqrt(numero); i++) {
if (numero % i == 0) {
return false;
}
}

return true;
    }
}