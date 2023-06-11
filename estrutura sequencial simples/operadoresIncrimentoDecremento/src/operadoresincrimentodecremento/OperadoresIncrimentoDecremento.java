/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresincrimentodecremento;

/**
 *
 * @author diego
 */
public class OperadoresIncrimentoDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=10;
        int x=1;
        while (x<2) {
        System.out.println("1 - " + i++);
        System.out.println("2 - " + ++i);
        System.out.println("3 - " + --i);
        System.out.println("4 - " + i--);
        i-=x;
        System.out.println("5 - " + i);
        i+=x;
        System.out.println("6 - " + i);

        
        x++;
        }
        // TODO code application logic here
    }
    
}
