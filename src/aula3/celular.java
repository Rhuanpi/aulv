/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author tecsistem
 */
public class celular {
    
    public String cor;
    public String desligar;
    public int memoria;
    public String marca;
    public String Tamanho;

    @Override
    public String toString() {
        return "celular{" + "cor=" + cor + ", desligar=" + desligar + ", memoria=" + memoria + ", marca=" + marca + ", Tamanho=" + Tamanho + '}';
    }

   
    
    
    public void ligarcel(celular xx){
        if(memoria > 5){
            System.out.println("O celular tem uma boa memoria amigao laercio");
            
            
        }
         
    }

    public celular(String cor, String desligar, int memoria, String marca, String Tamanho) {
        this.cor = cor;
        this.desligar = desligar;
        this.memoria = memoria;
        this.marca = marca;
        this.Tamanho = Tamanho;
    }
    
}
