/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaocelcius;

import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConversaoCelcius {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
System.out.println("\nCONVERSOR DE TEMPERATURA");
System.out.println("-----------------------");
System.out.println("1 - Celsius para Fahrenheit");
System.out.println("2 - Celsius para Kelvin");
System.out.println("3 - Fahrenheit para Celsius");
System.out.println("4 - Kelvin para Celsius");
System.out.println("0 - Sair");
System.out.print("Escolha uma opção: ");
            
opcao = scanner.nextInt();
            
if (opcao >= 1 & opcao <= 4) {
System.out.print("Digite a temperatura: ");
double temperatura = scanner.nextDouble();
double resultado;
                
switch (opcao) {
case 1:
resultado = (temperatura * 9/5) + 32;
System.out.printf("%.2f °C = %.2f °F\n", temperatura, resultado);
break;

case 2:
resultado = temperatura + 273.15;
System.out.printf("%.2f °C = %.2f K\n", temperatura, resultado);
break;
        
case 3:
resultado = (temperatura - 32) * 5/9;
System.out.printf("%.2f °F = %.2f °C\n", temperatura, resultado);
break;
        
case 4:
resultado = temperatura - 273.15;
System.out.printf("%.2f K = %.2f °C\n", temperatura, resultado);
break;
}
} 
else if (opcao != 0) {
System.out.println("Opção inválida!");
}
            
} while (opcao != 0);
        
System.out.println("Programa encerrado.");
scanner.close();
    }
}
