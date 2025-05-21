/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediadenotas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class MediaDeNotas {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int opcao;
        
do {
System.out.println("\nCALCULADORA DE MÉDIAS");
System.out.println("--------------------");
System.out.println("1 - Calcular sua média");
System.out.println("0 - Sair");
System.out.print("Escolha uma opção: ");
            
opcao = scanner.nextInt();
            
if (opcao == 1) {
calcularMedia(scanner);
}
else if (opcao != 0) {
System.out.println("Opção inválida!");
}
            
}
while (opcao != 0);
        
System.out.println("Programa encerrado.");
scanner.close();
}
    
public static void calcularMedia(Scanner scanner) {
double soma = 0;
        
for (int i = 1; i <= 4; i++) {
System.out.print("Digite a " + i + "ª nota: ");
double nota = scanner.nextDouble();
            
// Validação da nota (entre 0 e 10)
while (nota < 0 || nota > 10) {
System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
System.out.print("Digite a " + i + "ª nota novamente: ");
nota = scanner.nextDouble();
}
            
 soma += nota;
}
        
double media = soma / 4;
        
System.out.printf("\nMédia das notas: %.2f\n", media);
        
// Classificação do resultado
if (media >= 7) {
System.out.println("Situação: Aprovado");
}
else if (media >= 5) {
System.out.println("Situação: Recuperação");
}
else {
System.out.println("Situação: Reprovado");
}
    }
}
