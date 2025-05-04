import javax.swing.JOptionPane;


public class PromedioV2 {

    public static void main(String[] args){
        Double N1;
        Double N2;
        Double N3;

        N1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el 1er número: "));
        N2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el 2do número: "));
        N3=Double.parseDouble(JOptionPane.showInputDialog("ingrese el 3er número: "));

        Double Promedio=(N1+N2+N3)/3;

        JOptionPane.showConfirmDialog(null, "El promedio es: "+Promedio);
        
        
        
    }
}   