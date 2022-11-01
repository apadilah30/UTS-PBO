/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Acer
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(var counter = 1; counter <= 100; counter++){
          if(counter % 2 != 0){
            continue;
          }

          System.out.println("Perulangan genap " + counter);
        }
    }
    
}
