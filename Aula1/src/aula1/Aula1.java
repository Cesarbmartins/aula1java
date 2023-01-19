/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author DPSP
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, informe o seu nome:");
       String nome = entrada.nextLine();
        System.out.println("Seja bem-vindo(a), " + nome);
    
        System.out.println(nome+ " informe sua idade: ");
        int idade= entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Sua idade é : " + idade);
    }
    
}
