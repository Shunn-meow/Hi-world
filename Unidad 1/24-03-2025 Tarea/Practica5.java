import javax.swing.JOptionPane;

public class Practica5 {

    public static void main(String[] args) {
        
     double VA;
     double r;
     double n;

     VA=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor actual: "));
     r=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes: "));
     n=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo: "));

     Double VF= VA * (Math.pow(1+(r/100), n));

     JOptionPane.showConfirmDialog(null, "El monto final es: "+ VF);
    }
}