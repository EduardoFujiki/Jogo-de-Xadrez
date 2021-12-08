/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoxadrez;

import static jogoxadrez.Tabuleiro.aux;
/*
 * @author Asus
 */
public class Peao extends Peca {
    public boolean movido = false; //contador para verificas se o peao ja foi movido pela primeira vez. 0 se nao foi e 1 se foi
    public Peao(int cor) {
        super(cor);
    }
    //QUANDO O PEAO COME UMA PECA PARECE QUE RESETA O JOTA E ELE PODE PULAR QUANTAS CASAS QUISER ---> É PORQUE O CONTADOR NAO INCREMENTA
    //SE A PECA NUNCA FOI MOVIDA
    @Override                
    public boolean condMove(int deI, int deJ, int paraI, int paraJ ){
       if(getCor()==0) //Peao Preto
       {
           /////////////////////////////////////////////MOVIMENTO VERTICAL PARA BAIXO//////////////////////////////////////
           if(movido == false)
           {
              if(paraI==deI+1 && paraJ==deJ)
              {
                  if(aux[paraI][paraJ].getPeca()!=null)
                  {
                       return false;
                  }
                  
                  return true;
               }
               if(paraI==deI+2 && paraJ==deJ)
               {
                  if(aux[paraI-1][paraJ].getPeca()!=null)
                  {
                     return false;
                  }
                  if(aux[paraI][paraJ].getPeca()!=null)
                  {
                      return false;
                  }
                  
                  return true;
                }   
           }
           else
           {
               if(paraI==deI+1 && paraJ==deJ)
               {
                  if(aux[paraI][paraJ].getPeca()!=null)
                  {
                       return false;
                  }
                  return true;
               }
           }
           ////////////////////////////////////////////////////////COME PECA//////////////////////////////////////////////////
           if(paraI == deI+1 && paraJ == deJ-1)
           {
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   return true;
                   else return false;   
               }
               
           }
           if(paraI == deI+1 && paraJ == deJ+1)
           {
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   return true;
                   else return false;   
               }
           }
           
       }
       else //Peao Preto
       {
           /////////////////////////////////////////////MOVIMENTO VERTICAL PARA CIMA////////////////////////////////////// 
           if(movido == false)
           {
              if(paraI==deI-1 && paraJ==deJ)
              {
                  if(aux[paraI][paraJ].getPeca()!=null)
                  {
                       return false;
                  }
                  
                  return true;
               }
               if(paraI==deI-2 && paraJ==deJ)
               {
                  if(aux[paraI+1][paraJ].getPeca()!=null)
                  {
                     return false;
                  }
                  if(aux[paraI][paraJ].getPeca()!=null)
                  {
                      return false;
                  }
                  
                  return true;
                }   
           }
           else
           {
               if(paraI==deI-1 && paraJ==deJ)
               {
                  if(aux[paraI][paraJ].getPeca()!=null)
                  {
                       return false;
                  }
                  return true;
               }
           }
           ////////////////////////////////////////////////////////COME PECA//////////////////////////////////////////////////
           if(paraI == deI-1 && paraJ == deJ-1)
           {
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   return true;
                   else return false;   
               }
               
           }
           if(paraI == deI-1 && paraJ == deJ+1)
           {
               if(aux[paraI][paraJ].getPeca()!=null)
               {
                   if(aux[deI][deJ].getPeca().getCor()!=aux[paraI][paraJ].getPeca().getCor())
                   return true;
                   else return false;   
               }
           }
       }
       return false; 
    }
}
       


   
          
 
      
        
            
          
