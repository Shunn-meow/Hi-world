import javax.swing.JOptionPane;
    
public class Suma {
     
    public static void main(String[] args){
        double a;
        double b;
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el 1er dato: "));
        a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el 2do dato: "));

        double resultado=(a+b);
            
        JOptionPane.showConfirmDialog(null, "El resultdo es: "+resultado);
        }        
        
}     
         