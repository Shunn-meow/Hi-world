//comparacion de numeros
import javax.swing.JOptionPane;

public class ejercicio01 { 

    public static void main(String[] args) {

        int N1 = Integer.parseInt(JOptionPane.showInputDialog("ingrsee el 1er numero: "));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog("ingrsee el 1er numero: "));
        
        if (N1>N2) {
            JOptionPane.showMessageDialog(null, "el mayor es: "+N1); 
        } else if (N1<N2) {
            JOptionPane.showMessageDialog(null, "el mayor es: "+N2);
        } else {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales: ");
        }
           
    }
}