/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author artuz
 */
public class Player {
    
    private int x,y;            //movimentação e dimenção do player
    private int dx,dy;
    private Image imagem;
    private int altura, largura;
    
    
    public Player(){
        this.x = 300;
        this.y = 750;
    
    }
    
    public void load(){
        ImageIcon referencia = new ImageIcon("src\\res\\Player Frente.png");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
        
    }
    
    public void update(){
        x += dx;
        y += dy;
    }
    //teclado pressionado
    public void tecladoPress(KeyEvent tecla){
        int codigo =tecla.getKeyCode();
        
       if (codigo == KeyEvent.VK_W) {
           dy = -3;
    }
       if (codigo == KeyEvent.VK_S) {
           dy = 3;
    
    }
       if (codigo == KeyEvent.VK_A) {
           dx = -3;
    
    }
       if (codigo == KeyEvent.VK_D) {
           dx = 3;
    
    }
    }    

    //quando parar de pressionar o teclado ele volta para o 0
    public void tecladoNoPress(KeyEvent tecla){
        int codigo =tecla.getKeyCode();
        
       if (codigo == KeyEvent.VK_W) {
           dy = 0;
        }
       if (codigo == KeyEvent.VK_S) {
           dy = 0;
    
        }
       if (codigo == KeyEvent.VK_A) {
           dx = 0;
    
        }
       if (codigo == KeyEvent.VK_D) {
           dx = 0;
    
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }

    
    }
