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
public class Bicicleta {
    
  public String marca;
  public int arp;
  public int qtdmarchas;
  public int marchatual;
  public int cor;
  
  public void passarmarcha(Bicicleta monark){
      if (monark.marchatual < qtdmarchas){
          monark.marchatual += 1;
      }
      
  }
  public void voltamarcha(Bicicleta monark){
      if(monark.marchatual > 1){
          monark.marchatual -= 1;
          
      }
    }
}
