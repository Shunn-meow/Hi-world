import javax.swing.JOptionPane;

public class Practica1 {
    public static void main(String[] args) {

        double N1;
        double N2;
        Double N3;
        double N4;
        double N5;

        N1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1ra nota: "));
        N2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 2da nota: "));
        N3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 3ra nota: "));
        N4=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 4ta nota: "));
        N5=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 5ta nota: "));

        Double promedio = (N1+N2+N3+N4+N5)/5; 

        JOptionPane.showConfirmDialog(null,"el promdeio de ñlas notas es: "+promedio);
    }
}