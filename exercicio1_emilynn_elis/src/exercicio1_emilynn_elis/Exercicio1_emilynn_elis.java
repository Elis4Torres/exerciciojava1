/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_emilynn_elis;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercicio1_emilynn_elis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        um();
              
    }
    
    public static void extenso(String a, int b) {
    
    String[][] unidade={
    {"dez", "zero","",""},
    {"onze", "um","cento"},
    {"doze", "dois","vinte","duzentos"},
    {"treze", "três","trinta","trezentos"},
    {"quatorze", "quatro","quarenta","quatrocentos"},
    {"quinze", "cinco","cinquenta","quinhentos"},
    {"dezesseis", "seis","sessenta","seiscentos"},
    {"dezessete", "sete","setenta","setecentos"},
    {"dezoito", "oito","oitenta","oitocentos"},
    {"dezenove", "nove","noventa","novecentos"},
    };
    
        System.out.print(unidade[ Integer.parseInt])
    }
      Sistema . fora . print(unidade[ Integer . parseInt((a)) ][b]);
    }
    public  static  void  entrada (){
        Scanner ent =  novo  Scanner ( System . in);
        Sistema . saida . println( " Digite um número " );
        String num = ent . próximaLinha();
        ent . Fechar();
        String cent =  " " ,
                dez =  " " ,
                unid =  " " ;

        unid += num . charAt(num . comprimento() -  1 );

        if (num . comprimento() >  2 ){
            cent += num . charAt( num . comprimento() -  3 );
            if (num . charAt( num . length() -  3 ) !=  ' 0 ' ){
                extenso(cent, 3 );
                Sistema . saida . print( " e " );

            }
        }
        if (num . comprimento() >  1 ){
            dez += num . charAt( num . comprimento() -  2 );
            if (num . charAt( num . length() -  2 ) !=  ' 0 ' ) {
                if (num . charAt( num . length() -  2 ) ==  ' 1 ' )
                    extenso(unid 0 );
                senão {
    
                    extenso(dez, 2 );
                    Sistema . saida . print( " e " );
                }
            }
        }
        tente {
            if (num . charAt( num . length() -  2 ) !=  ' 1 ' )
            extenso(unid, 1 );
        } catch ( Exceção e) {
            extenso(unid, 1 );
        }
        
    }

