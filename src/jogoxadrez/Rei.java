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
public class Rei extends Peca {

    public Rei(int cor) {
        super(cor);
    }
    
    @Override
    public boolean condMove(int deI, int deJ, int paraI, int paraJ){
        if(getCor()==0) //Rei Preto
        {
            ///////////////////////////////////////////////VERTICAL PARA CIMA/////////////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ) 
            {   
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
            ///////////////////////////////////////////////VERTICAL PARA BAIXO////////////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ) 
            {   
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
            ///////////////////////////////////////////////HORIZONTAL ESQUERDA/////////////////////////////////////////////////////////
            if(paraI==deI && paraJ==deJ-1) 
            {   
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
            ///////////////////////////////////////////////HORIZONTAL DIREITA/////////////////////////////////////////////////////////
            if(paraI==deI && paraJ==deJ+1) 
            {   
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
            //////////////////////////////////////////////DIAGONAL SUPERIOR ESQUERDA////////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ-1)
            {   
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
            //////////////////////////////////////////////DIAGONAL INFERIOR ESQUERDA////////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ-1)
            {   
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
            //////////////////////////////////////////////DIAGONAL SUPERIOR DIREITA////////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ+1)
            {   
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
            //////////////////////////////////////////////DIAGONAL INFERIOR DIREITA////////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ+1)
            {   
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
        else //Rei Branco
        {
            ///////////////////////////////////////////////VERTICAL PARA CIMA/////////////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ) 
            {   
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
            ///////////////////////////////////////////////VERTICAL PARA BAIXO////////////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ) 
            {   
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
            ////////////////////////////////////////////////HORIZONTAL ESQUERDA/////////////////////////////////////////////////////////
            if(paraI==deI && paraJ==deJ-1) 
            {   
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
            ////////////////////////////////////////////////HORIZONTAL DIREITA/////////////////////////////////////////////////////////
            if(paraI==deI && paraJ==deJ+1) 
            {   
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
            ////////////////////////////////////////////DIAGONAL SUPERIOR ESQUERDA//////////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ-1)
            {   
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
            ////////////////////////////////////////////DIAGONAL INFERIOR ESQUERDA//////////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ-1)
            {   
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
            ////////////////////////////////////////////DIAGONAL SUPERIOR DIREITA//////////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ+1)
            {   
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
            ////////////////////////////////////////////DIAGONAL INFERIOR DIREITA//////////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ+1)
            {   
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
        
        
        
