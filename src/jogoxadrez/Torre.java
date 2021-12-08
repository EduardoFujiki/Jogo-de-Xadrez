/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoxadrez;

import static jogoxadrez.Tabuleiro.aux;


/**
 *
 * @author Asus
 */
public class Torre extends Peca {

    public Torre(int cor) {
        super(cor);
    }
    
    @Override
    public boolean condMove(int deI, int deJ, int paraI, int paraJ ){
        int variacao_de_I = paraI - deI;
        int variacao_de_J = paraJ - deJ;
        if(getCor()==0) //Torre Preta
        {
           /////////////////////////////////////////////////VERTICAL PARA BAIXO/////////////////////////////////////////////////////////
            if(variacao_de_I>0 && paraJ == deJ) //verifica se pode movimentar na vertical para baixo
            {   
               for(int x=deI+1; x<paraI; x++)         //verificao se existe alguma peca no caminho da torre
               {                                       //caso houver, a torre nao pode fazer o movimento
                   if(aux[x][paraJ].getPeca()!=null)
                   {   
                       return false;
                   }
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta na posicao de destino da torre eh da 
               {                                      //mesma cor ou nao. Se for a torre nao come, caso nao for, a torre come
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;                                //se nao houver nenhuma peca no caminho a torre movimenta normal
            }
            /////////////////////////////////////////////////VERTICAL PARA CIMA/////////////////////////////////////////////////////////
            if(variacao_de_I<0 && paraJ == deJ)  //verifica se pode movimentar na vertical para Cima        
            {   
               for(int x=deI-1; x>paraI; x--)         //verificao se existe alguma peca no caminho da torre
               {                                       //caso houver, a torre nao pode fazer o movimento
                   if(aux[x][paraJ].getPeca()!=null)
                   {   
                       return false;
                   }
                   
               }
               if(aux[paraI][paraJ].getPeca()!=null)    //verifica se a peca que esta na posicao de destino da torre eh da 
               {                                        //mesma cor ou nao. Se for a torre nao come, caso nao for, a torre come
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                       else return false;
               }
               return true;
            }
            /////////////////////////////////////////////////HORIZONTAL PARA DIREITA/////////////////////////////////////////////////////////
            if(variacao_de_J>0 && paraI==deI) //movimento na horizontal direita
            {  
               for(int y=deJ+1; y<paraJ; y++)
               {
                   if(aux[paraI][y].getPeca()!=null)
                   {
                       return false;   
                   }
               }
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                       else return false;
               }
               return true;
            }
            /////////////////////////////////////////////////HORIZONTAL PARA ESQUERDO/////////////////////////////////////////////////////////
            if(variacao_de_J<0 && paraI==deI) 
            {  
               for(int y=deJ-1; y>paraJ; y--)
               {
                   if(aux[paraI][y].getPeca()!=null)
                   {
                       return false;   
                   }
               }
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
            }
         }
        else
        {
            /////////////////////////////////////////////////VERTICAL PARA CIMA/////////////////////////////////////////////////////////
            if(variacao_de_I>0 && paraJ == deJ) 
            {    
               for(int x=deI+1; x<paraI; x++)         //verificao se existe alguma peca no caminho da torre
               {                                       //caso houver, a torre nao pode fazer o movimento
                   if(aux[x][paraJ].getPeca()!=null)
                   {   
                       return false;
                   }
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta na posicao de destino da torre eh da 
               {                                      //mesma cor ou nao. Se for a torre nao come, caso nao for, a torre come
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;                                //se nao houver nenhuma peca no caminho a torre movimenta normal
            }
           /////////////////////////////////////////////////VERTICAL PARA CIMA/////////////////////////////////////////////////////////
            if(variacao_de_I<0 && paraJ == deJ)       
            {   
               for(int x=deI-1; x>paraI; x--)         //verificao se existe alguma peca no caminho da torre
               {                                       //caso houver, a torre nao pode fazer o movimento
                   if(aux[x][paraJ].getPeca()!=null)
                   {   
                       return false;
                   }
                   
               }
               if(aux[paraI][paraJ].getPeca()!=null)    //verifica se a peca que esta na posicao de destino da torre eh da 
               {                                        //mesma cor ou nao. Se for a torre nao come, caso nao for, a torre come
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
            }
           /////////////////////////////////////////////////HORIZONTAL PARA DIREITA/////////////////////////////////////////////////////////
            if(variacao_de_J>0 && paraI==deI) 
            {  
               for(int y=deJ+1; y<paraJ; y++)
               {
                   if(aux[paraI][y].getPeca()!=null)
                   {
                       return false;   
                   }
               }
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                       else return false;
               }
               return true;
            }
            /////////////////////////////////////////////////HORIZONTAL PARA ESQUERDA/////////////////////////////////////////////////////////
            if(variacao_de_J<0 && paraI==deI) 
            {  
               for(int y=deJ-1; y>paraJ; y--)
               {
                   if(aux[paraI][y].getPeca()!=null)
                   {
                       return false;   
                   }
               }
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                       else return false;
               }
               return true;
            }
        }
        return false;
        
    }
}
