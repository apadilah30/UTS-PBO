/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Acer
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bnk = new Bank();
        
        System.out.println("Selamat datang di bank ABC");
        bnk.getSaldo();
        bnk.simpanUang(500000);
        bnk.ambilUang(700000);
    }
    
}
