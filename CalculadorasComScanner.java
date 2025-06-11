/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorascomscanner;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadorasComScanner {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean continuar = true;
        
while (continuar) {
System.out.println("\nCalculadora Básica");
System.out.println("1 - Soma");
System.out.println("2 - Subtração");
System.out.println("3 - Multiplicação");
System.out.println("4 - Divisão");
System.out.println("5 - Sair");
            
System.out.print("Escolha a operação (1-5): ");
int operacao = scanner.nextInt();
            
if (operacao == 5) {
continuar = false;
continue;
            }
            
System.out.print("Digite o primeiro número: ");
double num1 = scanner.nextDouble();
            
System.out.print("Digite o segundo número: ");
double num2 = scanner.nextDouble();
            
double resultado = 0;
            
switch (operacao) {
case 1:
resultado = num1 + num2;
System.out.println("Resultado: " + resultado);

case 2:
resultado = num1 - num2;
System.out.println("Resultado: " + resultado);

case 3:
resultado = num1 * num2;
System.out.println("Resultado: " + resultado);

case 4:
if (num2 != 0) {
resultado = num1 / num2;
System.out.println("Resultado: " + resultado);
}
else {
System.out.println("Erro: Divisão por zero!");
}

default:
System.out.println("Operação inválida!");
}
}   

System.out.println("Calculadora encerrada.");
scanner.close();
    }
}
