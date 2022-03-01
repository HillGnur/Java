/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author impdsede
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 21;
        String idadeTexto = Integer.toString(idade);
        
        System.out.println(idadeTexto);
        
        idade = Integer.parseInt(idadeTexto);
        
        System.out.println(idade);
    }
    
}
