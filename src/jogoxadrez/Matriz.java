package jogoxadrez;

//////////Matriz auxiliar para ter controle da movimentacao das pecas no tabuleiro//////////////////
public class Matriz {
    Peca peca;

    public Matriz(Peca peca){ //construtor para iniciar as pecas como null, no caso onde nao tem pecas
        this.peca = peca;
    }
    
    public Matriz(Peca peca, int a){//construtor para setar os quadrados do tabuleiro com as pecas de xadrez
        this.peca = peca;
    }
    
    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }
    
    
    
    
    
}
