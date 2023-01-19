/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import javax.swing.JOptionPane;

/**
 *
 * @author DPSP
 */
public class Aula2JOptionPane {
    public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "Hello World!!");
    String nome = JOptionPane.showInputDialog("Digite seu nome");
    JOptionPane.showMessageDialog(null, "Olá " + nome);
    
   int resposta = JOptionPane.showConfirmDialog(null,"Escolha uma das opções");
    
   if(resposta==0){
       JOptionPane.showMessageDialog(null,"Você clicou em sim");
    } else if(resposta==1){
JOptionPane.showMessageDialog(null,"Você clicou em não");        
    }else{
    JOptionPane.showMessageDialog(null,"Você clicou em cancelar");

    }
   
    
    }
}
