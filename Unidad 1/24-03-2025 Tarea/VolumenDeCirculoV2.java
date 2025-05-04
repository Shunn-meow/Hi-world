import javax.swing.JOptionPane;

public class VolumenDeCirculoV2 {

    public static void main(String[] args) {

        double radio;

        radio=Double.parseDouble(JOptionPane.showInputDialog("ingresa el radio: "));
        double volumen = (4*Math.PI*radio)/3; 

        JOptionPane.showConfirmDialog(null, "El volumen es: "+volumen);
    }

    
}