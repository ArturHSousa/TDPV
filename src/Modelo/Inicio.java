/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author artuz
 */
public class Inicio extends JPanel implements ActionListener{
    
    private Image fundo;
    private Player player;
    private Timer timer;
    
    public Inicio() {
        
        //dois comandos para melhorar o desempenho do jogo
        setFocusable(true);
        setDoubleBuffered(true);
        
        
        ImageIcon referencia = new ImageIcon("src\\res\\FistPart.jpg"); //ImageIcon recebe imagem, a imagem você joga ela para a pasta "folder" com nome "res"
        fundo = referencia.getImage();
        
        player = new Player();
        player.load();
        
        addKeyListener(new TecladoAdapter());
        
        timer = new Timer(5, this);
        timer.start();
    }
    
    //"Graphics" e "Graphics2D" é uma classe já do java para colocar a imagem na tela
    public  void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null); //seleciona a imagem e as conrdenadas da mesma
        graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);
        g.dispose(); //Necessario para funcionar a imagem
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0){
        player.update();
        repaint();
        
    }
    //KeyAdapter tambem é uma classe já existe no java
    private class TecladoAdapter extends KeyAdapter{
        
      //metodo pra entrar a tecla e sair  
        public void tecladoPress(KeyEvent e){
            player.tecladoPress(e);
        }
   
        public void tecladoNoPress(KeyEvent e){
            player.tecladoNoPress(e);
        }
    }

}
