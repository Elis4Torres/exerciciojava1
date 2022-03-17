/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2java.emilynn_elis;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercicio2javaEmilynn_elis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int result;
        int i; 
      
    Scanner entrada = new Scanner(System.in);
   
        System.out.println("Digite um númeor inteiro positivo");
        num = entrada.nextInt();
        result = 0;
        i = 1;
            while(i<=num)
        {
            result = result + i;
            i++;
        }  
        
        System.out.printf("A soma dos %s primeiros números inteiros é resultante a %s \n", num,result);
    }
}


    

    
        
        