import javax.swing.JOptionPane;


public class AreaTrianguloV2 {

    public static void main(String[] args){
        int b;
        int h;
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base: "));
        h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: "));

        int area=(b*h)/2;

        JOptionPane.showConfirmDialog(null, "El area es: "+area);
        
        
        
    }
}   