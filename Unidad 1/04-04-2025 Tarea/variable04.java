package condicinal;

import javax.swing.JOptionPane;

public class variable04 {

    public static void main(String[] args) {
        
        int N1 =  Integer.parseInt(JOptionPane.showInputDialog("ingrese el digito: "));

        if (N1 >0) {
            JOptionPane.showMessageDialog(null, N1+ ", es positivo");
        } else if (N1 < 0) {
            JOptionPane.showMessageDialog(null, N1+ ", es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "el numero es cero");
        }
    }
    
}
