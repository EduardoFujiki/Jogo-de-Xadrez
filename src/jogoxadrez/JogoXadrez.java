package jogoxadrez;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static jogoxadrez.Tabuleiro.color;
import static jogoxadrez.TelaJogadores.*; //quando tem o asterisco ele importa todas as variaeis estaticas criadas da classe TelaJogadores


public class JogoXadrez extends JFrame {

        public Tabuleiro tabuleiro;
        public static JButton empate;
        public static JButton desistir;
        public static JLabel nomeJogador = new JLabel("");
        
        public JogoXadrez(){
            
            JPanel janela = new Tabuleiro();
            setTitle("Jogo de Xadrez"); 
            this.setLayout(new BorderLayout());
            setBounds(320,10,800,800); //seta a posicao e o tamanho de tabuleiro na tela
            this.tabuleiro = new Tabuleiro(); //inicializando o tabuleiro como JPanel
            setDefaultCloseOperation(3); //fecha o programa quando clica no x
            setResizable(false); //evita que o tamanho da janela seja aumentada na execucao
            this.add(new Tabuleiro());
            
            
            final JPanel painelDireito = new JPanel(); //cria um JPanel para adicionar os botões de empate e desistencia
            painelDireito.setLayout(new GridLayout(20,5,3,3));
            
            empate = new JButton("Empate");
            desistir = new JButton("Desistir");
            painelDireito.add(empate);
            painelDireito.add(desistir);
            this.add(painelDireito,BorderLayout.EAST);
            painelDireito.setBackground(Color.YELLOW.brighter());
            
            
            //JLabel nomeJogador = new JLabel("");
            nomeJogador.setText(nome1);
            nomeJogador.setVisible(true);
            painelDireito.add(nomeJogador);
            setVisible(true);
            
            
            
            empate.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent a){
                    new Empate().setVisible(true);
                }
              } 
            );
            
            desistir.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent a){
                    new Desistir().setVisible(true);
                    
                }
              } 
            );
        }  
        
        public static void nomeDoJogador(){
        if(color==1)
        {
            nomeJogador.setText(nome1); 
        }
            else nomeJogador.setText(nome2);
        }
       
     
        public static void main(String[] args) { 
         //new JogoXadrez();
         new Titulo().setVisible(true);
         //janela.setDefaultCloseOperation(3);
        
         
     }
}
