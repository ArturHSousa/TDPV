/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author artuz
 */
public class Game extends JFrame{
    /*JFrame é uma extenção ja existente do java 
      "Fornece uma janela com atributos padrão, como barra de títulos, botões de minimizar, maximizar e fechar"
    */
    
    ImageIcon iconMAP = new ImageIcon(getClass().getResource("/res/Final_Game.jpg"));
    ImageIcon iconPlayer_Frente = new ImageIcon(getClass().getResource("/res/Player_Frente.png"));
    ImageIcon iconPlayer_Costas = new ImageIcon(getClass().getResource("/res/Player_Costas.png"));
    ImageIcon iconPlayer_esquerdo = new ImageIcon(getClass().getResource("/res/Player_esquerdo.png"));
    ImageIcon iconPlayer_direito = new ImageIcon(getClass().getResource("/res/Player_direito.png"));
    ImageIcon iconEnemy = new ImageIcon(getClass().getResource("/res/enemy.png"));
    ImageIcon iconWIN = new ImageIcon(getClass().getResource("/res/you_win.jpg"));
    
    JLabel lMAP = new JLabel(iconMAP);
    JLabel lPlayer = new JLabel(iconPlayer_Frente);
    JLabel lENEMY = new JLabel(iconEnemy);
    JLabel lWIN = new JLabel(iconWIN);
    
    int posPlayerX = 200;
    int posPlayerY = 770;
    int widthPlayer = 91;
    int heightPlayer = 113;
            
    int posENEMYX = 300;
    int posENEMYY = 30;
    int widthENEMY = 45;
    int heightENEMY = 108;
    

    //construtor de inicialização
    public Game(){
        EditJanela();
        editComp();
        addMovimento();
    }
    
    public void editComp(){
        lMAP.setBounds(0, 0, 1920, 1080);
        lPlayer.setBounds(posPlayerX, posPlayerY, widthPlayer, heightPlayer);
        lENEMY.setBounds(posENEMYX, posENEMYY, widthENEMY, heightENEMY);
        lWIN.setBounds(0, 0, 1920, 1080);
    }
    
    public void EditJanela(){
        setTitle("The Defender Of The Pixel Village");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);


        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        

        add(lENEMY);
        add(lPlayer);
        add(lMAP);
        
     /*   
        setSize resolução
        setDefaultCloseOperation ultizilado para o X da janela fechar o programa
        setLocationRelativeTo define para aparecer a tela no centro
        setResizable define se a possoa pode alterar o tamnho da tela do jogo
        setVisible define que esses comandos acima esteja visivel
     */
    }
    
    public static void main(String[] args) {
        new Game();
 
    }
    
    
    //Colisão ENEMY
    public boolean colisao(JLabel lPlayer, JLabel lNPC) {
        
        int xplayer = lPlayer.getX();
        int yplayer = lPlayer.getY();
        int larguraplayer = lPlayer.getWidth();
        int alturaplayer = lPlayer.getHeight();

        int xenemy = lNPC.getX();
        int yenemy = lNPC.getY();
        int larguraenemy = lNPC.getWidth();
        int alturaenemy = lNPC.getHeight();

        // Verifica se há sobreposição nas coordenadas x e y (PLAYER E ENEMY)
        if (xplayer < xenemy + larguraenemy &&
            xplayer + larguraplayer > xenemy &&
            yplayer < yenemy + alturaenemy &&
            yplayer + alturaplayer > yenemy) {
            return true; 
        }
        return false; 
    }
    
    
    //Comandos de movimento Player + teste abordagem da colisão
    public void addMovimento(){
        addKeyListener(new  KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
            
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                if(e.getKeyCode()==87){
                    posPlayerY -= 20;
                    lPlayer.setIcon(iconPlayer_Costas);
                }
                if(e.getKeyCode()==83){
                    posPlayerY += 20;
                    lPlayer.setIcon(iconPlayer_Frente);
                }
                if(e.getKeyCode()==65){
                    posPlayerX -= 20;
                    lPlayer.setIcon(iconPlayer_esquerdo);
                }
                if(e.getKeyCode()==68){
                    posPlayerX += 20;
                    lPlayer.setIcon(iconPlayer_direito);
                }
                lPlayer.setBounds(posPlayerX, posPlayerY, 91, 113);
                
                //abordagem da colisão
                if (colisao(lPlayer, lENEMY)) {
                System.out.println("Player e enemy colidiram");
                remove(lMAP);
                remove(lPlayer);
                remove(lENEMY);
                add(lWIN);
                repaint();
               
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
           //"System.out.println(e.getKeyCode());" ultilizado para identificar a numeração das teclas
        });
        
        }

}
  


