/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararstrings;

/**
 *
 * @author impdsede
 */
public class CompararStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Murilo";
        String nome2 = new String("Murilo");
        String res;
        /*
          Técnicamente, nome1 e nome2 possuem estruturas diferentes
          Para isso, usamos o método equals que verifica o valor da variável e do objeto, 
          esses por sua vez são iguais
        */
        // nome1 == nome2 --> diferente, ou false
        res = nome1.equals(nome2)? "Igual" : "diferente";
        System.out.println(res);
    }
    
}
