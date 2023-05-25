/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica.pkg06.lp;

/**
 *
 * @author Juliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto p1= new Ponto(4, 5);
        Ponto p2= new Ponto(1,1);
         System.out.println("Resultado: "+ calculoDistancia(p1, p2));
                 
                 
    }
    
    public static float calculoDistancia(Ponto p1, Ponto p2){
            
        return (float) Math.sqrt((Math.pow(p2.getX()-p1.getX(),2)+ Math.pow (p2.getY()-p1.getY(),2)));        
     
    }
         
      
 }
  
