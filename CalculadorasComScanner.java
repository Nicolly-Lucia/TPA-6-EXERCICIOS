/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoracomscanner;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadoraComScanner {

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
break;

case 2:
resultado = num1 - num2;
System.out.println("Resultado: " + resultado);
break;

case 3:
resultado = num1 * num2;
System.out.println("Resultado: " + resultado);
break;

case 4:
if (num2 != 0) {
resultado = num1 / num2;
System.out.println("Resultado: " + resultado);
break;
}
else {
System.out.println("Erro: Divisão por zero!");
break;
}

default:
System.out.println("Operação inválida!");
break;
}
}   

System.out.println("Calculadora encerrada.");
scanner.close();
    }
}
