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
    
    ImageIcon iconMAP             = new ImageIcon(getClass().getResource("/res/Final_Game.jpg"));
    ImageIcon iconARV_teto        = new ImageIcon(getClass().getResource("/res/ARV_teto.png"));
    ImageIcon iconARV_direita     = new ImageIcon(getClass().getResource("/res/ARV_direita.png"));
    ImageIcon iconARV_esquerda    = new ImageIcon(getClass().getResource("/res/ARV_esquerda.png"));
    ImageIcon iconARV_baixo       = new ImageIcon(getClass().getResource("/res/ARV_baixo.png"));
    ImageIcon iconARV_part1       = new ImageIcon(getClass().getResource("/res/ARV_part_1.png"));
    ImageIcon iconARV_part2       = new ImageIcon(getClass().getResource("/res/ARV_part_2.png"));
    ImageIcon iconARV_part3       = new ImageIcon(getClass().getResource("/res/ARV_part_3.png"));
    ImageIcon iconARV_part4       = new ImageIcon(getClass().getResource("/res/ARV_part_4.png"));
    ImageIcon iconPlayer_Frente   = new ImageIcon(getClass().getResource("/res/Player_Frente.png"));
    ImageIcon iconPlayer_Costas   = new ImageIcon(getClass().getResource("/res/Player_Costas.png"));
    ImageIcon iconPlayer_esquerdo = new ImageIcon(getClass().getResource("/res/Player_esquerdo.png"));
    ImageIcon iconPlayer_direito  = new ImageIcon(getClass().getResource("/res/Player_direito.png"));
    ImageIcon iconEnemy           = new ImageIcon(getClass().getResource("/res/enemy.png"));
    ImageIcon iconWIN             = new ImageIcon(getClass().getResource("/res/you_win.jpg"));
    
    JLabel lMAP = new JLabel(iconMAP);
    JLabel lARV_teto = new JLabel(iconARV_teto);
    JLabel lARV_direita = new JLabel(iconARV_direita);
    JLabel lARV_baixo = new JLabel(iconARV_baixo);
    JLabel lARV_esquerda = new JLabel(iconARV_esquerda);
    JLabel lARV_part1 = new JLabel(iconARV_part1);
    JLabel lARV_part2 = new JLabel(iconARV_part2);
    JLabel lARV_part3 = new JLabel(iconARV_part3);
    JLabel lARV_part4 = new JLabel(iconARV_part4);
    JLabel lPlayer = new JLabel(iconPlayer_Frente);
    JLabel lENEMY = new JLabel(iconEnemy);
    JLabel lWIN = new JLabel(iconWIN);
    
    
    int posPlayerX = 200;
    int posPlayerY = 790;
    int widthPlayer = 91;
    int heightPlayer = 113;
            
    int posENEMYX = 300;
    int posENEMYY = 60;
    int widthENEMY = 45;
    int heightENEMY = 108;
    
    //Arvores coords
    int ARV_tetoX = 280;
    int ARV_tetoY = -95;      
    int widthARV_teto = 1668;
    int heightARV_teto = 128;
    
    int ARV_direitaX = 1820;
    int ARV_direitaY = -30;
    int widthARV_direita = 148;
    int heightARV_direita = 1130;
    
    int ARV_baixoX = -10;
    int ARV_baixoY = 960;
    int widthARV_baixo = 1910;
    int heightARV_baixo = 176;
    
    int ARV_esquerdaX = -10;
    int ARV_esquerdaY = 660;
    int widthARV_esquerda = 137;
    int heightARV_esquerda = 361;
    
    int ARV_part1X = -10;
    int ARV_part1Y = 190;
    int widthARV_part1 = 556;
    int heightARV_part1 = 544;
    
    int ARV_part2X = 800;
    int ARV_part2Y = 520;
    int widthARV_part2 = 278;
    int heightARV_part2 = 535;
    
    int ARV_part3X = 1360;
    int ARV_part3Y = 190;
    int widthARV_part3 = 278;
    int heightARV_part3 = 535;
    
    int ARV_part4X = 545;
    int ARV_part4Y = 190;
    int widthARV_part4 = 834;
    int heightARV_part4 = 178;

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
        
        //Arvores
        lARV_teto.setBounds(ARV_tetoX, ARV_tetoY, widthARV_teto, heightARV_teto);
        lARV_direita.setBounds(ARV_direitaX, ARV_direitaY, widthARV_direita, heightARV_direita);
        lARV_baixo.setBounds(ARV_baixoX, ARV_baixoY, widthARV_baixo, heightARV_baixo);
        lARV_esquerda.setBounds(ARV_esquerdaX, ARV_esquerdaY, widthARV_esquerda, heightARV_esquerda);
        lARV_part1.setBounds(ARV_part1X, ARV_part1Y, widthARV_part1, heightARV_part1);
        lARV_part2.setBounds(ARV_part2X, ARV_part2Y, widthARV_part2, heightARV_part2);
        lARV_part3.setBounds(ARV_part3X, ARV_part3Y, widthARV_part3, heightARV_part3);
        lARV_part4.setBounds(ARV_part4X, ARV_part4Y, widthARV_part4, heightARV_part4);
    }
    
    public void EditJanela(){
        setTitle("The Defender Of The Pixel Village");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);


        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        
        //Arvores
        add(lARV_baixo);
        add(lARV_esquerda);
        add(lARV_direita);
        add(lARV_teto);
        add(lARV_part1);
        add(lARV_part2);
        add(lARV_part4);
        add(lARV_part3);
        
        
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
    public boolean colisao(JLabel lPlayer, JLabel lENEMY) {
        
        int xplayer = lPlayer.getX();
        int yplayer = lPlayer.getY();
        int larguraplayer = lPlayer.getWidth();
        int alturaplayer = lPlayer.getHeight();

        int xenemy = lENEMY.getX();
        int yenemy = lENEMY.getY();
        int larguraenemy = lENEMY.getWidth();
        int alturaenemy = lENEMY.getHeight();

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
                remove(lARV_baixo);
                remove(lARV_esquerda);
                remove(lARV_direita);
                remove(lARV_teto);
                remove(lARV_part1);
                remove(lARV_part2);
                remove(lARV_part4);
                remove(lARV_part3);
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
  


