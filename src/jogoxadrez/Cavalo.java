package jogoxadrez;

import static jogoxadrez.Tabuleiro.aux;


public class Cavalo extends Peca {

    public Cavalo(int cor) {
        super(cor);
    }
    
    @Override
    public boolean condMove(int deI, int deJ, int paraI, int paraJ){
        if(getCor()==0) //Cavalo Preto
        {
            ///////////////////////////////////////////HORIZONTAL ESQUERDA CIMA///////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ-2)  //os IFs abaixo fazema verificacao se o cavlo pode andar e se pode comer a peca
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
            ///////////////////////////////////////////HORIZONTAL ESQUERDA BAIXO///////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ-2)
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
            ///////////////////////////////////////////HORIZONTAL DIREITA CIMA///////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ+2)
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
            ///////////////////////////////////////////HORIZONTAL DIREITA BAIXO///////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ+2)
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
            ///////////////////////////////////////////VERTICAL CIMA ESQUERDO///////////////////////////////////////////////////
            if(paraI==deI-2 && paraJ==deJ-1)
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
            ///////////////////////////////////////////VERTICAL CIMA DIREITO///////////////////////////////////////////////////
            if(paraI==deI-2 && paraJ==deJ+1)
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
            ///////////////////////////////////////////VERTICAL BAIXO ESQUERDO///////////////////////////////////////////////////
            if(paraI==deI+2 && paraJ==deJ-1)
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
             ///////////////////////////////////////////VERTICAL BAIXO DIREITO///////////////////////////////////////////////////
            if(paraI==deI+2 && paraJ==deJ+1)
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
        else //Cavalo Branco
        {
            ///////////////////////////////////////////HORIZONTAL ESQUERDA CIMA///////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ-2)   //os IFs abaixo fazema verificacao se o cavlo pode andar e se pode comer a peca
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
            ///////////////////////////////////////////HORIZONTAL ESQUERDA BAIXO///////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ-2)
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
            ///////////////////////////////////////////HORIZONTAL DIREITA CIMA///////////////////////////////////////////////////
            if(paraI==deI-1 && paraJ==deJ+2)
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
            ///////////////////////////////////////////HORIZONTAL DIREITA BAIXO///////////////////////////////////////////////////
            if(paraI==deI+1 && paraJ==deJ+2)
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
            ///////////////////////////////////////////VERTICAL CIMA ESQUERDO///////////////////////////////////////////////////
            if(paraI==deI-2 && paraJ==deJ-1)
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
            ///////////////////////////////////////////VERTICAL CIMA DIREITO///////////////////////////////////////////////////
            if(paraI==deI-2 && paraJ==deJ+1)
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
            ///////////////////////////////////////////VERTICAL BAIXO ESQUERDO///////////////////////////////////////////////////
            if(paraI==deI+2 && paraJ==deJ-1)
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
            ///////////////////////////////////////////VERTICAL BAIXO DIREITO///////////////////////////////////////////////////
            if(paraI==deI+2 && paraJ==deJ+1)
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

