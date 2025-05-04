import javax.swing.JOptionPane;

public class Practica2 {
    public static void main(String[] args) {

        double Precio;
        double Descuento;

        Precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
        Descuento=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento: "));

        Double PrecioFinal = (Precio - (Precio * (Descuento/100))); 

        JOptionPane.showConfirmDialog(null,"El precio final es: "+PrecioFinal);
    }
}