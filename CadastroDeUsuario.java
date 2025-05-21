/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrodeusuario;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CadastroDeUsuario {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("------------------");
       
//coleta de dados
System.out.print("Digite seu nome completo: ");
String nome = scanner.nextLine();

System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
String dataNascimento = scanner.nextLine();

System.out.print("Digite seu curso técnico: ");
String curso = scanner.nextLine();

System.out.print("Digite sua série: ");
String serie = scanner.nextLine();

System.out.print("Digite sua altura em metros: ");
Double altura = scanner.nextDouble();

System.out.print("Digite seu peso em KG: ");
Double peso = scanner.nextDouble();

//Exibição dos dados

System.out.println("\nDados Cadastrados");
System.out.println("------------------");
System.out.println("\"Nome completo:" + nome);
System.out.println("Data de Nascimento: " + dataNascimento);
System.out.println("Curso: " + curso);
System.out.println("Série: " + serie);
System.out.println("Altura: " + altura);
System.out.println("Peso: " + peso);

scanner.close();
    }
}

