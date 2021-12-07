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
public class Composicao {
    public static void main(String[] args) {
        
        Automovel carro = new Automovel();
        Automovel carro2 = new Automovel(1500,"Verde");
            //primeira forma
            Automovel uno = new Automovel();
            Automovel Golf = new Automovel (2000);
            
            //segunda forma 
            Automovel carro = new Automovel();
            carro.ligarPelaPrimeiraVez();
            carro.ligarPelaPrimeiraVez(1600);
            
            //terceira forma
            Automovel moto = new Automovel();
            Motor motor = new Motor();
            Motor motor2 = new Motor(1600);
            
            
            
    }        
}
