import javax.swing.JOptionPane;

public class Practica3 {
    public static void main(String[] args) {

        double m = Double.parseDouble(JOptionPane.showInputDialog("ingrese los minutos: "));

        int Horas = (int) (m/60);
        int Minutos = (int) (m % 60);

        JOptionPane.showConfirmDialog(null,"De: "+ m +"minutos, sonn "+Horas+"horas y"+ Minutos+"minutos");
    }
}