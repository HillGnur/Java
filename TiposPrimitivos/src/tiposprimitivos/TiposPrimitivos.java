/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Murilo Melo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Digite abaixo o nome do aluno:");
        String alunoA = teclado.nextLine();
        //String alunoB = "Lucas Pinheiro";
        System.out.println("Digite abaixo a nota do aluno (ex.: 6,4):");
        float notaA = teclado.nextFloat();
        //float notaB = (float) 9.7;
        /*
        System.out.println("A nota A é: " + notaA);
        System.out.println("A nota B é: " + notaB);
        */
        System.out.printf("A nota é:\n%s %.1f\n", alunoA, notaA);
        //System.out.format("As notas são:\n%s %.1f\n%s %.1f\n", alunoA, notaA, alunoB, notaB);
        
        
    }
    
}
