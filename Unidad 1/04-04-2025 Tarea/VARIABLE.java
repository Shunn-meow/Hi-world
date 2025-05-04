package condicinal;
import javax.swing.JOptionPane;;

public class VARIABLE {

    public static void main(String[] args) {
        
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrse el numero: "));

        if (Numero % 2 == 0) {

            JOptionPane.showMessageDialog(null, "es un numero par: ");
        }  else {
            JOptionPane.showMessageDialog(null, "es un numero impar: ");
        }

        
    }
}