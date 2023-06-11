/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variavelescopo;

/**
 *
 * @author diego
 */
public class VariavelEscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        
        for (i=0;i<5;i++){
            j = i;
            System.out.println("Pre loop " + i + " e " + j);
        }
        System.out.println("Pos loop " + i + " e " + j);
    }
    
}
