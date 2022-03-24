/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_emilynn_elis;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercicio2_emilynn_elis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite um número: ");
            num = ent.nextDouble(); 
            
            if(num >= 0){
                soma = num + soma;
                cont++;
            }
        }
        
        while(num>=0);
        
        System.out.println("A soma é " + soma);
        System.out.println("A quantidade de números digitados foi " + cont);
        System.out.println("A média é " + soma / cont);
    }
}
