/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author artuz
 */
public class Inicio extends JPanel {
    
    private Image fundo;
    
    
    public Inicio() {
 
        ImageIcon referencia = new ImageIcon("src\\res\\FistPart.jpg"); //ImageIcon recebe imagem, a imagem você joga ela para a pasta "folder" com nome "res"
        fundo = referencia.getImage();
    }
    
    //"Graphics" e "Graphics2D" é uma classe já do java para colocar a imagem na tela
    public  void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null); //seleciona a imagem e as conrdenadas da mesma
        g.dispose(); //Necessario para funcionar a imagem
    }
}
