package jogoxadrez;

import static jogoxadrez.Tabuleiro.aux;

public class Bispo extends Peca {

    public Bispo(int cor) {
        super(cor);
    }
    
    @Override
    public boolean condMove(int deI, int deJ, int paraI, int paraJ ){
        if(getCor()==0) //Bispo Preto
        {
           //valida as posicoes nas diagonais do bispo 
           ////////////////////////////////////////////MOVIMENTO DIAGONA INFERIOR DIREITA//////////////////////////////////////////////// 
           if(paraI==deI+1 && paraJ==deJ+1 || paraI==deI+2 && paraJ==deJ+2 || paraI==deI+3 && paraJ==deJ+3 || paraI==deI+4 && paraJ==deJ+4 ||
                   paraI==deI+5 && paraJ==deJ+5 || paraI==deI+6 && paraJ==deJ+6 || paraI==deI+7 && paraJ==deJ+7)
           {   
               int y=deJ+1;                        //verifica se o bispo pode movimentar para a diagonal inferior direita 
               for(int x=deI+1; x<paraI; x++)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y++;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
           ////////////////////////////////////////////MOVIMENTO DIAGONA SUPERIOR DIREITA////////////////////////////////////////////////
           if(paraI==deI-1 && paraJ==deJ+1 || paraI==deI-2 && paraJ==deJ+2 || paraI==deI-3 && paraJ==deJ+3 || paraI==deI-4 && paraJ==deJ+4 ||
                   paraI==deI-5 && paraJ==deJ+5 || paraI==deI-6 && paraJ==deJ+6 || paraI==deI-7 && paraJ==deJ+7)
           {   
               int y=deJ+1;                        //verifica se o bispo pode movimentar para a diagonal superior direita 
               for(int x=deI-1; x>paraI; x--)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y++;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
           ////////////////////////////////////////////MOVIMENTO DIAGONA SUPERIOR ESQUERDA////////////////////////////////////////////////
           if(paraI==deI-1 && paraJ==deJ-1 || paraI==deI-2 && paraJ==deJ-2 || paraI==deI-3 && paraJ==deJ-3 || paraI==deI-4 && paraJ==deJ-4 ||
                   paraI==deI-5 && paraJ==deJ-5 || paraI==deI-6 && paraJ==deJ-6 || paraI==deI-7 && paraJ==deJ-7)
           {   
               
               int y=deJ-1;                        //verifica se o bispo pode movimentar para a diagonal superior esquerda
               for(int x=deI-1; x>paraI; x--)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y--;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
           ////////////////////////////////////////////MOVIMENTO DIAGONA INFERIOR ESQUERDA////////////////////////////////////////////////
           if(paraI==deI+1 && paraJ==deJ-1 || paraI==deI+2 && paraJ==deJ-2 || paraI==deI+3 && paraJ==deJ-3 || paraI==deI+4 && paraJ==deJ-4 ||
                   paraI==deI+5 && paraJ==deJ-5 || paraI==deI+6 && paraJ==deJ-6 || paraI==deI+7 && paraJ==deJ-7)
           {   
               int y=deJ-1;                        //verifica se o bispo pode movimentar para a diagonal superior esquerda
               for(int x=deI+1; x<paraI; x++)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y--;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
        }
        else //Bispo Branco
        {
            //valida as posicoes nas diagonais do bispo 
           ////////////////////////////////////////////MOVIMENTO DIAGONA INFERIOR DIREITA//////////////////////////////////////////////// 
           if(paraI==deI+1 && paraJ==deJ+1 || paraI==deI+2 && paraJ==deJ+2 || paraI==deI+3 && paraJ==deJ+3 || paraI==deI+4 && paraJ==deJ+4 ||
                   paraI==deI+5 && paraJ==deJ+5 || paraI==deI+6 && paraJ==deJ+6 || paraI==deI+7 && paraJ==deJ+7)
           {   
               int y=deJ+1;                        //verifica se o bispo pode movimentar para a diagonal inferior direita 
               for(int x=deI+1; x<paraI; x++)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {  
                       return false;
                   }
                   y++;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
           ////////////////////////////////////////////MOVIMENTO DIAGONA SUPERIOR DIREITA////////////////////////////////////////////////
           if(paraI==deI-1 && paraJ==deJ+1 || paraI==deI-2 && paraJ==deJ+2 || paraI==deI-3 && paraJ==deJ+3 || paraI==deI-4 && paraJ==deJ+4 ||
                   paraI==deI-5 && paraJ==deJ+5 || paraI==deI-6 && paraJ==deJ+6 || paraI==deI-7 && paraJ==deJ+7)
           {   
               int y=deJ+1;                        //verifica se o bispo pode movimentar para a diagonal superior direita 
               for(int x=deI-1; x>paraI; x--)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y++;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
           ////////////////////////////////////////////MOVIMENTO DIAGONA SUPERIOR ESQUERDA////////////////////////////////////////////////
           if(paraI==deI-1 && paraJ==deJ-1 || paraI==deI-2 && paraJ==deJ-2 || paraI==deI-3 && paraJ==deJ-3 || paraI==deI-4 && paraJ==deJ-4 ||
                   paraI==deI-5 && paraJ==deJ-5 || paraI==deI-6 && paraJ==deJ-6 || paraI==deI-7 && paraJ==deJ-7)
           {   
               
               int y=deJ-1;                        //verifica se o bispo pode movimentar para a diagonal superior esquerda
               for(int x=deI-1; x>paraI; x--)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y--;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   {
                       return true;
                   }
                   else return false;
               }
               return true;
           }
           ////////////////////////////////////////////MOVIMENTO DIAGONA INFERIOR ESQUERDA////////////////////////////////////////////////
           if(paraI==deI+1 && paraJ==deJ-1 || paraI==deI+2 && paraJ==deJ-2 || paraI==deI+3 && paraJ==deJ-3 || paraI==deI+4 && paraJ==deJ-4 ||
                   paraI==deI+5 && paraJ==deJ-5 || paraI==deI+6 && paraJ==deJ-6 || paraI==deI+7 && paraJ==deJ-7)
           {   
               int y=deJ-1;                        //verifica se o bispo pode movimentar para a diagonal superior esquerda
               for(int x=deI+1; x<paraI; x++)      //verifica se ha alguma peca no meio do caminho do bispo
               {                                   //Se existir, o bispo nao faz o movimento, caso nao houver, ele movimenta
                   if(aux[x][y].getPeca()!=null)  
                   {   
                       return false;
                   }
                   y--;
               }
               if(aux[paraI][paraJ].getPeca()!=null)  //verifica se a peca que esta no destino do bispo é da mesma cor ou de diferente
               {                                      //se for retorna movimento invalido, se nao for ele come a peca 
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
