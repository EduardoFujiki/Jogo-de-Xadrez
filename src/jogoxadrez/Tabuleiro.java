package jogoxadrez;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.html.ImageView;
import static jogoxadrez.JogoXadrez.nomeDoJogador;

import static jogoxadrez.TelaJogadores.nome1;



public class Tabuleiro extends JPanel {
    public static JButton quadrado[][] = new JButton[8][8]; //matriz na qual vai se construida o tabuleiro
    public static Matriz aux[][] = new Matriz[8][8]; //matriz aux para posicionar e pegar as coordenadas da matriz tabuleiro
    int controle = 0; //vai ser utilizada para controlar o clique do movimentoda peca
    public static int cinquentaMoves = 50; //contador que vai ser utilizado para detectar o empate dos 50 movimentos em comer nenhuma peca
    //public static int peaoMovimento = 50;
    public static int fromI;
    public static int fromJ;
    public static int toI;
    public static int toJ;                  //0 para o clique inicial e 1 para o clique destino
    public static int color = 1; //teste
    
    
    public Tabuleiro(){
        
        setLayout(new GridLayout(8,8,1,1)); //8 8 6 6
          
        ImageIcon peaoPreto = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\peaoP.png"); 
        ImageIcon torrePreto = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\torreP.png");
        ImageIcon cavaloPreto = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\cavaloP.png");
        ImageIcon bispoPreto = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\bispoP.png");
        ImageIcon rainhaPreto = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\rainhaP.png");
        ImageIcon reiPreto = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\reiP.png");
       
        ImageIcon peaoBranco = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\peaoB.png");
        ImageIcon torreBranco = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\torreB.png");
        ImageIcon cavaloBranco = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\cavaloB.png");
        ImageIcon bispoBranco = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\bispoB.png");
        ImageIcon rainhaBranco = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\rainhaB.png");
        ImageIcon reiBranco = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JogoXadrez\\src\\jogoxadrez\\Imagens\\reiB.png");
           
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                quadrado[i][j]=criaBotao();       //cria os botoes no tabuleiro que vao ser responsaveis  
                aux[i][j] = new Matriz(null);     //cria uma matriz
                

                if(((i+j)%2) == 0)
                {
                    
                    quadrado[i][j].setBackground(Color.CYAN.brighter()); ///brighter()
                    
                  
                }
                else
                {
                    quadrado[i][j].setBackground(Color.BLUE.brighter());
                    
                }
                this.add(quadrado[i][j]);
            }
        }
        ////////////posicionar as imagens das pecas no tabuleiro//////////////
        quadrado[0][0].setIcon(torrePreto);
        quadrado[0][7].setIcon(torrePreto);
        quadrado[0][1].setIcon(cavaloPreto);
        quadrado[0][6].setIcon(cavaloPreto);
        quadrado[0][2].setIcon(bispoPreto);
        quadrado[0][5].setIcon(bispoPreto);
        quadrado[0][3].setIcon(rainhaPreto);
        quadrado[0][4].setIcon(reiPreto);
        for(int i=0; i<8; i++)
        {
            quadrado[1][i].setIcon(peaoPreto);
        }
        
        quadrado[7][0].setIcon(torreBranco);
        quadrado[7][7].setIcon(torreBranco);
        quadrado[7][1].setIcon(cavaloBranco);
        quadrado[7][6].setIcon(cavaloBranco);
        quadrado[7][2].setIcon(bispoBranco);
        quadrado[7][5].setIcon(bispoBranco);
        quadrado[7][4].setIcon(reiBranco);
        quadrado[7][3].setIcon(rainhaBranco);
        for(int i=0; i<8; i++)
        {
            quadrado[6][i].setIcon(peaoBranco);    
        }
        
        //////////////////////////////Posiciona as pecas no tabuleiros///////////////////////////////////
        aux[0][0].setPeca(new Torre(0));  
        aux[0][7].setPeca(new Torre(0));
        aux[0][1].setPeca(new Cavalo(0));
        aux[0][6].setPeca(new Cavalo(0));
        aux[0][2].setPeca(new Bispo(0));
        aux[0][5].setPeca(new Bispo(0));
        aux[0][3].setPeca(new Rainha(0));
        aux[0][4].setPeca(new Rei(0));
        for(int i=0; i<8; i++)
        {
            aux[1][i].setPeca(new Peao(0) {});
        }
        
        aux[7][0].setPeca(new Torre(1));
        aux[7][7].setPeca(new Torre(1));
        aux[7][1].setPeca(new Cavalo(1));
        aux[7][6].setPeca(new Cavalo(1));
        aux[7][5].setPeca(new Bispo(1));
        aux[7][2].setPeca(new Bispo(1));
        aux[7][3].setPeca(new Rainha(1));
        aux[7][4].setPeca(new Rei(1));
        for(int i=0; i<8; i++)
        {
            aux[6][i].setPeca(new Peao(1));
        }
        
    }
    
    public JButton criaBotao(){
        JButton botao = new JButton();
        botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {  
                //Jogada(e);
                coordenada(e);
            }
        }
        
      );
          return botao;    
    }
    
    public void coordenada(ActionEvent e){
        if(controle == 0)
        {   
            for(int i=0; i<8; i++) //origem da peca
            {
                for(int j=0; j<8; j++)
                {
                    if(quadrado[i][j] == e.getSource()) //procura a coordenada do botao que eu criei
                    {
                        fromI = i; //salva as coordenadas de origem da peca
                        fromJ = j;
                        
                        if(aux[fromI][fromJ].getPeca()!=null){
                            if(aux[fromI][fromJ].getPeca().getCor()==color)
                            {    
                                 if(aux[fromI][fromJ].getPeca() == null) //se clicar em um lugar onde nao tem peca nao a
                                 {   
                                    return;
                                 } 
                                                                 
                                 mostraCaminho(e); //mostra as possibilidades de jogadas de uma peca pintando o tabuleiro
                                 controle = 1;
                            }
                        }
                        
                    }    
                }
            }
            
        }
        else
        {
            for(int i=0; i<8; i++) //destino da peca 
            {
                for(int j=0; j<8; j++)
                {
                    if(quadrado[i][j] == e.getSource())
                    {
                        toI = i; //salva as coordenadas de destino da peca
                        toJ = j;
                        if(aux[fromI][fromJ].getPeca().condMove(fromI,fromJ, toI, toJ))
                        {   
                             movePeca(e);
                             if(color==1)
                             color=0;
                             else color=1;
                             nomeDoJogador(); 
                        } 
                        
                    }
                }
            }
            limpaCaminho(e); //apos a peca se mover, a funcao limpa as cores dos possiveis movimentos que a peca tinha
            controle = 0;
        }
    }
    
    public void movePeca(ActionEvent e){
        boolean comeuPeca = false;
        boolean movePeao = false;
        if(aux[toI][toJ].getPeca()!=null)
        {
            comeuPeca = true;
        }
        
        aux[toI][toJ].setPeca(aux[fromI][fromJ].getPeca());  
        quadrado[toI][toJ].setIcon(quadrado[fromI][fromJ].getIcon());
        
        if(aux[toI][toJ].getPeca() instanceof Peao)
        {
            movePeao = true;
        }
        if(movePeao || comeuPeca)
        {
            cinquentaMoves = 50; 
            
        }
        else 
        {
            cinquentaMoves --;
            
        }
        if(cinquentaMoves == 0)
        {
            new Empate50Movimentos().setVisible(true);
        }
        if(fromI == toI && fromJ == toJ)
        {
            return;
        }
        else
        {
            aux[fromI][fromJ].setPeca(null);
            quadrado[fromI][fromJ].setIcon(null);
        }
        
        
        
    }
    
    public void mostraCaminho(ActionEvent e){
        
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                if(aux[fromI][fromJ].getPeca().condMove(fromI,fromJ, i, j))
                    quadrado[i][j].setBackground(Color.CYAN.darker());
            }
        }
    }
    
    public void limpaCaminho(ActionEvent e){
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                if(((i+j)%2) == 0)
                {
                    quadrado[i][j].setBackground(Color.CYAN.brighter()); ///brighter() ///darker()
                }
                else
                {
                    quadrado[i][j].setBackground(Color.BLUE.brighter());
                }
            }
        }
    } 
}
