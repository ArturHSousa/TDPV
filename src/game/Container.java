/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author artuz
 */

import javax.swing.JFrame; //JFrame é uma extenção ja existente do java


public class Container extends JFrame{
    
    public Container(){
        
        setTitle("The Defender Of The Pixel Village");
        setSize(1920, 1080); //resolução
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ultizilado para o X da janela fechar o programa
        setLocationRelativeTo(null); //define para aparecer a tela no centro
        this.setResizable(true); //define se a possoa pode alterar o tamnho da tela do jogo
        setVisible(true); //define que esses comandos acima esteja visivel
    }
    
    public static void main (String []args){
        new Container();
    }
}
