/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoxadrez;

/**
 *
 * @author Asus
 */
public abstract class Peca {
    private int cor; //corda da peca --->  0 = preto / 1 = branco
    //Tabuleiro quadrado[][];
    
    public Peca(int cor){
        this.cor = cor; 
    }
    
    public void setCor(int color){
        cor = color;
    }
    
    public int getCor(){
        return this.cor;
    }
    
    /*public void set(Tabuleiro trajeto[][]){
        quadrado[][]=trajeto[][];
    }*/
    
    public abstract boolean condMove(int deI, int deJ, int paraI, int paraJ);
    
   
}
