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
    
    ImageIcon iconFistPart = new ImageIcon(getClass().getResource("/res/FistPart.jpg"));
    ImageIcon iconPlayer_Frente = new ImageIcon(getClass().getResource("/res/Player_Frente.png"));
    ImageIcon iconPlayer_Costas = new ImageIcon(getClass().getResource("/res/Player_Costas.png"));
    ImageIcon iconPlayer_esquerdo = new ImageIcon(getClass().getResource("/res/Player_esquerdo.png"));
    ImageIcon iconPlayer_direito = new ImageIcon(getClass().getResource("/res/Player_direito.png"));
    ImageIcon iconNPC = new ImageIcon(getClass().getResource("/res/NPC.png"));
    
    JLabel lFistPart = new JLabel(iconFistPart);
    JLabel lPlayer = new JLabel(iconPlayer_Frente);
    JLabel lNPC = new JLabel(iconNPC);
    
    
    int posPlayerX = 350;
    int posPlayerY = 750;
    
    int posNPCX = 800;
    int posNPCY = 500;
    
    //construtor de inicialização
    public Game(){
        EditJanela();
        editComp();
        addMovimento();
    }
    
    public void editComp(){
        lFistPart.setBounds(0, 0, 1920, 1080);
        lPlayer.setBounds(posPlayerX, posPlayerY, 120, 120);
        lNPC.setBounds(posNPCX, posNPCY, 120, 120);
    }
    
    public void EditJanela(){
        setTitle("The Defender Of The Pixel Village");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);


        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        
        add(lNPC);
        add(lPlayer);
        add(lFistPart);
        
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
    
    //Comandos de movimento Player
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
                lPlayer.setBounds(posPlayerX, posPlayerY, 120, 120);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            
            }
            //   "System.out.println(e.getKeyCode());" ultilizado para identificar a numeração das teclas
        });
    }
}
