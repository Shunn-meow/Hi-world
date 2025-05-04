package condicinal;

import javax.swing.JOptionPane;

public class Variable02 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero. "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero. "));

        if (numero>numero2) {
            JOptionPane.showMessageDialog(null, "el mayor es: "+ numero);
        } else if ( numero < numero2) {
            JOptionPane.showMessageDialog(null, "el mayor e: "+numero2);
        } else {
            JOptionPane.showMessageDialog(null, "los numeros son iguales: ");
        }
    }
    
}
