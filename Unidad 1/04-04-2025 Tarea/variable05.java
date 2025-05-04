package condicinal;

import javax.swing.JOptionPane;

public class variable05 {

     public static void main(String[] args) {
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad: "));

        if (edad >0 && edad <=12) {
            JOptionPane.showMessageDialog(null, "Es un niño");
        } else if (edad >=13 && edad <=19) {
            JOptionPane.showMessageDialog(null, "Es un adolescente");
        } else if (edad >= 20 && edad <= 59) {
            JOptionPane.showMessageDialog(null, "Es un adulto");
        } else if ( edad >=60 ) {
            JOptionPane.showMessageDialog(null, "Es un adulto 4mayor");
        }
     }
    
}
