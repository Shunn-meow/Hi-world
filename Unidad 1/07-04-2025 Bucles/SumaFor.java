import javax.swing.JOptionPane;

public class SumaFor {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrse el numero: "));
        int sumatotal = 0;

        for (int i = 1; i <= numero; i++) {
            sumatotal +=  i;
        }
        JOptionPane.showMessageDialog(null, "suma de los numeros de 1 al "+numero+ " es: "+sumatotal);
            
        
    }
    
}
