/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicoserelacionais;

/**
 *
 * @author impdsede
 */
public class OperadoresLogicosERelacionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n1 = 4, n2 = 3;
        
        //Operador Ternário
        
        int opTer = (n1 > n2) ? n1 : n2;
        
        /*Operadores relacionais
        
        >   Maior
        <   Menor
        >=  Maior ou igual
        <=  Menor ou igual
        ==  Igual
        !=  Diferente

        System.out.println(opTer);
        */
        
        /*
        Operadores lógicos
        
        &&  E       true && false = false
        ||  OU      false || true = true
        ^   XOU     true ^ true = false
        !   NAO     ! false = true
        */
        int x, y, z;
        x = 21;
        y = 33;
        z = 46;
        
        boolean r;
        
        r = !(y < z) ? true : false;
        
        System.out.println(r);
    }
    
}
