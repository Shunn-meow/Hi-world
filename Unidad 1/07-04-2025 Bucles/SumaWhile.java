import javax.swing.JOptionPane;

public class SumaWhile {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingresae el numero: "));
        int i = n;
        while (i < n) {
            n += 1;
            
        }
        JOptionPane.showMessageDialog(null, "la suma es de i es "+ i +"es "+n);
    }
    
}
