import javax.swing.JOptionPane;

public class ejercicio09 {

    
public static void main(String[] args) {
    
    double a = 1;
    double b = 3;
    double c = 5;
    double x = ((a+b+c)*b)/c;
    double y = ((a+b)*c)/b;
    double z = ((x+y+c)*(x+y))%2;
    double  resultado = z;

    JOptionPane.showMessageDialog(null, resultado);
}
}