import javax.swing.JOptionPane;

public class AreaRectanguloV2 {

    public static void main(String[] args){
        Double b;
        Double h;
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base: "));
        h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));

        Double area=(b*h);

        JOptionPane.showConfirmDialog(null, "El area es: "+area);
        
        
        
    }
}   