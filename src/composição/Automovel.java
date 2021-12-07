/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composição;

/**
 *
 * @author IFSC
 */
public class Automovel {
    Motor motor;
    Direcao direcao;
    
    
    
    public void ligarPelaPrimeiraVez(){
        motor = new Motor();
       
    }
    
    public void ligarPelaPrimeiraVez(int potencia, String cor){
            motor = new Motor(potencia);
            
    }
    
    public Automovel(){
        motor = new Motor();
        direcao = new Direcao();
    }
    
    public Automovel(int potencia, String cor){
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
        
    }
}
