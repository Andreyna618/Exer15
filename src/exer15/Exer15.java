
package exer15;

import java.util.Scanner;

/**
Calculo do peso
 */
public class Exer15 {

    
    public static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        
        float peso;
        float acrescimo;
        float total;
        
        System.out.println("Digite o peso da pessoa em gramas");
        peso = Float.parseFloat(leia.nextLine());
        
        System.out.println("Digite o acrescimo do peso em porcentagem");
        acrescimo = Float.parseFloat(leia.nextLine());
        
        total = peso + (acrescimo/100 * peso);
        System.out.println("o peso total da pessoa é"+"="+ total);
        
    }
    
}
