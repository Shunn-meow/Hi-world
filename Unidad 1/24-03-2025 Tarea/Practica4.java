import javax.swing.JOptionPane;

public class Practica4 {

    public static void main(String[] args) {

        double D;
        double T;

        D=Double.parseDouble(JOptionPane.showInputDialog("ingrese la Distancia: " ));
        T=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo:" ));

        Double VelocidadMedia = D/T;

        JOptionPane.showConfirmDialog(null,"La velocidsd media es:" +VelocidadMedia);

    }


    
}
